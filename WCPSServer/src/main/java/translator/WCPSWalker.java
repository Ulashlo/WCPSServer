package translator;

import antlr.WCPSBaseVisitor;
import antlr.WCPSParser;
import java.util.List;
import java.util.Locale;

public class WCPSWalker extends WCPSBaseVisitor<String> {
    private RequestExecutor re;

    public WCPSWalker(RequestExecutor re) {
        this.re = re;
    }

    @Override
    public String visitCoverageNameDefinition(WCPSParser.CoverageNameDefinitionContext ctx) {
        if(ctx.coverageList().NAME().size() == 0){
            throw new IllegalArgumentException("Write name of coverage!");
        }
        if(ctx.coverageName() == null){
            throw new IllegalArgumentException("Write name of iterator!");
        }
        String[] names = new String[ctx.coverageList().NAME().size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = ctx.coverageList().NAME(i).getText();
        }
        re.addCoverageIterator(ctx.coverageName().getText(), names);
        return visitChildren(ctx);
    }

    @Override
    public String visitProcessCoveragesExpr(WCPSParser.ProcessCoveragesExprContext ctx) {
        String letString = "";
        if(ctx.reductCoverageNamesDefinition() != null){
            letString += "\t";
            for(WCPSParser.ReductCoverageNameDefinitionContext c :ctx.reductCoverageNamesDefinition().reductCoverageNameDefinition()){
                letString += "Coverage " +  c.coverageName().getText() + " = " + visit(c.express()) + ";\n";
            }
        }
        String whereScript = "";
        if(ctx.coverageNamesDefinition() != null){
            visit(ctx.coverageNamesDefinition());
        }else {
            throw new IllegalArgumentException("Write a for part!");
        }
        if(ctx.wherePart() != null){
            whereScript = visit(ctx.wherePart()) + "\t";
        }else {
            whereScript = "_\t";
        }
        if(ctx.returnPart() != null){
            return whereScript + visit(ctx.returnPart()) + letString;
        }else {
            throw new IllegalArgumentException("Write a return part!");
        }
    }

    @Override
    public String visitWherePart(WCPSParser.WherePartContext ctx) {
        if(ctx.express() != null){
            return visit(ctx.express());
        } else {
            throw new IllegalArgumentException("Write a content in where part!");
        }
    }

    @Override
    public String visitSwitchExp(WCPSParser.SwitchExpContext ctx) {
        List<WCPSParser.CaseExpContext> cases =  ctx.caseExp();
        WCPSParser.DefaultExpContext def = ctx.defaultExp();
        String exp = "";
        if(def != null){
            exp += visit(def.express());
        } else {
            exp += "null";
        }
        for(WCPSParser.CaseExpContext c : cases){
            exp += ", new Object[]{ " + visit(c.express(0)) + ", " + visit(c.express(1)) + "}";
        }
        return "calc.switchOp(" + exp + ")";
    }

    @Override
    public String visitLightConstructorExp(WCPSParser.LightConstructorExpContext ctx) {
        List<WCPSParser.ConstructorElementContext> mas = ctx.lightConstructor().constructorElement();
        String res = visit(mas.get(0).express());
        for(int i = 1; i < mas.size(); i++){
            res += ", " + visit(mas.get(i).express());
        }
        return "new double[] {" + res + "}";
    }

    @Override
    public String visitTrimExp(WCPSParser.TrimExpContext ctx) {
        if(ctx.coverageName() != null){
            throw new NotImplementedException("This type of trim operation is not supported!");
        }
        List<WCPSParser.DimensionIntervalElementContext> intervals = ctx.dimensionIntervalList().dimensionIntervalElement();
        String x0 = "", xL = "", y0 = "", yL = "", b0 = "", bL = "";
        for(WCPSParser.DimensionIntervalElementContext inter : intervals){
            if(inter.NAME(1) != null){
                throw new NotImplementedException("CRS is not supported!");
            }
            if(inter.NAME(0).getText().toLowerCase(Locale.ROOT).equals("x")){
                List<WCPSParser.ExpressContext> mas = inter.dimensionIntervalExpr().express();
                if(mas.size() == 2){
                    x0 = visit(mas.get(0));
                    xL = visit(mas.get(1));
                }else {
                    x0 = visit(mas.get(0));
                    xL = visit(mas.get(0));
                }
            } else if(inter.NAME(0).getText().toLowerCase(Locale.ROOT).equals("y")){
                List<WCPSParser.ExpressContext> mas = inter.dimensionIntervalExpr().express();
                if(mas.size() == 2){
                    y0 = visit(mas.get(0));
                    yL = visit(mas.get(1));
                }else {
                    y0 = visit(mas.get(0));
                    yL = visit(mas.get(0));
                }
            } else if(inter.NAME(0).getText().toLowerCase(Locale.ROOT).equals("layer")){
                List<WCPSParser.ExpressContext> mas = inter.dimensionIntervalExpr().express();
                if(mas.size() == 2){
                    b0 = visit(mas.get(0));
                    bL = visit(mas.get(1));
                }else {
                    b0 = visit(mas.get(0));
                    bL = visit(mas.get(0));
                }
            } else {
                throw new IllegalArgumentException("Coverage doesn't have " + inter.NAME(0).getText() + " axis!");
            }
        }
        String params = "";
        if(x0.equals("")){
            x0 = "0";
        }
        if(y0.equals("")){
            y0 = "0";
        }
        if(b0.equals("")){
            b0 = "0";
        }
        if(xL.equals("")){
            xL = "Integer.MAX_VALUE";
        }
        if(yL.equals("")){
            yL = "Integer.MAX_VALUE";
        }
        if(bL.equals("")){
            bL = "Integer.MAX_VALUE";
        }
        return "calc.trim(" + visit(ctx.express()) + ", " + x0 + ", " + y0 + ", " + xL + ", " + yL + ", " + b0 + ", " + bL + ")";
    }

