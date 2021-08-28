// Generated from C:/Users/Xiaomi/Desktop/Learning/Курсовой проект 3/Никольский_Владислав_БПИ185_Курсовой_проект_3_курс/Программа/WCPSServer/src/main/java/antlr\WCPS.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link WCPSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface WCPSVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link WCPSParser#processCoveragesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcessCoveragesExpr(WCPSParser.ProcessCoveragesExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#coverageNamesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverageNamesDefinition(WCPSParser.CoverageNamesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#coverageNameDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverageNameDefinition(WCPSParser.CoverageNameDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#reductCoverageNamesDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReductCoverageNamesDefinition(WCPSParser.ReductCoverageNamesDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#reductCoverageNameDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReductCoverageNameDefinition(WCPSParser.ReductCoverageNameDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#coverageList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverageList(WCPSParser.CoverageListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#coverageName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoverageName(WCPSParser.CoverageNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#wherePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWherePart(WCPSParser.WherePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#returnPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnPart(WCPSParser.ReturnPartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryPlusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryPlusExp(WCPSParser.UnaryPlusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hardConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardConstructorExp(WCPSParser.HardConstructorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldExp(WCPSParser.FieldExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchExp(WCPSParser.SwitchExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(WCPSParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExp(WCPSParser.CastExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompExp(WCPSParser.CompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(WCPSParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(WCPSParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunExp(WCPSParser.FunExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimExp(WCPSParser.TrimExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExp(WCPSParser.AtomExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryMinusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusExp(WCPSParser.UnaryMinusExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condenseExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondenseExp(WCPSParser.CondenseExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXorExp(WCPSParser.XorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExp(WCPSParser.MultExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lightConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLightConstructorExp(WCPSParser.LightConstructorExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisExp(WCPSParser.ParenthesisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryNotExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryNotExp(WCPSParser.UnaryNotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#funList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunList(WCPSParser.FunListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#funListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunListElement(WCPSParser.FunListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#nameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameList(WCPSParser.NameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#crsList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCrsList(WCPSParser.CrsListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#lightConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLightConstructor(WCPSParser.LightConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#hardConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardConstructor(WCPSParser.HardConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constructorCoverage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCoverage(WCPSParser.ConstructorCoverageContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constructorOver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorOver(WCPSParser.ConstructorOverContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constructorValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorValues(WCPSParser.ConstructorValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constructorValueElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorValueElement(WCPSParser.ConstructorValueElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#axisIteratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxisIteratorList(WCPSParser.AxisIteratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#axisIterator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxisIterator(WCPSParser.AxisIteratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constructorElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorElement(WCPSParser.ConstructorElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#caseExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExp(WCPSParser.CaseExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#defaultExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultExp(WCPSParser.DefaultExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#condensePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondensePart(WCPSParser.CondensePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#condenseOver}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondenseOver(WCPSParser.CondenseOverContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#condenseWhere}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondenseWhere(WCPSParser.CondenseWhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#condenseUsing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondenseUsing(WCPSParser.CondenseUsingContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#dimensionIntervalList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionIntervalList(WCPSParser.DimensionIntervalListContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#dimensionPointElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionPointElement(WCPSParser.DimensionPointElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#dimensionIntervalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionIntervalElement(WCPSParser.DimensionIntervalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#dimensionIntervalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionIntervalExpr(WCPSParser.DimensionIntervalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(WCPSParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#multOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOp(WCPSParser.MultOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(WCPSParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(WCPSParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#condenseOpType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondenseOpType(WCPSParser.CondenseOpTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#rangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(WCPSParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#complexConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexConstant(WCPSParser.ComplexConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#booleanConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanConstant(WCPSParser.BooleanConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#integerConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerConstant(WCPSParser.IntegerConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#floatConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatConstant(WCPSParser.FloatConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link WCPSParser#stringConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringConstant(WCPSParser.StringConstantContext ctx);
}