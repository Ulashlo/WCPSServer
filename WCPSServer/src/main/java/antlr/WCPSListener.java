// Generated from C:/Users/Xiaomi/Desktop/Learning/Курсовой проект 3/Никольский_Владислав_БПИ185_Курсовой_проект_3_курс/Программа/WCPSServer/src/main/java/antlr\WCPS.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link WCPSParser}.
 */
public interface WCPSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link WCPSParser#processCoveragesExpr}.
	 * @param ctx the parse tree
	 */
	void enterProcessCoveragesExpr(WCPSParser.ProcessCoveragesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#processCoveragesExpr}.
	 * @param ctx the parse tree
	 */
	void exitProcessCoveragesExpr(WCPSParser.ProcessCoveragesExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#coverageNamesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCoverageNamesDefinition(WCPSParser.CoverageNamesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#coverageNamesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCoverageNamesDefinition(WCPSParser.CoverageNamesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#coverageNameDefinition}.
	 * @param ctx the parse tree
	 */
	void enterCoverageNameDefinition(WCPSParser.CoverageNameDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#coverageNameDefinition}.
	 * @param ctx the parse tree
	 */
	void exitCoverageNameDefinition(WCPSParser.CoverageNameDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#reductCoverageNamesDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReductCoverageNamesDefinition(WCPSParser.ReductCoverageNamesDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#reductCoverageNamesDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReductCoverageNamesDefinition(WCPSParser.ReductCoverageNamesDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#reductCoverageNameDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReductCoverageNameDefinition(WCPSParser.ReductCoverageNameDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#reductCoverageNameDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReductCoverageNameDefinition(WCPSParser.ReductCoverageNameDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#coverageList}.
	 * @param ctx the parse tree
	 */
	void enterCoverageList(WCPSParser.CoverageListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#coverageList}.
	 * @param ctx the parse tree
	 */
	void exitCoverageList(WCPSParser.CoverageListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#coverageName}.
	 * @param ctx the parse tree
	 */
	void enterCoverageName(WCPSParser.CoverageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#coverageName}.
	 * @param ctx the parse tree
	 */
	void exitCoverageName(WCPSParser.CoverageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#wherePart}.
	 * @param ctx the parse tree
	 */
	void enterWherePart(WCPSParser.WherePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#wherePart}.
	 * @param ctx the parse tree
	 */
	void exitWherePart(WCPSParser.WherePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#returnPart}.
	 * @param ctx the parse tree
	 */
	void enterReturnPart(WCPSParser.ReturnPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#returnPart}.
	 * @param ctx the parse tree
	 */
	void exitReturnPart(WCPSParser.ReturnPartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryPlusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterUnaryPlusExp(WCPSParser.UnaryPlusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryPlusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitUnaryPlusExp(WCPSParser.UnaryPlusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hardConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterHardConstructorExp(WCPSParser.HardConstructorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hardConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitHardConstructorExp(WCPSParser.HardConstructorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterFieldExp(WCPSParser.FieldExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitFieldExp(WCPSParser.FieldExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterSwitchExp(WCPSParser.SwitchExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitSwitchExp(WCPSParser.SwitchExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(WCPSParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(WCPSParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterCastExp(WCPSParser.CastExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitCastExp(WCPSParser.CastExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterCompExp(WCPSParser.CompExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitCompExp(WCPSParser.CompExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(WCPSParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(WCPSParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(WCPSParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(WCPSParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterFunExp(WCPSParser.FunExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitFunExp(WCPSParser.FunExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterTrimExp(WCPSParser.TrimExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitTrimExp(WCPSParser.TrimExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterAtomExp(WCPSParser.AtomExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitAtomExp(WCPSParser.AtomExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExp(WCPSParser.UnaryMinusExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExp(WCPSParser.UnaryMinusExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condenseExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterCondenseExp(WCPSParser.CondenseExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condenseExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitCondenseExp(WCPSParser.CondenseExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterXorExp(WCPSParser.XorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code xorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitXorExp(WCPSParser.XorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterMultExp(WCPSParser.MultExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitMultExp(WCPSParser.MultExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lightConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterLightConstructorExp(WCPSParser.LightConstructorExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lightConstructorExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitLightConstructorExp(WCPSParser.LightConstructorExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExp(WCPSParser.ParenthesisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExp(WCPSParser.ParenthesisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryNotExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void enterUnaryNotExp(WCPSParser.UnaryNotExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryNotExp}
	 * labeled alternative in {@link WCPSParser#express}.
	 * @param ctx the parse tree
	 */
	void exitUnaryNotExp(WCPSParser.UnaryNotExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#funList}.
	 * @param ctx the parse tree
	 */
	void enterFunList(WCPSParser.FunListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#funList}.
	 * @param ctx the parse tree
	 */
	void exitFunList(WCPSParser.FunListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#funListElement}.
	 * @param ctx the parse tree
	 */
	void enterFunListElement(WCPSParser.FunListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#funListElement}.
	 * @param ctx the parse tree
	 */
	void exitFunListElement(WCPSParser.FunListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#nameList}.
	 * @param ctx the parse tree
	 */
	void enterNameList(WCPSParser.NameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#nameList}.
	 * @param ctx the parse tree
	 */
	void exitNameList(WCPSParser.NameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#crsList}.
	 * @param ctx the parse tree
	 */
	void enterCrsList(WCPSParser.CrsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#crsList}.
	 * @param ctx the parse tree
	 */
	void exitCrsList(WCPSParser.CrsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#lightConstructor}.
	 * @param ctx the parse tree
	 */
	void enterLightConstructor(WCPSParser.LightConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#lightConstructor}.
	 * @param ctx the parse tree
	 */
	void exitLightConstructor(WCPSParser.LightConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#hardConstructor}.
	 * @param ctx the parse tree
	 */
	void enterHardConstructor(WCPSParser.HardConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#hardConstructor}.
	 * @param ctx the parse tree
	 */
	void exitHardConstructor(WCPSParser.HardConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constructorCoverage}.
	 * @param ctx the parse tree
	 */
	void enterConstructorCoverage(WCPSParser.ConstructorCoverageContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constructorCoverage}.
	 * @param ctx the parse tree
	 */
	void exitConstructorCoverage(WCPSParser.ConstructorCoverageContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constructorOver}.
	 * @param ctx the parse tree
	 */
	void enterConstructorOver(WCPSParser.ConstructorOverContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constructorOver}.
	 * @param ctx the parse tree
	 */
	void exitConstructorOver(WCPSParser.ConstructorOverContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constructorValues}.
	 * @param ctx the parse tree
	 */
	void enterConstructorValues(WCPSParser.ConstructorValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constructorValues}.
	 * @param ctx the parse tree
	 */
	void exitConstructorValues(WCPSParser.ConstructorValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constructorValueElement}.
	 * @param ctx the parse tree
	 */
	void enterConstructorValueElement(WCPSParser.ConstructorValueElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constructorValueElement}.
	 * @param ctx the parse tree
	 */
	void exitConstructorValueElement(WCPSParser.ConstructorValueElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#axisIteratorList}.
	 * @param ctx the parse tree
	 */
	void enterAxisIteratorList(WCPSParser.AxisIteratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#axisIteratorList}.
	 * @param ctx the parse tree
	 */
	void exitAxisIteratorList(WCPSParser.AxisIteratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#axisIterator}.
	 * @param ctx the parse tree
	 */
	void enterAxisIterator(WCPSParser.AxisIteratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#axisIterator}.
	 * @param ctx the parse tree
	 */
	void exitAxisIterator(WCPSParser.AxisIteratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constructorElement}.
	 * @param ctx the parse tree
	 */
	void enterConstructorElement(WCPSParser.ConstructorElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constructorElement}.
	 * @param ctx the parse tree
	 */
	void exitConstructorElement(WCPSParser.ConstructorElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#caseExp}.
	 * @param ctx the parse tree
	 */
	void enterCaseExp(WCPSParser.CaseExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#caseExp}.
	 * @param ctx the parse tree
	 */
	void exitCaseExp(WCPSParser.CaseExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#defaultExp}.
	 * @param ctx the parse tree
	 */
	void enterDefaultExp(WCPSParser.DefaultExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#defaultExp}.
	 * @param ctx the parse tree
	 */
	void exitDefaultExp(WCPSParser.DefaultExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#condensePart}.
	 * @param ctx the parse tree
	 */
	void enterCondensePart(WCPSParser.CondensePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#condensePart}.
	 * @param ctx the parse tree
	 */
	void exitCondensePart(WCPSParser.CondensePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#condenseOver}.
	 * @param ctx the parse tree
	 */
	void enterCondenseOver(WCPSParser.CondenseOverContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#condenseOver}.
	 * @param ctx the parse tree
	 */
	void exitCondenseOver(WCPSParser.CondenseOverContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#condenseWhere}.
	 * @param ctx the parse tree
	 */
	void enterCondenseWhere(WCPSParser.CondenseWhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#condenseWhere}.
	 * @param ctx the parse tree
	 */
	void exitCondenseWhere(WCPSParser.CondenseWhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#condenseUsing}.
	 * @param ctx the parse tree
	 */
	void enterCondenseUsing(WCPSParser.CondenseUsingContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#condenseUsing}.
	 * @param ctx the parse tree
	 */
	void exitCondenseUsing(WCPSParser.CondenseUsingContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#dimensionIntervalList}.
	 * @param ctx the parse tree
	 */
	void enterDimensionIntervalList(WCPSParser.DimensionIntervalListContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#dimensionIntervalList}.
	 * @param ctx the parse tree
	 */
	void exitDimensionIntervalList(WCPSParser.DimensionIntervalListContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#dimensionPointElement}.
	 * @param ctx the parse tree
	 */
	void enterDimensionPointElement(WCPSParser.DimensionPointElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#dimensionPointElement}.
	 * @param ctx the parse tree
	 */
	void exitDimensionPointElement(WCPSParser.DimensionPointElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#dimensionIntervalElement}.
	 * @param ctx the parse tree
	 */
	void enterDimensionIntervalElement(WCPSParser.DimensionIntervalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#dimensionIntervalElement}.
	 * @param ctx the parse tree
	 */
	void exitDimensionIntervalElement(WCPSParser.DimensionIntervalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#dimensionIntervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimensionIntervalExpr(WCPSParser.DimensionIntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#dimensionIntervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimensionIntervalExpr(WCPSParser.DimensionIntervalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(WCPSParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(WCPSParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#multOp}.
	 * @param ctx the parse tree
	 */
	void enterMultOp(WCPSParser.MultOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#multOp}.
	 * @param ctx the parse tree
	 */
	void exitMultOp(WCPSParser.MultOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(WCPSParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(WCPSParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(WCPSParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(WCPSParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#condenseOpType}.
	 * @param ctx the parse tree
	 */
	void enterCondenseOpType(WCPSParser.CondenseOpTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#condenseOpType}.
	 * @param ctx the parse tree
	 */
	void exitCondenseOpType(WCPSParser.CondenseOpTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeType(WCPSParser.RangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeType(WCPSParser.RangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#complexConstant}.
	 * @param ctx the parse tree
	 */
	void enterComplexConstant(WCPSParser.ComplexConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#complexConstant}.
	 * @param ctx the parse tree
	 */
	void exitComplexConstant(WCPSParser.ComplexConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(WCPSParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#booleanConstant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(WCPSParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void enterIntegerConstant(WCPSParser.IntegerConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#integerConstant}.
	 * @param ctx the parse tree
	 */
	void exitIntegerConstant(WCPSParser.IntegerConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#floatConstant}.
	 * @param ctx the parse tree
	 */
	void enterFloatConstant(WCPSParser.FloatConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#floatConstant}.
	 * @param ctx the parse tree
	 */
	void exitFloatConstant(WCPSParser.FloatConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link WCPSParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void enterStringConstant(WCPSParser.StringConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link WCPSParser#stringConstant}.
	 * @param ctx the parse tree
	 */
	void exitStringConstant(WCPSParser.StringConstantContext ctx);
}