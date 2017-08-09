// Generated from /homes/zz5013/pwhile/src/pWhile.g4 by ANTLR 4.7
package pwCompiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pWhileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, INTEGER=2, MUL=3, DIV=4, MOD=5, PLUS=6, MINUS=7, GT=8, GTE=9, 
		LT=10, LTE=11, EQ=12, NEQ=13, AND=14, OR=15, NOT=16, SEQ=17, IF=18, THEN=19, 
		ELSE=20, FI=21, WHILE=22, DO=23, OD=24, CHOOSE=25, ORR=26, RO=27, DECLARE=28, 
		RDASSIGN=29, ASSIGN=30, SEMICOLON=31, COMMA=32, HASH=33, DDOT=34, DOT=35, 
		VAR=36, BEGIN=37, END=38, SKIPP=39, STOP=40, PARA=41, OPEN_PARENTHESES=42, 
		CLOSE_PARENTHESES=43, OPEN_CURLY_BRACKET=44, CLOSE_CURLY_BRACKET=45, OPEN_SQUARE_BRACKET=46, 
		CLOSE_SQUARE_BRACKET=47, IDENT=48, ESCAPEDCHAR=49, WHITESPACE=50, COMMENT=51;
	public static final int
		RULE_binOpP1 = 0, RULE_binOpP2 = 1, RULE_binOpP3 = 2, RULE_binOpP4 = 3, 
		RULE_binOpP5 = 4, RULE_binOpP6 = 5, RULE_unaryOp = 6, RULE_stat = 7, RULE_expr = 8, 
		RULE_pr = 9, RULE_valueRange = 10, RULE_para = 11, RULE_prog = 12;
	public static final String[] ruleNames = {
		"binOpP1", "binOpP2", "binOpP3", "binOpP4", "binOpP5", "binOpP6", "unaryOp", 
		"stat", "expr", "pr", "valueRange", "para", "prog"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'='", "'if'", "'then'", 
		"'else'", "'fi'", "'while'", "'do'", "'od'", "'choose'", "'or'", "'ro'", 
		"':'", "'?='", "':='", "';'", "','", "'#'", "'..'", "'.'", "'var'", "'begin'", 
		"'end'", "'skip'", "'stop'", "'para'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL", "INTEGER", "MUL", "DIV", "MOD", "PLUS", "MINUS", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "AND", "OR", "NOT", "SEQ", "IF", "THEN", "ELSE", 
		"FI", "WHILE", "DO", "OD", "CHOOSE", "ORR", "RO", "DECLARE", "RDASSIGN", 
		"ASSIGN", "SEMICOLON", "COMMA", "HASH", "DDOT", "DOT", "VAR", "BEGIN", 
		"END", "SKIPP", "STOP", "PARA", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
		"OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"IDENT", "ESCAPEDCHAR", "WHITESPACE", "COMMENT"
	};
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
	public String getGrammarFileName() { return "pWhile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pWhileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BinOpP1Context extends ParserRuleContext {
		public TerminalNode MUL() { return getToken(pWhileParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(pWhileParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(pWhileParser.MOD, 0); }
		public BinOpP1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP1Context binOpP1() throws RecognitionException {
		BinOpP1Context _localctx = new BinOpP1Context(_ctx, getState());
		enterRule(_localctx, 0, RULE_binOpP1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
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

	public static class BinOpP2Context extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pWhileParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pWhileParser.MINUS, 0); }
		public BinOpP2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP2Context binOpP2() throws RecognitionException {
		BinOpP2Context _localctx = new BinOpP2Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_binOpP2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	public static class BinOpP3Context extends ParserRuleContext {
		public TerminalNode GT() { return getToken(pWhileParser.GT, 0); }
		public TerminalNode GTE() { return getToken(pWhileParser.GTE, 0); }
		public TerminalNode LT() { return getToken(pWhileParser.LT, 0); }
		public TerminalNode LTE() { return getToken(pWhileParser.LTE, 0); }
		public BinOpP3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP3Context binOpP3() throws RecognitionException {
		BinOpP3Context _localctx = new BinOpP3Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_binOpP3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GTE) | (1L << LT) | (1L << LTE))) != 0)) ) {
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

	public static class BinOpP4Context extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(pWhileParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(pWhileParser.NEQ, 0); }
		public BinOpP4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP4Context binOpP4() throws RecognitionException {
		BinOpP4Context _localctx = new BinOpP4Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_binOpP4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !(_la==EQ || _la==NEQ) ) {
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

	public static class BinOpP5Context extends ParserRuleContext {
		public TerminalNode AND() { return getToken(pWhileParser.AND, 0); }
		public BinOpP5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP5Context binOpP5() throws RecognitionException {
		BinOpP5Context _localctx = new BinOpP5Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_binOpP5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(AND);
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

	public static class BinOpP6Context extends ParserRuleContext {
		public TerminalNode OR() { return getToken(pWhileParser.OR, 0); }
		public BinOpP6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binOpP6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOpP6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOpP6(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOpP6(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinOpP6Context binOpP6() throws RecognitionException {
		BinOpP6Context _localctx = new BinOpP6Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_binOpP6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(OR);
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

	public static class UnaryOpContext extends ParserRuleContext {
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
	 
		public UnaryOpContext() { }
		public void copyFrom(UnaryOpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnaryOpIntContext extends UnaryOpContext {
		public TerminalNode MINUS() { return getToken(pWhileParser.MINUS, 0); }
		public UnaryOpIntContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterUnaryOpInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitUnaryOpInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitUnaryOpInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpBoolContext extends UnaryOpContext {
		public TerminalNode NOT() { return getToken(pWhileParser.NOT, 0); }
		public UnaryOpBoolContext(UnaryOpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterUnaryOpBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitUnaryOpBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitUnaryOpBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_unaryOp);
		try {
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				_localctx = new UnaryOpIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(MINUS);
				}
				break;
			case NOT:
				_localctx = new UnaryOpBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(NOT);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StopContext extends StatContext {
		public TerminalNode STOP() { return getToken(pWhileParser.STOP, 0); }
		public StopContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitStop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitStop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignmentContext extends StatContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public TerminalNode ASSIGN() { return getToken(pWhileParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RandomAssignmentContext extends StatContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public TerminalNode RDASSIGN() { return getToken(pWhileParser.RDASSIGN, 0); }
		public ValueRangeContext valueRange() {
			return getRuleContext(ValueRangeContext.class,0);
		}
		public RandomAssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterRandomAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitRandomAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitRandomAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatlistContext extends StatContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(pWhileParser.SEMICOLON, 0); }
		public StatlistContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterStatlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitStatlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitStatlist(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareVariableContext extends StatContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public TerminalNode DECLARE() { return getToken(pWhileParser.DECLARE, 0); }
		public ValueRangeContext valueRange() {
			return getRuleContext(ValueRangeContext.class,0);
		}
		public DeclareVariableContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterDeclareVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitDeclareVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitDeclareVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SkipContext extends StatContext {
		public TerminalNode SKIPP() { return getToken(pWhileParser.SKIPP, 0); }
		public SkipContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterSkip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitSkip(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitSkip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ChooseContext extends StatContext {
		public TerminalNode CHOOSE() { return getToken(pWhileParser.CHOOSE, 0); }
		public List<PrContext> pr() {
			return getRuleContexts(PrContext.class);
		}
		public PrContext pr(int i) {
			return getRuleContext(PrContext.class,i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(pWhileParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(pWhileParser.DECLARE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode RO() { return getToken(pWhileParser.RO, 0); }
		public List<TerminalNode> ORR() { return getTokens(pWhileParser.ORR); }
		public TerminalNode ORR(int i) {
			return getToken(pWhileParser.ORR, i);
		}
		public ChooseContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterChoose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitChoose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitChoose(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public TerminalNode WHILE() { return getToken(pWhileParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(pWhileParser.DO, 0); }
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode OD() { return getToken(pWhileParser.OD, 0); }
		public List<TerminalNode> OPEN_SQUARE_BRACKET() { return getTokens(pWhileParser.OPEN_SQUARE_BRACKET); }
		public TerminalNode OPEN_SQUARE_BRACKET(int i) {
			return getToken(pWhileParser.OPEN_SQUARE_BRACKET, i);
		}
		public TerminalNode INTEGER() { return getToken(pWhileParser.INTEGER, 0); }
		public List<TerminalNode> CLOSE_SQUARE_BRACKET() { return getTokens(pWhileParser.CLOSE_SQUARE_BRACKET); }
		public TerminalNode CLOSE_SQUARE_BRACKET(int i) {
			return getToken(pWhileParser.CLOSE_SQUARE_BRACKET, i);
		}
		public TerminalNode LT() { return getToken(pWhileParser.LT, 0); }
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public TerminalNode IF() { return getToken(pWhileParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pWhileParser.THEN, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(pWhileParser.ELSE, 0); }
		public TerminalNode FI() { return getToken(pWhileParser.FI, 0); }
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParaIncContext extends StatContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public BinOpP2Context binOpP2() {
			return getRuleContext(BinOpP2Context.class,0);
		}
		public TerminalNode SEQ() { return getToken(pWhileParser.SEQ, 0); }
		public PrContext pr() {
			return getRuleContext(PrContext.class,0);
		}
		public ParaIncContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterParaInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitParaInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitParaInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		return stat(0);
	}

	private StatContext stat(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StatContext _localctx = new StatContext(_ctx, _parentState);
		StatContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_stat, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new SkipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(43);
				match(SKIPP);
				}
				break;
			case 2:
				{
				_localctx = new StopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(STOP);
				}
				break;
			case 3:
				{
				_localctx = new DeclareVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(45);
				match(IDENT);
				setState(46);
				match(DECLARE);
				setState(47);
				valueRange();
				}
				break;
			case 4:
				{
				_localctx = new AssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(48);
				match(IDENT);
				setState(49);
				match(ASSIGN);
				setState(50);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new RandomAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				match(IDENT);
				setState(52);
				match(RDASSIGN);
				setState(53);
				valueRange();
				}
				break;
			case 6:
				{
				_localctx = new IfContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(IF);
				setState(55);
				expr(0);
				setState(56);
				match(THEN);
				setState(57);
				stat(0);
				setState(58);
				match(ELSE);
				setState(59);
				stat(0);
				setState(60);
				match(FI);
				}
				break;
			case 7:
				{
				_localctx = new WhileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(WHILE);
				setState(63);
				expr(0);
				setState(64);
				match(DO);
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(65);
					match(OPEN_SQUARE_BRACKET);
					setState(66);
					match(INTEGER);
					setState(67);
					match(CLOSE_SQUARE_BRACKET);
					}
					break;
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE_BRACKET) {
					{
					setState(70);
					match(OPEN_SQUARE_BRACKET);
					setState(71);
					match(LT);
					setState(72);
					pr();
					setState(73);
					match(CLOSE_SQUARE_BRACKET);
					}
				}

				setState(77);
				stat(0);
				setState(78);
				match(OD);
				}
				break;
			case 8:
				{
				_localctx = new ChooseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(CHOOSE);
				setState(81);
				pr();
				setState(82);
				match(DECLARE);
				setState(83);
				stat(0);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					match(ORR);
					setState(85);
					pr();
					setState(86);
					match(DECLARE);
					setState(87);
					stat(0);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ORR );
				setState(93);
				match(RO);
				}
				break;
			case 9:
				{
				_localctx = new ParaIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95);
				match(IDENT);
				setState(96);
				binOpP2();
				setState(97);
				match(SEQ);
				setState(98);
				pr();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StatlistContext(new StatContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_stat);
					setState(102);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(103);
					match(SEMICOLON);
					setState(104);
					stat(2);
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinOp1ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP1Context binOpP1() {
			return getRuleContext(BinOpP1Context.class,0);
		}
		public BinOp1ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp1Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp1Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp1Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierContext extends ExprContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpExprContext extends ExprContext {
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryOpExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterUnaryOpExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitUnaryOpExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitUnaryOpExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp2ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP2Context binOpP2() {
			return getRuleContext(BinOpP2Context.class,0);
		}
		public BinOp2ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp2Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp2Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp2Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(pWhileParser.BOOL, 0); }
		public BoolContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp5ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP5Context binOpP5() {
			return getRuleContext(BinOpP5Context.class,0);
		}
		public BinOp5ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp5Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp5Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp5Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp6ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP6Context binOpP6() {
			return getRuleContext(BinOpP6Context.class,0);
		}
		public BinOp6ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp6Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp6Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp6Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NestedExprContext extends ExprContext {
		public TerminalNode OPEN_PARENTHESES() { return getToken(pWhileParser.OPEN_PARENTHESES, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PARENTHESES() { return getToken(pWhileParser.CLOSE_PARENTHESES, 0); }
		public NestedExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterNestedExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitNestedExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitNestedExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp4ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP4Context binOpP4() {
			return getRuleContext(BinOpP4Context.class,0);
		}
		public BinOp4ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp4Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp4Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp4Expr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(pWhileParser.INTEGER, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinOp3ExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BinOpP3Context binOpP3() {
			return getRuleContext(BinOpP3Context.class,0);
		}
		public BinOp3ExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterBinOp3Expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitBinOp3Expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitBinOp3Expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(111);
				match(INTEGER);
				}
				break;
			case BOOL:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112);
				match(BOOL);
				}
				break;
			case IDENT:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(IDENT);
				}
				break;
			case MINUS:
			case NOT:
				{
				_localctx = new UnaryOpExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				unaryOp();
				setState(115);
				expr(2);
				}
				break;
			case OPEN_PARENTHESES:
				{
				_localctx = new NestedExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				match(OPEN_PARENTHESES);
				setState(118);
				expr(0);
				setState(119);
				match(CLOSE_PARENTHESES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(149);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(147);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new BinOp1ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(124);
						binOpP1();
						setState(125);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new BinOp2ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(127);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(128);
						binOpP2();
						setState(129);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new BinOp3ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(132);
						binOpP3();
						setState(133);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new BinOp4ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(136);
						binOpP4();
						setState(137);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new BinOp5ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
						binOpP5();
						setState(141);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new BinOp6ExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						binOpP6();
						setState(145);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(151);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class PrContext extends ParserRuleContext {
		public PrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pr; }
	 
		public PrContext() { }
		public void copyFrom(PrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OneOrZeroContext extends PrContext {
		public TerminalNode INTEGER() { return getToken(pWhileParser.INTEGER, 0); }
		public OneOrZeroContext(PrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterOneOrZero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitOneOrZero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitOneOrZero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrVarContext extends PrContext {
		public TerminalNode IDENT() { return getToken(pWhileParser.IDENT, 0); }
		public PrVarContext(PrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterPrVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitPrVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitPrVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalContext extends PrContext {
		public TerminalNode DOT() { return getToken(pWhileParser.DOT, 0); }
		public TerminalNode INTEGER() { return getToken(pWhileParser.INTEGER, 0); }
		public TerminalNode MINUS() { return getToken(pWhileParser.MINUS, 0); }
		public DecimalContext(PrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FractionContext extends PrContext {
		public List<TerminalNode> INTEGER() { return getTokens(pWhileParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(pWhileParser.INTEGER, i);
		}
		public TerminalNode DIV() { return getToken(pWhileParser.DIV, 0); }
		public FractionContext(PrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterFraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitFraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitFraction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrContext pr() throws RecognitionException {
		PrContext _localctx = new PrContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pr);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new FractionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(INTEGER);
				setState(153);
				match(DIV);
				setState(154);
				match(INTEGER);
				}
				break;
			case 2:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(155);
					match(MINUS);
					}
				}

				setState(158);
				match(DOT);
				setState(159);
				match(INTEGER);
				}
				break;
			case 3:
				_localctx = new OneOrZeroContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(INTEGER);
				}
				break;
			case 4:
				_localctx = new PrVarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(161);
				match(IDENT);
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

	public static class ValueRangeContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(pWhileParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(pWhileParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pWhileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pWhileParser.COMMA, i);
		}
		public List<TerminalNode> INTEGER() { return getTokens(pWhileParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(pWhileParser.INTEGER, i);
		}
		public TerminalNode DDOT() { return getToken(pWhileParser.DDOT, 0); }
		public ValueRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterValueRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitValueRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitValueRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueRangeContext valueRange() throws RecognitionException {
		ValueRangeContext _localctx = new ValueRangeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valueRange);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(OPEN_CURLY_BRACKET);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << INTEGER) | (1L << MINUS) | (1L << NOT) | (1L << OPEN_PARENTHESES) | (1L << IDENT))) != 0)) {
					{
					setState(165);
					expr(0);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(166);
						match(COMMA);
						setState(167);
						expr(0);
						}
						}
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(175);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				match(OPEN_CURLY_BRACKET);
				setState(177);
				match(INTEGER);
				setState(178);
				match(DDOT);
				setState(179);
				match(INTEGER);
				setState(180);
				match(CLOSE_CURLY_BRACKET);
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

	public static class ParaContext extends ParserRuleContext {
		public TerminalNode PARA() { return getToken(pWhileParser.PARA, 0); }
		public List<TerminalNode> IDENT() { return getTokens(pWhileParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(pWhileParser.IDENT, i);
		}
		public List<TerminalNode> DECLARE() { return getTokens(pWhileParser.DECLARE); }
		public TerminalNode DECLARE(int i) {
			return getToken(pWhileParser.DECLARE, i);
		}
		public List<TerminalNode> OPEN_SQUARE_BRACKET() { return getTokens(pWhileParser.OPEN_SQUARE_BRACKET); }
		public TerminalNode OPEN_SQUARE_BRACKET(int i) {
			return getToken(pWhileParser.OPEN_SQUARE_BRACKET, i);
		}
		public List<PrContext> pr() {
			return getRuleContexts(PrContext.class);
		}
		public PrContext pr(int i) {
			return getRuleContext(PrContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pWhileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pWhileParser.COMMA, i);
		}
		public List<TerminalNode> CLOSE_SQUARE_BRACKET() { return getTokens(pWhileParser.CLOSE_SQUARE_BRACKET); }
		public TerminalNode CLOSE_SQUARE_BRACKET(int i) {
			return getToken(pWhileParser.CLOSE_SQUARE_BRACKET, i);
		}
		public ParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_para; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParaContext para() throws RecognitionException {
		ParaContext _localctx = new ParaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_para);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(PARA);
			setState(194); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(184);
					match(IDENT);
					setState(185);
					match(DECLARE);
					setState(186);
					match(OPEN_SQUARE_BRACKET);
					setState(187);
					pr();
					setState(188);
					match(COMMA);
					setState(189);
					pr();
					setState(190);
					match(COMMA);
					setState(191);
					pr();
					setState(192);
					match(CLOSE_SQUARE_BRACKET);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(198);
			match(IDENT);
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

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(pWhileParser.VAR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(pWhileParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(pWhileParser.SEMICOLON, i);
		}
		public TerminalNode BEGIN() { return getToken(pWhileParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pWhileParser.END, 0); }
		public TerminalNode EOF() { return getToken(pWhileParser.EOF, 0); }
		public List<ParaContext> para() {
			return getRuleContexts(ParaContext.class);
		}
		public ParaContext para(int i) {
			return getRuleContext(ParaContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pWhileListener ) ((pWhileListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pWhileVisitor ) return ((pWhileVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PARA) {
				{
				{
				setState(200);
				para();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(VAR);
			setState(207);
			stat(0);
			setState(208);
			match(SEMICOLON);
			setState(209);
			match(BEGIN);
			setState(210);
			stat(0);
			setState(211);
			match(SEMICOLON);
			setState(212);
			match(END);
			setState(213);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return stat_sempred((StatContext)_localctx, predIndex);
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean stat_sempred(StatContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u00da\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\5\b+\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tG\n"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\tN\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\6\t\\\n\t\r\t\16\t]\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tg\n\t\3"+
		"\t\3\t\3\t\7\tl\n\t\f\t\16\to\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n|\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099"+
		"\13\n\3\13\3\13\3\13\3\13\5\13\u009f\n\13\3\13\3\13\3\13\3\13\5\13\u00a5"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\5\f\u00b0\n\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b8\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\6\r\u00c5\n\r\r\r\16\r\u00c6\3\r\3\r\3\16\7\16\u00cc\n\16"+
		"\f\16\16\16\u00cf\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\2\4\20\22\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\6\3\2\5\7\3\2\b\t"+
		"\3\2\n\r\3\2\16\17\2\u00ec\2\34\3\2\2\2\4\36\3\2\2\2\6 \3\2\2\2\b\"\3"+
		"\2\2\2\n$\3\2\2\2\f&\3\2\2\2\16*\3\2\2\2\20f\3\2\2\2\22{\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00b7\3\2\2\2\30\u00b9\3\2\2\2\32\u00cd\3\2\2\2\34\35\t\2"+
		"\2\2\35\3\3\2\2\2\36\37\t\3\2\2\37\5\3\2\2\2 !\t\4\2\2!\7\3\2\2\2\"#\t"+
		"\5\2\2#\t\3\2\2\2$%\7\20\2\2%\13\3\2\2\2&\'\7\21\2\2\'\r\3\2\2\2(+\7\t"+
		"\2\2)+\7\22\2\2*(\3\2\2\2*)\3\2\2\2+\17\3\2\2\2,-\b\t\1\2-g\7)\2\2.g\7"+
		"*\2\2/\60\7\62\2\2\60\61\7\36\2\2\61g\5\26\f\2\62\63\7\62\2\2\63\64\7"+
		" \2\2\64g\5\22\n\2\65\66\7\62\2\2\66\67\7\37\2\2\67g\5\26\f\289\7\24\2"+
		"\29:\5\22\n\2:;\7\25\2\2;<\5\20\t\2<=\7\26\2\2=>\5\20\t\2>?\7\27\2\2?"+
		"g\3\2\2\2@A\7\30\2\2AB\5\22\n\2BF\7\31\2\2CD\7\60\2\2DE\7\4\2\2EG\7\61"+
		"\2\2FC\3\2\2\2FG\3\2\2\2GM\3\2\2\2HI\7\60\2\2IJ\7\f\2\2JK\5\24\13\2KL"+
		"\7\61\2\2LN\3\2\2\2MH\3\2\2\2MN\3\2\2\2NO\3\2\2\2OP\5\20\t\2PQ\7\32\2"+
		"\2Qg\3\2\2\2RS\7\33\2\2ST\5\24\13\2TU\7\36\2\2U[\5\20\t\2VW\7\34\2\2W"+
		"X\5\24\13\2XY\7\36\2\2YZ\5\20\t\2Z\\\3\2\2\2[V\3\2\2\2\\]\3\2\2\2][\3"+
		"\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\35\2\2`g\3\2\2\2ab\7\62\2\2bc\5\4\3\2c"+
		"d\7\23\2\2de\5\24\13\2eg\3\2\2\2f,\3\2\2\2f.\3\2\2\2f/\3\2\2\2f\62\3\2"+
		"\2\2f\65\3\2\2\2f8\3\2\2\2f@\3\2\2\2fR\3\2\2\2fa\3\2\2\2gm\3\2\2\2hi\f"+
		"\3\2\2ij\7!\2\2jl\5\20\t\4kh\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2n\21"+
		"\3\2\2\2om\3\2\2\2pq\b\n\1\2q|\7\4\2\2r|\7\3\2\2s|\7\62\2\2tu\5\16\b\2"+
		"uv\5\22\n\4v|\3\2\2\2wx\7,\2\2xy\5\22\n\2yz\7-\2\2z|\3\2\2\2{p\3\2\2\2"+
		"{r\3\2\2\2{s\3\2\2\2{t\3\2\2\2{w\3\2\2\2|\u0097\3\2\2\2}~\f\n\2\2~\177"+
		"\5\2\2\2\177\u0080\5\22\n\13\u0080\u0096\3\2\2\2\u0081\u0082\f\t\2\2\u0082"+
		"\u0083\5\4\3\2\u0083\u0084\5\22\n\n\u0084\u0096\3\2\2\2\u0085\u0086\f"+
		"\b\2\2\u0086\u0087\5\6\4\2\u0087\u0088\5\22\n\t\u0088\u0096\3\2\2\2\u0089"+
		"\u008a\f\7\2\2\u008a\u008b\5\b\5\2\u008b\u008c\5\22\n\b\u008c\u0096\3"+
		"\2\2\2\u008d\u008e\f\6\2\2\u008e\u008f\5\n\6\2\u008f\u0090\5\22\n\7\u0090"+
		"\u0096\3\2\2\2\u0091\u0092\f\5\2\2\u0092\u0093\5\f\7\2\u0093\u0094\5\22"+
		"\n\6\u0094\u0096\3\2\2\2\u0095}\3\2\2\2\u0095\u0081\3\2\2\2\u0095\u0085"+
		"\3\2\2\2\u0095\u0089\3\2\2\2\u0095\u008d\3\2\2\2\u0095\u0091\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2"+
		"\2\u0099\u0097\3\2\2\2\u009a\u009b\7\4\2\2\u009b\u009c\7\6\2\2\u009c\u00a5"+
		"\7\4\2\2\u009d\u009f\7\t\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\7%\2\2\u00a1\u00a5\7\4\2\2\u00a2\u00a5\7\4"+
		"\2\2\u00a3\u00a5\7\62\2\2\u00a4\u009a\3\2\2\2\u00a4\u009e\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\25\3\2\2\2\u00a6\u00af\7.\2\2"+
		"\u00a7\u00ac\5\22\n\2\u00a8\u00a9\7\"\2\2\u00a9\u00ab\5\22\n\2\u00aa\u00a8"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a7\3\2\2\2\u00af\u00b0\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b8\7/\2\2\u00b2\u00b3\7.\2\2\u00b3\u00b4"+
		"\7\4\2\2\u00b4\u00b5\7$\2\2\u00b5\u00b6\7\4\2\2\u00b6\u00b8\7/\2\2\u00b7"+
		"\u00a6\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b8\27\3\2\2\2\u00b9\u00c4\7+\2\2"+
		"\u00ba\u00bb\7\62\2\2\u00bb\u00bc\7\36\2\2\u00bc\u00bd\7\60\2\2\u00bd"+
		"\u00be\5\24\13\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1"+
		"\7\"\2\2\u00c1\u00c2\5\24\13\2\u00c2\u00c3\7\61\2\2\u00c3\u00c5\3\2\2"+
		"\2\u00c4\u00ba\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\62\2\2\u00c9\31\3\2\2\2\u00ca"+
		"\u00cc\5\30\r\2\u00cb\u00ca\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3"+
		"\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d1\7&\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\7\'"+
		"\2\2\u00d4\u00d5\5\20\t\2\u00d5\u00d6\7!\2\2\u00d6\u00d7\7(\2\2\u00d7"+
		"\u00d8\7\2\2\3\u00d8\33\3\2\2\2\22*FM]fm{\u0095\u0097\u009e\u00a4\u00ac"+
		"\u00af\u00b7\u00c6\u00cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}