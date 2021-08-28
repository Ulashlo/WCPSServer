// Generated from C:/Users/Xiaomi/Desktop/Learning/Курсовой проект 3/Никольский_Владислав_БПИ185_Курсовой_проект_3_курс/Программа/WCPSServer/src/main/java/antlr\WCPS.g4 by ANTLR 4.9.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WCPSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		FOR=39, IN=40, LET=41, WHERE=42, RETURN=43, COVERAGE=44, OVER=45, VALUE=46, 
		LIST=47, VALUES=48, CONDENSE=49, USING=50, SWITCH=51, CASE=52, DEFAULT=53, 
		TRUE=54, FALSE=55, INTEGER=56, INTEGER_8=57, INTEGER_16=58, FLOAT=59, 
		STR=60, NAME=61, VARNAME=62, WS=63, ANY=64;
	public static final int
		RULE_processCoveragesExpr = 0, RULE_coverageNamesDefinition = 1, RULE_coverageNameDefinition = 2, 
		RULE_reductCoverageNamesDefinition = 3, RULE_reductCoverageNameDefinition = 4, 
		RULE_coverageList = 5, RULE_coverageName = 6, RULE_wherePart = 7, RULE_returnPart = 8, 
		RULE_express = 9, RULE_funList = 10, RULE_funListElement = 11, RULE_nameList = 12, 
		RULE_crsList = 13, RULE_lightConstructor = 14, RULE_hardConstructor = 15, 
		RULE_constructorCoverage = 16, RULE_constructorOver = 17, RULE_constructorValues = 18, 
		RULE_constructorValueElement = 19, RULE_axisIteratorList = 20, RULE_axisIterator = 21, 
		RULE_constructorElement = 22, RULE_caseExp = 23, RULE_defaultExp = 24, 
		RULE_condensePart = 25, RULE_condenseOver = 26, RULE_condenseWhere = 27, 
		RULE_condenseUsing = 28, RULE_dimensionIntervalList = 29, RULE_dimensionPointElement = 30, 
		RULE_dimensionIntervalElement = 31, RULE_dimensionIntervalExpr = 32, RULE_constant = 33, 
		RULE_multOp = 34, RULE_addOp = 35, RULE_compOp = 36, RULE_condenseOpType = 37, 
		RULE_rangeType = 38, RULE_complexConstant = 39, RULE_booleanConstant = 40, 
		RULE_integerConstant = 41, RULE_floatConstant = 42, RULE_stringConstant = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"processCoveragesExpr", "coverageNamesDefinition", "coverageNameDefinition", 
			"reductCoverageNamesDefinition", "reductCoverageNameDefinition", "coverageList", 
			"coverageName", "wherePart", "returnPart", "express", "funList", "funListElement", 
			"nameList", "crsList", "lightConstructor", "hardConstructor", "constructorCoverage", 
			"constructorOver", "constructorValues", "constructorValueElement", "axisIteratorList", 
			"axisIterator", "constructorElement", "caseExp", "defaultExp", "condensePart", 
			"condenseOver", "condenseWhere", "condenseUsing", "dimensionIntervalList", 
			"dimensionPointElement", "dimensionIntervalElement", "dimensionIntervalExpr", 
			"constant", "multOp", "addOp", "compOp", "condenseOpType", "rangeType", 
			"complexConstant", "booleanConstant", "integerConstant", "floatConstant", 
			"stringConstant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "':='", "'.'", "'['", "']'", "'-'", "'+'", 
			"'not'", "'and'", "'or'", "'xor'", "'{'", "'}'", "':'", "'struct'", "';'", 
			"'<'", "'>'", "'*'", "'/'", "'='", "'!='", "'>='", "'<='", "'max'", "'min'", 
			"'bool'", "'char'", "'unsigned'", "'short'", "'int'", "'long'", "'float'", 
			"'double'", "'complex'", "'complex2'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "FOR", "IN", "LET", "WHERE", "RETURN", "COVERAGE", 
			"OVER", "VALUE", "LIST", "VALUES", "CONDENSE", "USING", "SWITCH", "CASE", 
			"DEFAULT", "TRUE", "FALSE", "INTEGER", "INTEGER_8", "INTEGER_16", "FLOAT", 
			"STR", "NAME", "VARNAME", "WS", "ANY"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "WCPS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public WCPSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProcessCoveragesExprContext extends ParserRuleContext {
		public CoverageNamesDefinitionContext coverageNamesDefinition() {
			return getRuleContext(CoverageNamesDefinitionContext.class,0);
		}
		public ReturnPartContext returnPart() {
			return getRuleContext(ReturnPartContext.class,0);
		}
		public TerminalNode EOF() { return getToken(WCPSParser.EOF, 0); }
		public ReductCoverageNamesDefinitionContext reductCoverageNamesDefinition() {
			return getRuleContext(ReductCoverageNamesDefinitionContext.class,0);
		}
		public WherePartContext wherePart() {
			return getRuleContext(WherePartContext.class,0);
		}
		public ProcessCoveragesExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processCoveragesExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterProcessCoveragesExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitProcessCoveragesExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitProcessCoveragesExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessCoveragesExprContext processCoveragesExpr() throws RecognitionException {
		ProcessCoveragesExprContext _localctx = new ProcessCoveragesExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_processCoveragesExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			coverageNamesDefinition();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(89);
				reductCoverageNamesDefinition();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(92);
				wherePart();
				}
			}

			setState(95);
			returnPart();
			setState(96);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageNamesDefinitionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(WCPSParser.FOR, 0); }
		public List<CoverageNameDefinitionContext> coverageNameDefinition() {
			return getRuleContexts(CoverageNameDefinitionContext.class);
		}
		public CoverageNameDefinitionContext coverageNameDefinition(int i) {
			return getRuleContext(CoverageNameDefinitionContext.class,i);
		}
		public CoverageNamesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageNamesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCoverageNamesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCoverageNamesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCoverageNamesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageNamesDefinitionContext coverageNamesDefinition() throws RecognitionException {
		CoverageNamesDefinitionContext _localctx = new CoverageNamesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_coverageNamesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(FOR);
			setState(99);
			coverageNameDefinition();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(100);
				match(T__0);
				setState(101);
				coverageNameDefinition();
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageNameDefinitionContext extends ParserRuleContext {
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public TerminalNode IN() { return getToken(WCPSParser.IN, 0); }
		public CoverageListContext coverageList() {
			return getRuleContext(CoverageListContext.class,0);
		}
		public CoverageNameDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageNameDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCoverageNameDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCoverageNameDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCoverageNameDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageNameDefinitionContext coverageNameDefinition() throws RecognitionException {
		CoverageNameDefinitionContext _localctx = new CoverageNameDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_coverageNameDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			coverageName();
			setState(108);
			match(IN);
			setState(109);
			match(T__1);
			setState(110);
			coverageList();
			setState(111);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReductCoverageNamesDefinitionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(WCPSParser.LET, 0); }
		public List<ReductCoverageNameDefinitionContext> reductCoverageNameDefinition() {
			return getRuleContexts(ReductCoverageNameDefinitionContext.class);
		}
		public ReductCoverageNameDefinitionContext reductCoverageNameDefinition(int i) {
			return getRuleContext(ReductCoverageNameDefinitionContext.class,i);
		}
		public ReductCoverageNamesDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reductCoverageNamesDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterReductCoverageNamesDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitReductCoverageNamesDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitReductCoverageNamesDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReductCoverageNamesDefinitionContext reductCoverageNamesDefinition() throws RecognitionException {
		ReductCoverageNamesDefinitionContext _localctx = new ReductCoverageNamesDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reductCoverageNamesDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LET);
			setState(114);
			reductCoverageNameDefinition();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(115);
				match(T__0);
				setState(116);
				reductCoverageNameDefinition();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReductCoverageNameDefinitionContext extends ParserRuleContext {
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public ReductCoverageNameDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reductCoverageNameDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterReductCoverageNameDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitReductCoverageNameDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitReductCoverageNameDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReductCoverageNameDefinitionContext reductCoverageNameDefinition() throws RecognitionException {
		ReductCoverageNameDefinitionContext _localctx = new ReductCoverageNameDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_reductCoverageNameDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			coverageName();
			setState(123);
			match(T__3);
			setState(124);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(WCPSParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(WCPSParser.NAME, i);
		}
		public CoverageListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCoverageList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCoverageList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCoverageList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageListContext coverageList() throws RecognitionException {
		CoverageListContext _localctx = new CoverageListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_coverageList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NAME);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(127);
				match(T__0);
				setState(128);
				match(NAME);
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CoverageNameContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(WCPSParser.VARNAME, 0); }
		public TerminalNode NAME() { return getToken(WCPSParser.NAME, 0); }
		public CoverageNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coverageName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCoverageName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCoverageName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCoverageName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoverageNameContext coverageName() throws RecognitionException {
		CoverageNameContext _localctx = new CoverageNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_coverageName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==VARNAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WherePartContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(WCPSParser.WHERE, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public WherePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterWherePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitWherePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitWherePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WherePartContext wherePart() throws RecognitionException {
		WherePartContext _localctx = new WherePartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_wherePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(WHERE);
			setState(137);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnPartContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(WCPSParser.RETURN, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public ReturnPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterReturnPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitReturnPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitReturnPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnPartContext returnPart() throws RecognitionException {
		ReturnPartContext _localctx = new ReturnPartContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnPart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(RETURN);
			setState(140);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressContext extends ParserRuleContext {
		public ExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_express; }
	 
		public ExpressContext() { }
		public void copyFrom(ExpressContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryPlusExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public UnaryPlusExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterUnaryPlusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitUnaryPlusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitUnaryPlusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HardConstructorExpContext extends ExpressContext {
		public HardConstructorContext hardConstructor() {
			return getRuleContext(HardConstructorContext.class,0);
		}
		public HardConstructorExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterHardConstructorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitHardConstructorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitHardConstructorExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FieldExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode NAME() { return getToken(WCPSParser.NAME, 0); }
		public FieldExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterFieldExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitFieldExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitFieldExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchExpContext extends ExpressContext {
		public TerminalNode SWITCH() { return getToken(WCPSParser.SWITCH, 0); }
		public List<CaseExpContext> caseExp() {
			return getRuleContexts(CaseExpContext.class);
		}
		public CaseExpContext caseExp(int i) {
			return getRuleContext(CaseExpContext.class,i);
		}
		public DefaultExpContext defaultExp() {
			return getRuleContext(DefaultExpContext.class,0);
		}
		public SwitchExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterSwitchExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitSwitchExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitSwitchExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public AndExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastExpContext extends ExpressContext {
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public CastExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCastExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCastExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCastExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCompExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCompExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCompExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public AddExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public OrExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterOrExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitOrExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitOrExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunExpContext extends ExpressContext {
		public TerminalNode NAME() { return getToken(WCPSParser.NAME, 0); }
		public FunListContext funList() {
			return getRuleContext(FunListContext.class,0);
		}
		public FunExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterFunExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitFunExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitFunExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public TrimExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterTrimExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitTrimExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitTrimExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtomExpContext extends ExpressContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public AtomExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAtomExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAtomExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAtomExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public UnaryMinusExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterUnaryMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitUnaryMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitUnaryMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondenseExpContext extends ExpressContext {
		public CondensePartContext condensePart() {
			return getRuleContext(CondensePartContext.class,0);
		}
		public CondenseOverContext condenseOver() {
			return getRuleContext(CondenseOverContext.class,0);
		}
		public CondenseUsingContext condenseUsing() {
			return getRuleContext(CondenseUsingContext.class,0);
		}
		public CondenseWhereContext condenseWhere() {
			return getRuleContext(CondenseWhereContext.class,0);
		}
		public CondenseExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondenseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondenseExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondenseExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XorExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public XorExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterXorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitXorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitXorExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpContext extends ExpressContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public MultOpContext multOp() {
			return getRuleContext(MultOpContext.class,0);
		}
		public MultExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterMultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitMultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitMultExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LightConstructorExpContext extends ExpressContext {
		public LightConstructorContext lightConstructor() {
			return getRuleContext(LightConstructorContext.class,0);
		}
		public LightConstructorExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterLightConstructorExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitLightConstructorExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitLightConstructorExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public ParenthesisExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterParenthesisExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitParenthesisExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitParenthesisExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryNotExpContext extends ExpressContext {
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public UnaryNotExpContext(ExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterUnaryNotExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitUnaryNotExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitUnaryNotExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressContext express() throws RecognitionException {
		return express(0);
	}

	private ExpressContext express(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressContext _localctx = new ExpressContext(_ctx, _parentState);
		ExpressContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_express, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new CastExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(T__1);
				setState(144);
				rangeType();
				setState(145);
				match(T__2);
				setState(146);
				express(19);
				}
				break;
			case 2:
				{
				_localctx = new FunExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(NAME);
				setState(149);
				match(T__1);
				setState(150);
				funList();
				setState(151);
				match(T__2);
				}
				break;
			case 3:
				{
				_localctx = new UnaryMinusExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153);
				match(T__7);
				setState(154);
				express(15);
				}
				break;
			case 4:
				{
				_localctx = new UnaryPlusExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__8);
				setState(156);
				express(14);
				}
				break;
			case 5:
				{
				_localctx = new UnaryNotExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__9);
				setState(158);
				express(13);
				}
				break;
			case 6:
				{
				_localctx = new SwitchExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(SWITCH);
				setState(161); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(160);
						caseExp();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(163); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(165);
					defaultExp();
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new CondenseExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168);
				condensePart();
				setState(169);
				condenseOver();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(170);
					condenseWhere();
					}
				}

				setState(173);
				condenseUsing();
				}
				break;
			case 8:
				{
				_localctx = new LightConstructorExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				lightConstructor();
				}
				break;
			case 9:
				{
				_localctx = new HardConstructorExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				hardConstructor();
				}
				break;
			case 10:
				{
				_localctx = new AtomExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				constant();
				}
				break;
			case 11:
				{
				_localctx = new ParenthesisExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__1);
				setState(179);
				express(0);
				setState(180);
				match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						multOp();
						setState(186);
						express(13);
						}
						break;
					case 2:
						{
						_localctx = new AddExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(188);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(189);
						addOp();
						setState(190);
						express(12);
						}
						break;
					case 3:
						{
						_localctx = new CompExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(192);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(193);
						compOp();
						setState(194);
						express(11);
						}
						break;
					case 4:
						{
						_localctx = new AndExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						match(T__10);
						setState(198);
						express(10);
						}
						break;
					case 5:
						{
						_localctx = new OrExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						match(T__11);
						setState(201);
						express(9);
						}
						break;
					case 6:
						{
						_localctx = new XorExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						match(T__12);
						setState(204);
						express(8);
						}
						break;
					case 7:
						{
						_localctx = new FieldExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(205);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(206);
						match(T__4);
						setState(207);
						match(NAME);
						}
						break;
					case 8:
						{
						_localctx = new TrimExpContext(new ExpressContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_express);
						setState(208);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(209);
						match(T__5);
						setState(212);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
						case 1:
							{
							setState(210);
							dimensionIntervalList();
							}
							break;
						case 2:
							{
							setState(211);
							coverageName();
							}
							break;
						}
						setState(214);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FunListContext extends ParserRuleContext {
		public List<FunListElementContext> funListElement() {
			return getRuleContexts(FunListElementContext.class);
		}
		public FunListElementContext funListElement(int i) {
			return getRuleContext(FunListElementContext.class,i);
		}
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public FunListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterFunList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitFunList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitFunList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunListContext funList() throws RecognitionException {
		FunListContext _localctx = new FunListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(221);
				funListElement();
				}
				break;
			case 2:
				{
				setState(222);
				express(0);
				}
				break;
			}
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(225);
				match(T__0);
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(226);
					funListElement();
					}
					break;
				case 2:
					{
					setState(227);
					express(0);
					}
					break;
				}
				}
				}
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunListElementContext extends ParserRuleContext {
		public DimensionIntervalListContext dimensionIntervalList() {
			return getRuleContext(DimensionIntervalListContext.class,0);
		}
		public CrsListContext crsList() {
			return getRuleContext(CrsListContext.class,0);
		}
		public NameListContext nameList() {
			return getRuleContext(NameListContext.class,0);
		}
		public FunListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterFunListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitFunListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitFunListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunListElementContext funListElement() throws RecognitionException {
		FunListElementContext _localctx = new FunListElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_funListElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__13);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(236);
				dimensionIntervalList();
				}
				break;
			case 2:
				{
				setState(237);
				crsList();
				}
				break;
			case 3:
				{
				setState(238);
				nameList();
				}
				break;
			}
			setState(241);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameListContext extends ParserRuleContext {
		public List<CoverageNameContext> coverageName() {
			return getRuleContexts(CoverageNameContext.class);
		}
		public CoverageNameContext coverageName(int i) {
			return getRuleContext(CoverageNameContext.class,i);
		}
		public NameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameListContext nameList() throws RecognitionException {
		NameListContext _localctx = new NameListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_nameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			coverageName();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(244);
				match(T__0);
				setState(245);
				coverageName();
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CrsListContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(WCPSParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(WCPSParser.NAME, i);
		}
		public CrsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCrsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCrsList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCrsList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CrsListContext crsList() throws RecognitionException {
		CrsListContext _localctx = new CrsListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_crsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(NAME);
			setState(252);
			match(T__15);
			setState(253);
			match(NAME);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(254);
				match(T__0);
				setState(255);
				match(NAME);
				setState(256);
				match(T__15);
				setState(257);
				match(NAME);
				}
				}
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LightConstructorContext extends ParserRuleContext {
		public List<ConstructorElementContext> constructorElement() {
			return getRuleContexts(ConstructorElementContext.class);
		}
		public ConstructorElementContext constructorElement(int i) {
			return getRuleContext(ConstructorElementContext.class,i);
		}
		public LightConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lightConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterLightConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitLightConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitLightConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LightConstructorContext lightConstructor() throws RecognitionException {
		LightConstructorContext _localctx = new LightConstructorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lightConstructor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(263);
				match(T__16);
				}
			}

			setState(266);
			match(T__13);
			setState(267);
			constructorElement();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(268);
				match(T__17);
				setState(269);
				constructorElement();
				}
				}
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HardConstructorContext extends ParserRuleContext {
		public ConstructorCoverageContext constructorCoverage() {
			return getRuleContext(ConstructorCoverageContext.class,0);
		}
		public ConstructorOverContext constructorOver() {
			return getRuleContext(ConstructorOverContext.class,0);
		}
		public ConstructorValuesContext constructorValues() {
			return getRuleContext(ConstructorValuesContext.class,0);
		}
		public HardConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterHardConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitHardConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitHardConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardConstructorContext hardConstructor() throws RecognitionException {
		HardConstructorContext _localctx = new HardConstructorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hardConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			constructorCoverage();
			setState(278);
			constructorOver();
			setState(279);
			constructorValues();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorCoverageContext extends ParserRuleContext {
		public TerminalNode COVERAGE() { return getToken(WCPSParser.COVERAGE, 0); }
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public ConstructorCoverageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorCoverage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstructorCoverage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstructorCoverage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstructorCoverage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorCoverageContext constructorCoverage() throws RecognitionException {
		ConstructorCoverageContext _localctx = new ConstructorCoverageContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_constructorCoverage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(COVERAGE);
			setState(282);
			coverageName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorOverContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(WCPSParser.OVER, 0); }
		public AxisIteratorListContext axisIteratorList() {
			return getRuleContext(AxisIteratorListContext.class,0);
		}
		public ConstructorOverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorOver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstructorOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstructorOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstructorOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorOverContext constructorOver() throws RecognitionException {
		ConstructorOverContext _localctx = new ConstructorOverContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_constructorOver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(OVER);
			setState(285);
			axisIteratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorValuesContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(WCPSParser.VALUES, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public TerminalNode VALUE() { return getToken(WCPSParser.VALUE, 0); }
		public ConstructorValueElementContext constructorValueElement() {
			return getRuleContext(ConstructorValueElementContext.class,0);
		}
		public ConstructorValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstructorValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstructorValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstructorValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorValuesContext constructorValues() throws RecognitionException {
		ConstructorValuesContext _localctx = new ConstructorValuesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_constructorValues);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VALUES:
				{
				setState(287);
				match(VALUES);
				setState(288);
				express(0);
				}
				break;
			case VALUE:
				{
				setState(289);
				match(VALUE);
				setState(290);
				constructorValueElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorValueElementContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(WCPSParser.LIST, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public ConstructorValueElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorValueElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstructorValueElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstructorValueElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstructorValueElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorValueElementContext constructorValueElement() throws RecognitionException {
		ConstructorValueElementContext _localctx = new ConstructorValueElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constructorValueElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(LIST);
			setState(294);
			match(T__18);
			setState(295);
			constant();
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(296);
				match(T__17);
				setState(297);
				constant();
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisIteratorListContext extends ParserRuleContext {
		public List<AxisIteratorContext> axisIterator() {
			return getRuleContexts(AxisIteratorContext.class);
		}
		public AxisIteratorContext axisIterator(int i) {
			return getRuleContext(AxisIteratorContext.class,i);
		}
		public AxisIteratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisIteratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAxisIteratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAxisIteratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAxisIteratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisIteratorListContext axisIteratorList() throws RecognitionException {
		AxisIteratorListContext _localctx = new AxisIteratorListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_axisIteratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			axisIterator();
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(306);
				match(T__0);
				setState(307);
				axisIterator();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AxisIteratorContext extends ParserRuleContext {
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public TerminalNode NAME() { return getToken(WCPSParser.NAME, 0); }
		public DimensionIntervalExprContext dimensionIntervalExpr() {
			return getRuleContext(DimensionIntervalExprContext.class,0);
		}
		public AxisIteratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_axisIterator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAxisIterator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAxisIterator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAxisIterator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AxisIteratorContext axisIterator() throws RecognitionException {
		AxisIteratorContext _localctx = new AxisIteratorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_axisIterator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			coverageName();
			setState(314);
			match(NAME);
			setState(315);
			dimensionIntervalExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorElementContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(WCPSParser.NAME, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public ConstructorElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstructorElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstructorElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstructorElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorElementContext constructorElement() throws RecognitionException {
		ConstructorElementContext _localctx = new ConstructorElementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_constructorElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(NAME);
			setState(318);
			match(T__15);
			setState(319);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseExpContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(WCPSParser.CASE, 0); }
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public TerminalNode RETURN() { return getToken(WCPSParser.RETURN, 0); }
		public CaseExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCaseExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCaseExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCaseExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpContext caseExp() throws RecognitionException {
		CaseExpContext _localctx = new CaseExpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(CASE);
			setState(322);
			express(0);
			setState(323);
			match(RETURN);
			setState(324);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExpContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(WCPSParser.DEFAULT, 0); }
		public TerminalNode RETURN() { return getToken(WCPSParser.RETURN, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DefaultExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterDefaultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitDefaultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitDefaultExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExpContext defaultExp() throws RecognitionException {
		DefaultExpContext _localctx = new DefaultExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_defaultExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(DEFAULT);
			setState(327);
			match(RETURN);
			setState(328);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondensePartContext extends ParserRuleContext {
		public TerminalNode CONDENSE() { return getToken(WCPSParser.CONDENSE, 0); }
		public CondenseOpTypeContext condenseOpType() {
			return getRuleContext(CondenseOpTypeContext.class,0);
		}
		public CondensePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condensePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondensePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondensePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondensePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondensePartContext condensePart() throws RecognitionException {
		CondensePartContext _localctx = new CondensePartContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_condensePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(CONDENSE);
			setState(331);
			condenseOpType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseOverContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(WCPSParser.OVER, 0); }
		public AxisIteratorListContext axisIteratorList() {
			return getRuleContext(AxisIteratorListContext.class,0);
		}
		public CondenseOverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseOver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondenseOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondenseOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondenseOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseOverContext condenseOver() throws RecognitionException {
		CondenseOverContext _localctx = new CondenseOverContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_condenseOver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(OVER);
			setState(334);
			axisIteratorList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseWhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(WCPSParser.WHERE, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public CondenseWhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseWhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondenseWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondenseWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondenseWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseWhereContext condenseWhere() throws RecognitionException {
		CondenseWhereContext _localctx = new CondenseWhereContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_condenseWhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(WHERE);
			setState(337);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseUsingContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(WCPSParser.USING, 0); }
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public CondenseUsingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseUsing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondenseUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondenseUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondenseUsing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseUsingContext condenseUsing() throws RecognitionException {
		CondenseUsingContext _localctx = new CondenseUsingContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_condenseUsing);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(USING);
			setState(340);
			express(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionIntervalListContext extends ParserRuleContext {
		public List<DimensionIntervalElementContext> dimensionIntervalElement() {
			return getRuleContexts(DimensionIntervalElementContext.class);
		}
		public DimensionIntervalElementContext dimensionIntervalElement(int i) {
			return getRuleContext(DimensionIntervalElementContext.class,i);
		}
		public List<DimensionPointElementContext> dimensionPointElement() {
			return getRuleContexts(DimensionPointElementContext.class);
		}
		public DimensionPointElementContext dimensionPointElement(int i) {
			return getRuleContext(DimensionPointElementContext.class,i);
		}
		public DimensionIntervalListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionIntervalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterDimensionIntervalList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitDimensionIntervalList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitDimensionIntervalList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionIntervalListContext dimensionIntervalList() throws RecognitionException {
		DimensionIntervalListContext _localctx = new DimensionIntervalListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_dimensionIntervalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(342);
				dimensionIntervalElement();
				}
				break;
			case 2:
				{
				setState(343);
				dimensionPointElement();
				}
				break;
			}
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(346);
				match(T__0);
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(347);
					dimensionIntervalElement();
					}
					break;
				case 2:
					{
					setState(348);
					dimensionPointElement();
					}
					break;
				}
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionPointElementContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(WCPSParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(WCPSParser.NAME, i);
		}
		public ExpressContext express() {
			return getRuleContext(ExpressContext.class,0);
		}
		public DimensionPointElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionPointElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterDimensionPointElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitDimensionPointElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitDimensionPointElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionPointElementContext dimensionPointElement() throws RecognitionException {
		DimensionPointElementContext _localctx = new DimensionPointElementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dimensionPointElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(NAME);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(357);
				match(T__15);
				setState(358);
				match(NAME);
				}
			}

			setState(361);
			match(T__1);
			setState(362);
			express(0);
			setState(363);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionIntervalElementContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(WCPSParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(WCPSParser.NAME, i);
		}
		public DimensionIntervalExprContext dimensionIntervalExpr() {
			return getRuleContext(DimensionIntervalExprContext.class,0);
		}
		public DimensionIntervalElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionIntervalElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterDimensionIntervalElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitDimensionIntervalElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitDimensionIntervalElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionIntervalElementContext dimensionIntervalElement() throws RecognitionException {
		DimensionIntervalElementContext _localctx = new DimensionIntervalElementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_dimensionIntervalElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(NAME);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(366);
				match(T__15);
				setState(367);
				match(NAME);
				}
			}

			setState(370);
			dimensionIntervalExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensionIntervalExprContext extends ParserRuleContext {
		public List<ExpressContext> express() {
			return getRuleContexts(ExpressContext.class);
		}
		public ExpressContext express(int i) {
			return getRuleContext(ExpressContext.class,i);
		}
		public DimensionIntervalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionIntervalExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterDimensionIntervalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitDimensionIntervalExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitDimensionIntervalExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionIntervalExprContext dimensionIntervalExpr() throws RecognitionException {
		DimensionIntervalExprContext _localctx = new DimensionIntervalExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_dimensionIntervalExpr);
		try {
			setState(382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(T__1);
				setState(373);
				express(0);
				setState(374);
				match(T__15);
				setState(375);
				express(0);
				setState(376);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(T__1);
				setState(379);
				express(0);
				setState(380);
				match(T__2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public CoverageNameContext coverageName() {
			return getRuleContext(CoverageNameContext.class,0);
		}
		public StringConstantContext stringConstant() {
			return getRuleContext(StringConstantContext.class,0);
		}
		public BooleanConstantContext booleanConstant() {
			return getRuleContext(BooleanConstantContext.class,0);
		}
		public IntegerConstantContext integerConstant() {
			return getRuleContext(IntegerConstantContext.class,0);
		}
		public FloatConstantContext floatConstant() {
			return getRuleContext(FloatConstantContext.class,0);
		}
		public ComplexConstantContext complexConstant() {
			return getRuleContext(ComplexConstantContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constant);
		try {
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(384);
				coverageName();
				}
				break;
			case STR:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				stringConstant();
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				booleanConstant();
				}
				break;
			case INTEGER:
			case INTEGER_8:
			case INTEGER_16:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				integerConstant();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				floatConstant();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				complexConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultOpContext extends ParserRuleContext {
		public MultOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterMultOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitMultOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitMultOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultOpContext multOp() throws RecognitionException {
		MultOpContext _localctx = new MultOpContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_multOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddOpContext extends ParserRuleContext {
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompOpContext extends ParserRuleContext {
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondenseOpTypeContext extends ParserRuleContext {
		public CondenseOpTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condenseOpType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterCondenseOpType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitCondenseOpType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitCondenseOpType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondenseOpTypeContext condenseOpType() throws RecognitionException {
		CondenseOpTypeContext _localctx = new CondenseOpTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_condenseOpType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__10) | (1L << T__11) | (1L << T__20) | (1L << T__26) | (1L << T__27))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RangeTypeContext extends ParserRuleContext {
		public RangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterRangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitRangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitRangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rangeType);
		try {
			setState(417);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(401);
				match(T__29);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(402);
				match(T__30);
				setState(403);
				match(T__29);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				match(T__31);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				match(T__30);
				setState(406);
				match(T__31);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(407);
				match(T__32);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(408);
				match(T__30);
				setState(409);
				match(T__32);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(410);
				match(T__33);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(411);
				match(T__30);
				setState(412);
				match(T__33);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(413);
				match(T__34);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(414);
				match(T__35);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(415);
				match(T__36);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(416);
				match(T__37);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexConstantContext extends ParserRuleContext {
		public List<FloatConstantContext> floatConstant() {
			return getRuleContexts(FloatConstantContext.class);
		}
		public FloatConstantContext floatConstant(int i) {
			return getRuleContext(FloatConstantContext.class,i);
		}
		public List<IntegerConstantContext> integerConstant() {
			return getRuleContexts(IntegerConstantContext.class);
		}
		public IntegerConstantContext integerConstant(int i) {
			return getRuleContext(IntegerConstantContext.class,i);
		}
		public ComplexConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterComplexConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitComplexConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitComplexConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexConstantContext complexConstant() throws RecognitionException {
		ComplexConstantContext _localctx = new ComplexConstantContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_complexConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(T__1);
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(420);
				floatConstant();
				}
				break;
			case INTEGER:
			case INTEGER_8:
			case INTEGER_16:
				{
				setState(421);
				integerConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(424);
			match(T__0);
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				{
				setState(425);
				floatConstant();
				}
				break;
			case INTEGER:
			case INTEGER_8:
			case INTEGER_16:
				{
				setState(426);
				integerConstant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(429);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanConstantContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(WCPSParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(WCPSParser.FALSE, 0); }
		public BooleanConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterBooleanConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitBooleanConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitBooleanConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanConstantContext booleanConstant() throws RecognitionException {
		BooleanConstantContext _localctx = new BooleanConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_booleanConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerConstantContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(WCPSParser.INTEGER, 0); }
		public TerminalNode INTEGER_8() { return getToken(WCPSParser.INTEGER_8, 0); }
		public TerminalNode INTEGER_16() { return getToken(WCPSParser.INTEGER_16, 0); }
		public IntegerConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterIntegerConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitIntegerConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitIntegerConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerConstantContext integerConstant() throws RecognitionException {
		IntegerConstantContext _localctx = new IntegerConstantContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_integerConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << INTEGER_8) | (1L << INTEGER_16))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FloatConstantContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(WCPSParser.FLOAT, 0); }
		public FloatConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterFloatConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitFloatConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitFloatConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatConstantContext floatConstant() throws RecognitionException {
		FloatConstantContext _localctx = new FloatConstantContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_floatConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringConstantContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(WCPSParser.STR, 0); }
		public StringConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).enterStringConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WCPSListener ) ((WCPSListener)listener).exitStringConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WCPSVisitor ) return ((WCPSVisitor<? extends T>)visitor).visitStringConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringConstantContext stringConstant() throws RecognitionException {
		StringConstantContext _localctx = new StringConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_stringConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return express_sempred((ExpressContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean express_sempred(ExpressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 18);
		case 7:
			return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3B\u01ba\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\5\2]\n\2\3\2\5\2`\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7"+
		"\3i\n\3\f\3\16\3l\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5x\n"+
		"\5\f\5\16\5{\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087"+
		"\13\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00a4"+
		"\n\13\r\13\16\13\u00a5\3\13\5\13\u00a9\n\13\3\13\3\13\3\13\5\13\u00ae"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u00d7\n\13\3\13\3\13\7\13\u00db\n\13\f\13\16\13\u00de\13\13\3\f\3\f\5"+
		"\f\u00e2\n\f\3\f\3\f\3\f\5\f\u00e7\n\f\7\f\u00e9\n\f\f\f\16\f\u00ec\13"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00f2\n\r\3\r\3\r\3\16\3\16\3\16\7\16\u00f9\n\16"+
		"\f\16\16\16\u00fc\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0105"+
		"\n\17\f\17\16\17\u0108\13\17\3\20\5\20\u010b\n\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0111\n\20\f\20\16\20\u0114\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u0126\n\24\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u012d\n\25\f\25\16\25\u0130\13\25\3\25\3\25"+
		"\3\26\3\26\3\26\7\26\u0137\n\26\f\26\16\26\u013a\13\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u015b\n\37\3\37\3\37\3\37\5\37\u0160\n\37\7\37\u0162\n\37\f\37\16"+
		"\37\u0165\13\37\3 \3 \3 \5 \u016a\n \3 \3 \3 \3 \3!\3!\3!\5!\u0173\n!"+
		"\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0181\n\"\3#\3#\3#"+
		"\3#\3#\3#\5#\u0189\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01a4\n(\3)\3)\3)\5)\u01a9\n)\3)\3)\3"+
		")\5)\u01ae\n)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\2\3\24.\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX\2\t\3\2"+
		"?@\3\2\27\30\3\2\n\13\4\2\25\26\31\34\6\2\13\13\r\16\27\27\35\36\3\28"+
		"9\3\2:<\2\u01cd\2Z\3\2\2\2\4d\3\2\2\2\6m\3\2\2\2\bs\3\2\2\2\n|\3\2\2\2"+
		"\f\u0080\3\2\2\2\16\u0088\3\2\2\2\20\u008a\3\2\2\2\22\u008d\3\2\2\2\24"+
		"\u00b8\3\2\2\2\26\u00e1\3\2\2\2\30\u00ed\3\2\2\2\32\u00f5\3\2\2\2\34\u00fd"+
		"\3\2\2\2\36\u010a\3\2\2\2 \u0117\3\2\2\2\"\u011b\3\2\2\2$\u011e\3\2\2"+
		"\2&\u0125\3\2\2\2(\u0127\3\2\2\2*\u0133\3\2\2\2,\u013b\3\2\2\2.\u013f"+
		"\3\2\2\2\60\u0143\3\2\2\2\62\u0148\3\2\2\2\64\u014c\3\2\2\2\66\u014f\3"+
		"\2\2\28\u0152\3\2\2\2:\u0155\3\2\2\2<\u015a\3\2\2\2>\u0166\3\2\2\2@\u016f"+
		"\3\2\2\2B\u0180\3\2\2\2D\u0188\3\2\2\2F\u018a\3\2\2\2H\u018c\3\2\2\2J"+
		"\u018e\3\2\2\2L\u0190\3\2\2\2N\u01a3\3\2\2\2P\u01a5\3\2\2\2R\u01b1\3\2"+
		"\2\2T\u01b3\3\2\2\2V\u01b5\3\2\2\2X\u01b7\3\2\2\2Z\\\5\4\3\2[]\5\b\5\2"+
		"\\[\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^`\5\20\t\2_^\3\2\2\2_`\3\2\2\2`a\3\2"+
		"\2\2ab\5\22\n\2bc\7\2\2\3c\3\3\2\2\2de\7)\2\2ej\5\6\4\2fg\7\3\2\2gi\5"+
		"\6\4\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\5\3\2\2\2lj\3\2\2\2mn"+
		"\5\16\b\2no\7*\2\2op\7\4\2\2pq\5\f\7\2qr\7\5\2\2r\7\3\2\2\2st\7+\2\2t"+
		"y\5\n\6\2uv\7\3\2\2vx\5\n\6\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z\t\3\2\2\2{y\3\2\2\2|}\5\16\b\2}~\7\6\2\2~\177\5\24\13\2\177\13\3\2\2"+
		"\2\u0080\u0085\7?\2\2\u0081\u0082\7\3\2\2\u0082\u0084\7?\2\2\u0083\u0081"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\t\2\2\2\u0089\17\3\2\2\2\u008a"+
		"\u008b\7,\2\2\u008b\u008c\5\24\13\2\u008c\21\3\2\2\2\u008d\u008e\7-\2"+
		"\2\u008e\u008f\5\24\13\2\u008f\23\3\2\2\2\u0090\u0091\b\13\1\2\u0091\u0092"+
		"\7\4\2\2\u0092\u0093\5N(\2\u0093\u0094\7\5\2\2\u0094\u0095\5\24\13\25"+
		"\u0095\u00b9\3\2\2\2\u0096\u0097\7?\2\2\u0097\u0098\7\4\2\2\u0098\u0099"+
		"\5\26\f\2\u0099\u009a\7\5\2\2\u009a\u00b9\3\2\2\2\u009b\u009c\7\n\2\2"+
		"\u009c\u00b9\5\24\13\21\u009d\u009e\7\13\2\2\u009e\u00b9\5\24\13\20\u009f"+
		"\u00a0\7\f\2\2\u00a0\u00b9\5\24\13\17\u00a1\u00a3\7\65\2\2\u00a2\u00a4"+
		"\5\60\31\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a9\5\62\32\2\u00a8\u00a7"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00b9\3\2\2\2\u00aa\u00ab\5\64\33\2"+
		"\u00ab\u00ad\5\66\34\2\u00ac\u00ae\58\35\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5:\36\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b9\5\36\20\2\u00b2\u00b9\5 \21\2\u00b3\u00b9\5D#\2\u00b4\u00b5\7\4"+
		"\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\5\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u0090\3\2\2\2\u00b8\u0096\3\2\2\2\u00b8\u009b\3\2\2\2\u00b8\u009d\3\2"+
		"\2\2\u00b8\u009f\3\2\2\2\u00b8\u00a1\3\2\2\2\u00b8\u00aa\3\2\2\2\u00b8"+
		"\u00b1\3\2\2\2\u00b8\u00b2\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b8\u00b4\3\2"+
		"\2\2\u00b9\u00dc\3\2\2\2\u00ba\u00bb\f\16\2\2\u00bb\u00bc\5F$\2\u00bc"+
		"\u00bd\5\24\13\17\u00bd\u00db\3\2\2\2\u00be\u00bf\f\r\2\2\u00bf\u00c0"+
		"\5H%\2\u00c0\u00c1\5\24\13\16\u00c1\u00db\3\2\2\2\u00c2\u00c3\f\f\2\2"+
		"\u00c3\u00c4\5J&\2\u00c4\u00c5\5\24\13\r\u00c5\u00db\3\2\2\2\u00c6\u00c7"+
		"\f\13\2\2\u00c7\u00c8\7\r\2\2\u00c8\u00db\5\24\13\f\u00c9\u00ca\f\n\2"+
		"\2\u00ca\u00cb\7\16\2\2\u00cb\u00db\5\24\13\13\u00cc\u00cd\f\t\2\2\u00cd"+
		"\u00ce\7\17\2\2\u00ce\u00db\5\24\13\n\u00cf\u00d0\f\24\2\2\u00d0\u00d1"+
		"\7\7\2\2\u00d1\u00db\7?\2\2\u00d2\u00d3\f\22\2\2\u00d3\u00d6\7\b\2\2\u00d4"+
		"\u00d7\5<\37\2\u00d5\u00d7\5\16\b\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3"+
		"\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\t\2\2\u00d9\u00db\3\2\2\2\u00da"+
		"\u00ba\3\2\2\2\u00da\u00be\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c6\3\2"+
		"\2\2\u00da\u00c9\3\2\2\2\u00da\u00cc\3\2\2\2\u00da\u00cf\3\2\2\2\u00da"+
		"\u00d2\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\25\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e2\5\30\r\2\u00e0\u00e2"+
		"\5\24\13\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00ea\3\2\2\2"+
		"\u00e3\u00e6\7\3\2\2\u00e4\u00e7\5\30\r\2\u00e5\u00e7\5\24\13\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e9\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\27\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f1\7\20\2\2\u00ee\u00f2\5<\37"+
		"\2\u00ef\u00f2\5\34\17\2\u00f0\u00f2\5\32\16\2\u00f1\u00ee\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\21"+
		"\2\2\u00f4\31\3\2\2\2\u00f5\u00fa\5\16\b\2\u00f6\u00f7\7\3\2\2\u00f7\u00f9"+
		"\5\16\b\2\u00f8\u00f6\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2"+
		"\u00fa\u00fb\3\2\2\2\u00fb\33\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00fe"+
		"\7?\2\2\u00fe\u00ff\7\22\2\2\u00ff\u0106\7?\2\2\u0100\u0101\7\3\2\2\u0101"+
		"\u0102\7?\2\2\u0102\u0103\7\22\2\2\u0103\u0105\7?\2\2\u0104\u0100\3\2"+
		"\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\35\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\7\23\2\2\u010a\u0109\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\7\20\2\2\u010d"+
		"\u0112\5.\30\2\u010e\u010f\7\24\2\2\u010f\u0111\5.\30\2\u0110\u010e\3"+
		"\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\21\2\2\u0116\37\3\2\2"+
		"\2\u0117\u0118\5\"\22\2\u0118\u0119\5$\23\2\u0119\u011a\5&\24\2\u011a"+
		"!\3\2\2\2\u011b\u011c\7.\2\2\u011c\u011d\5\16\b\2\u011d#\3\2\2\2\u011e"+
		"\u011f\7/\2\2\u011f\u0120\5*\26\2\u0120%\3\2\2\2\u0121\u0122\7\62\2\2"+
		"\u0122\u0126\5\24\13\2\u0123\u0124\7\60\2\2\u0124\u0126\5(\25\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0123\3\2\2\2\u0126\'\3\2\2\2\u0127\u0128\7\61\2"+
		"\2\u0128\u0129\7\25\2\2\u0129\u012e\5D#\2\u012a\u012b\7\24\2\2\u012b\u012d"+
		"\5D#\2\u012c\u012a\3\2\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0132\7\26"+
		"\2\2\u0132)\3\2\2\2\u0133\u0138\5,\27\2\u0134\u0135\7\3\2\2\u0135\u0137"+
		"\5,\27\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139+\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\5\16\b\2"+
		"\u013c\u013d\7?\2\2\u013d\u013e\5B\"\2\u013e-\3\2\2\2\u013f\u0140\7?\2"+
		"\2\u0140\u0141\7\22\2\2\u0141\u0142\5\24\13\2\u0142/\3\2\2\2\u0143\u0144"+
		"\7\66\2\2\u0144\u0145\5\24\13\2\u0145\u0146\7-\2\2\u0146\u0147\5\24\13"+
		"\2\u0147\61\3\2\2\2\u0148\u0149\7\67\2\2\u0149\u014a\7-\2\2\u014a\u014b"+
		"\5\24\13\2\u014b\63\3\2\2\2\u014c\u014d\7\63\2\2\u014d\u014e\5L\'\2\u014e"+
		"\65\3\2\2\2\u014f\u0150\7/\2\2\u0150\u0151\5*\26\2\u0151\67\3\2\2\2\u0152"+
		"\u0153\7,\2\2\u0153\u0154\5\24\13\2\u01549\3\2\2\2\u0155\u0156\7\64\2"+
		"\2\u0156\u0157\5\24\13\2\u0157;\3\2\2\2\u0158\u015b\5@!\2\u0159\u015b"+
		"\5> \2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u0163\3\2\2\2\u015c"+
		"\u015f\7\3\2\2\u015d\u0160\5@!\2\u015e\u0160\5> \2\u015f\u015d\3\2\2\2"+
		"\u015f\u015e\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015c\3\2\2\2\u0162\u0165"+
		"\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164=\3\2\2\2\u0165"+
		"\u0163\3\2\2\2\u0166\u0169\7?\2\2\u0167\u0168\7\22\2\2\u0168\u016a\7?"+
		"\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016c\7\4\2\2\u016c\u016d\5\24\13\2\u016d\u016e\7\5\2\2\u016e?\3\2\2"+
		"\2\u016f\u0172\7?\2\2\u0170\u0171\7\22\2\2\u0171\u0173\7?\2\2\u0172\u0170"+
		"\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\5B\"\2\u0175"+
		"A\3\2\2\2\u0176\u0177\7\4\2\2\u0177\u0178\5\24\13\2\u0178\u0179\7\22\2"+
		"\2\u0179\u017a\5\24\13\2\u017a\u017b\7\5\2\2\u017b\u0181\3\2\2\2\u017c"+
		"\u017d\7\4\2\2\u017d\u017e\5\24\13\2\u017e\u017f\7\5\2\2\u017f\u0181\3"+
		"\2\2\2\u0180\u0176\3\2\2\2\u0180\u017c\3\2\2\2\u0181C\3\2\2\2\u0182\u0189"+
		"\5\16\b\2\u0183\u0189\5X-\2\u0184\u0189\5R*\2\u0185\u0189\5T+\2\u0186"+
		"\u0189\5V,\2\u0187\u0189\5P)\2\u0188\u0182\3\2\2\2\u0188\u0183\3\2\2\2"+
		"\u0188\u0184\3\2\2\2\u0188\u0185\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0187"+
		"\3\2\2\2\u0189E\3\2\2\2\u018a\u018b\t\3\2\2\u018bG\3\2\2\2\u018c\u018d"+
		"\t\4\2\2\u018dI\3\2\2\2\u018e\u018f\t\5\2\2\u018fK\3\2\2\2\u0190\u0191"+
		"\t\6\2\2\u0191M\3\2\2\2\u0192\u01a4\7\37\2\2\u0193\u01a4\7 \2\2\u0194"+
		"\u0195\7!\2\2\u0195\u01a4\7 \2\2\u0196\u01a4\7\"\2\2\u0197\u0198\7!\2"+
		"\2\u0198\u01a4\7\"\2\2\u0199\u01a4\7#\2\2\u019a\u019b\7!\2\2\u019b\u01a4"+
		"\7#\2\2\u019c\u01a4\7$\2\2\u019d\u019e\7!\2\2\u019e\u01a4\7$\2\2\u019f"+
		"\u01a4\7%\2\2\u01a0\u01a4\7&\2\2\u01a1\u01a4\7\'\2\2\u01a2\u01a4\7(\2"+
		"\2\u01a3\u0192\3\2\2\2\u01a3\u0193\3\2\2\2\u01a3\u0194\3\2\2\2\u01a3\u0196"+
		"\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u0199\3\2\2\2\u01a3\u019a\3\2\2\2\u01a3"+
		"\u019c\3\2\2\2\u01a3\u019d\3\2\2\2\u01a3\u019f\3\2\2\2\u01a3\u01a0\3\2"+
		"\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a2\3\2\2\2\u01a4O\3\2\2\2\u01a5\u01a8"+
		"\7\4\2\2\u01a6\u01a9\5V,\2\u01a7\u01a9\5T+\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ad\7\3\2\2\u01ab\u01ae\5V"+
		",\2\u01ac\u01ae\5T+\2\u01ad\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\7\5\2\2\u01b0Q\3\2\2\2\u01b1\u01b2\t\7\2\2\u01b2"+
		"S\3\2\2\2\u01b3\u01b4\t\b\2\2\u01b4U\3\2\2\2\u01b5\u01b6\7=\2\2\u01b6"+
		"W\3\2\2\2\u01b7\u01b8\7>\2\2\u01b8Y\3\2\2\2#\\_jy\u0085\u00a5\u00a8\u00ad"+
		"\u00b8\u00d6\u00da\u00dc\u00e1\u00e6\u00ea\u00f1\u00fa\u0106\u010a\u0112"+
		"\u0125\u012e\u0138\u015a\u015f\u0163\u0169\u0172\u0180\u0188\u01a3\u01a8"+
		"\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}