    @Override
    public String visitUnaryNotExp(WCPSParser.UnaryNotExpContext ctx) {
        return "calc.not(" + visit(ctx.express()) + ")";
    }

    @Override
    public String visitAndExp(WCPSParser.AndExpContext ctx) {
        return "calc.and(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
    }

    @Override
    public String visitOrExp(WCPSParser.OrExpContext ctx) {
        return "calc.or(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
    }

    @Override
    public String visitXorExp(WCPSParser.XorExpContext ctx) {
        return "calc.xor(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
    }

    @Override
    public String visitCompExp(WCPSParser.CompExpContext ctx) {
        switch (ctx.compOp().getText()){
            case "=": return "calc.equal(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            case "!=": return "calc.notEqual(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            case "<": return "calc.lessThen(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            case ">": return "calc.moreThen(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            case "<=": return "calc.lessEqual(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            case ">=": return "calc.moreEqual(" + visit(ctx.express(0)) + ", " + visit(ctx.express(1)) + ")";
            default: throw new NotImplementedException("Operation " + ctx.compOp().getText() + " is not supported!");
        }
    }

    @Override
    public String visitCastExp(WCPSParser.CastExpContext ctx){
        switch (ctx.rangeType().getText()){
            case "char":
            case "unsignedchar": return "calc.charCast(" + visit(ctx.express()) + ")";
            case "short": return "calc.shortCast(" + visit(ctx.express()) + ")";
            case "unsignedshort": return "calc.unsignedShortCast(" + visit(ctx.express()) + ")";
            case "int": return "calc.intCast(" + visit(ctx.express()) + ")";
            case "unsignedint": return "calc.unsignedIntCast(" + visit(ctx.express()) + ")";
            case "float": return "calc.floatCast(" + visit(ctx.express()) + ")";
            case "double": return "calc.doubleCast(" + visit(ctx.express()) + ")";
            default: throw new NotImplementedException(ctx.rangeType().getText() + " type is not supported!");
        }
    }

    @Override
    public String visitFunExp(WCPSParser.FunExpContext ctx) {
        if(ctx.NAME().getText().equals("notEqual")){
            if(ctx.funList().express().size() != 2){
                throw new IllegalArgumentException("notEqual should has 2 arguments!");
            }
            return "calc.notEqual2(" + visit(ctx.funList().express(0)) + ", " + visit(ctx.funList().express(1)) + ")";
        }else if(ctx.NAME().getText().equals("equal")){
            if(ctx.funList().express().size() != 2){
                throw new IllegalArgumentException("equal should has 2 arguments!");
            }
            return "calc.equal2(" + visit(ctx.funList().express(0)) + ", " + visit(ctx.funList().express(1)) + ")";
        } else if(ctx.NAME().getText().equals("encode")){
            if(ctx.funList().express().size() != 2){
                throw new IllegalArgumentException("encode should has 2 arguments!");
            }
            return "calc.encode(" + visit(ctx.funList().express(0)) + ", " + visit(ctx.funList().express(1)) + ")";
        } else {
            if(ctx.funList().express().size() != 1){
                throw new IllegalArgumentException(ctx.NAME().getText() + " should has 1 arguments!");
            }
            return "calc." + ctx.NAME().getText() + "(" + visit(ctx.funList().express(0)) + ")";
        }
    }

    @Override
    public String visitUnaryMinusExp(WCPSParser.UnaryMinusExpContext ctx) {
        return "calc.unaryMinus(" + visit(ctx.express()) + ")";
    }

    @Override
    public String visitUnaryPlusExp(WCPSParser.UnaryPlusExpContext ctx) {
        return visit(ctx.express());
    }

    @Override
    public String visitAddExp(WCPSParser.AddExpContext ctx) {
        if(ctx.addOp().getText().equals("+")){
            return "calc.sum(" + visit(ctx.express(0)) + ", " +  visit(ctx.express(1)) + ")";
        }else {
            return "calc.minus(" + visit(ctx.express(0)) + ", " +  visit(ctx.express(1)) + ")";
        }
    }

    @Override
    public String visitMultExp(WCPSParser.MultExpContext ctx) {
        if(ctx.multOp().getText().equals("*")){
            return "calc.mult(" + visit(ctx.express(0)) + ", " +  visit(ctx.express(1)) + ")";
        }else {
            return "calc.div(" + visit(ctx.express(0)) + ", " +  visit(ctx.express(1)) + ")";
        }
    }

    @Override
    public String visitParenthesisExp(WCPSParser.ParenthesisExpContext ctx) {
        return "(" + visit(ctx.express()) + ")";
    }


    @Override
    public String visitCoverageName(WCPSParser.CoverageNameContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitBooleanConstant(WCPSParser.BooleanConstantContext ctx) {
        return ctx.getText().toLowerCase(Locale.ROOT);
    }

    @Override
    public String visitIntegerConstant(WCPSParser.IntegerConstantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitComplexConstant(WCPSParser.ComplexConstantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFloatConstant(WCPSParser.FloatConstantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitStringConstant(WCPSParser.StringConstantContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFieldExp(WCPSParser.FieldExpContext ctx) {
        throw new NotImplementedException("Field expressions is not supported!");
    }

    @Override
    public String visitCondenseExp(WCPSParser.CondenseExpContext ctx) {
        throw new NotImplementedException("Condense expressions is not supported!");
    }

    @Override
    public String visitHardConstructor(WCPSParser.HardConstructorContext ctx) {
        throw new NotImplementedException("Hard constructor is not supported!");
    }
}
