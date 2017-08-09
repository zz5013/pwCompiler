// Generated from /homes/zz5013/pwhile/src/pWhile.g4 by ANTLR 4.7
package pwCompiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pWhileLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOL", "INTEGER", "MUL", "DIV", "MOD", "PLUS", "MINUS", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "AND", "OR", "NOT", "SEQ", "IF", "THEN", "ELSE", 
		"FI", "WHILE", "DO", "OD", "CHOOSE", "ORR", "RO", "DECLARE", "RDASSIGN", 
		"ASSIGN", "SEMICOLON", "COMMA", "HASH", "DDOT", "DOT", "VAR", "BEGIN", 
		"END", "SKIPP", "STOP", "PARA", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", 
		"OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"IDENT", "UNDERSCORE", "LOWERALPHA", "UPPERALPHA", "CHAR_FRAG", "DIGIT", 
		"SIGN", "ESCAPEDCHAR", "WHITESPACE", "COMMENT"
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


	public pWhileLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "pWhile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\65\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2\177\n\2\3\3\5\3\u0082\n\3\3\3\6\3\u0085\n\3\r"+
		"\3\16\3\u0086\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		" \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3,\3,\3"+
		"-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\5\61\u0115\n\61\3\61\3\61\3"+
		"\61\3\61\7\61\u011b\n\61\f\61\16\61\u011e\13\61\3\62\3\62\3\63\3\63\3"+
		"\64\3\64\3\65\3\65\3\65\5\65\u0129\n\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\39\39\3:\3:\7:\u0137\n:\f:\16:\u013a\13:\3:\3:\3:\3:\2\2;\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\2e\2g\2i\2k\2m\2o\63q\64s\65\3"+
		"\2\7\5\2$$))^^\4\2--//\n\2$$))\62\62ddhhppttvv\4\2\13\f\"\"\3\2\f\f\2"+
		"\u0143\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3~\3\2\2\2\5\u0081\3\2"+
		"\2\2\7\u0088\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2\2"+
		"\17\u0090\3\2\2\2\21\u0092\3\2\2\2\23\u0094\3\2\2\2\25\u0097\3\2\2\2\27"+
		"\u0099\3\2\2\2\31\u009c\3\2\2\2\33\u009f\3\2\2\2\35\u00a2\3\2\2\2\37\u00a5"+
		"\3\2\2\2!\u00a8\3\2\2\2#\u00aa\3\2\2\2%\u00ac\3\2\2\2\'\u00af\3\2\2\2"+
		")\u00b4\3\2\2\2+\u00b9\3\2\2\2-\u00bc\3\2\2\2/\u00c2\3\2\2\2\61\u00c5"+
		"\3\2\2\2\63\u00c8\3\2\2\2\65\u00cf\3\2\2\2\67\u00d2\3\2\2\29\u00d5\3\2"+
		"\2\2;\u00d7\3\2\2\2=\u00da\3\2\2\2?\u00dd\3\2\2\2A\u00df\3\2\2\2C\u00e1"+
		"\3\2\2\2E\u00e3\3\2\2\2G\u00e6\3\2\2\2I\u00e8\3\2\2\2K\u00ec\3\2\2\2M"+
		"\u00f2\3\2\2\2O\u00f6\3\2\2\2Q\u00fb\3\2\2\2S\u0100\3\2\2\2U\u0105\3\2"+
		"\2\2W\u0107\3\2\2\2Y\u0109\3\2\2\2[\u010b\3\2\2\2]\u010d\3\2\2\2_\u010f"+
		"\3\2\2\2a\u0114\3\2\2\2c\u011f\3\2\2\2e\u0121\3\2\2\2g\u0123\3\2\2\2i"+
		"\u0128\3\2\2\2k\u012a\3\2\2\2m\u012c\3\2\2\2o\u012e\3\2\2\2q\u0130\3\2"+
		"\2\2s\u0134\3\2\2\2uv\7v\2\2vw\7t\2\2wx\7w\2\2x\177\7g\2\2yz\7h\2\2z{"+
		"\7c\2\2{|\7n\2\2|}\7u\2\2}\177\7g\2\2~u\3\2\2\2~y\3\2\2\2\177\4\3\2\2"+
		"\2\u0080\u0082\5m\67\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0085\5k\66\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\6\3\2\2\2\u0088\u0089\7,\2\2"+
		"\u0089\b\3\2\2\2\u008a\u008b\7\61\2\2\u008b\n\3\2\2\2\u008c\u008d\7\'"+
		"\2\2\u008d\f\3\2\2\2\u008e\u008f\7-\2\2\u008f\16\3\2\2\2\u0090\u0091\7"+
		"/\2\2\u0091\20\3\2\2\2\u0092\u0093\7@\2\2\u0093\22\3\2\2\2\u0094\u0095"+
		"\7@\2\2\u0095\u0096\7?\2\2\u0096\24\3\2\2\2\u0097\u0098\7>\2\2\u0098\26"+
		"\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b\7?\2\2\u009b\30\3\2\2\2\u009c"+
		"\u009d\7?\2\2\u009d\u009e\7?\2\2\u009e\32\3\2\2\2\u009f\u00a0\7#\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1\34\3\2\2\2\u00a2\u00a3\7(\2\2\u00a3\u00a4\7(\2\2\u00a4"+
		"\36\3\2\2\2\u00a5\u00a6\7~\2\2\u00a6\u00a7\7~\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\7#\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab$\3\2\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7h\2\2\u00ae&\3\2\2\2\u00af\u00b0\7v\2\2\u00b0"+
		"\u00b1\7j\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7p\2\2\u00b3(\3\2\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8*\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7k\2\2\u00bb,\3\2\2\2\u00bc"+
		"\u00bd\7y\2\2\u00bd\u00be\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2"+
		"\u00c0\u00c1\7g\2\2\u00c1.\3\2\2\2\u00c2\u00c3\7f\2\2\u00c3\u00c4\7q\2"+
		"\2\u00c4\60\3\2\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7f\2\2\u00c7\62\3\2"+
		"\2\2\u00c8\u00c9\7e\2\2\u00c9\u00ca\7j\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7q\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\64\3\2\2\2\u00cf\u00d0"+
		"\7q\2\2\u00d0\u00d1\7t\2\2\u00d1\66\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4"+
		"\7q\2\2\u00d48\3\2\2\2\u00d5\u00d6\7<\2\2\u00d6:\3\2\2\2\u00d7\u00d8\7"+
		"A\2\2\u00d8\u00d9\7?\2\2\u00d9<\3\2\2\2\u00da\u00db\7<\2\2\u00db\u00dc"+
		"\7?\2\2\u00dc>\3\2\2\2\u00dd\u00de\7=\2\2\u00de@\3\2\2\2\u00df\u00e0\7"+
		".\2\2\u00e0B\3\2\2\2\u00e1\u00e2\7%\2\2\u00e2D\3\2\2\2\u00e3\u00e4\7\60"+
		"\2\2\u00e4\u00e5\7\60\2\2\u00e5F\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7H\3"+
		"\2\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb\7t\2\2\u00eb"+
		"J\3\2\2\2\u00ec\u00ed\7d\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7i\2\2\u00ef"+
		"\u00f0\7k\2\2\u00f0\u00f1\7p\2\2\u00f1L\3\2\2\2\u00f2\u00f3\7g\2\2\u00f3"+
		"\u00f4\7p\2\2\u00f4\u00f5\7f\2\2\u00f5N\3\2\2\2\u00f6\u00f7\7u\2\2\u00f7"+
		"\u00f8\7m\2\2\u00f8\u00f9\7k\2\2\u00f9\u00fa\7r\2\2\u00faP\3\2\2\2\u00fb"+
		"\u00fc\7u\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7r\2\2"+
		"\u00ffR\3\2\2\2\u0100\u0101\7r\2\2\u0101\u0102\7c\2\2\u0102\u0103\7t\2"+
		"\2\u0103\u0104\7c\2\2\u0104T\3\2\2\2\u0105\u0106\7*\2\2\u0106V\3\2\2\2"+
		"\u0107\u0108\7+\2\2\u0108X\3\2\2\2\u0109\u010a\7}\2\2\u010aZ\3\2\2\2\u010b"+
		"\u010c\7\177\2\2\u010c\\\3\2\2\2\u010d\u010e\7]\2\2\u010e^\3\2\2\2\u010f"+
		"\u0110\7_\2\2\u0110`\3\2\2\2\u0111\u0115\5c\62\2\u0112\u0115\5e\63\2\u0113"+
		"\u0115\5g\64\2\u0114\u0111\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0113\3\2"+
		"\2\2\u0115\u011c\3\2\2\2\u0116\u011b\5c\62\2\u0117\u011b\5e\63\2\u0118"+
		"\u011b\5g\64\2\u0119\u011b\5k\66\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2"+
		"\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011db\3\2\2\2\u011e\u011c\3\2\2\2"+
		"\u011f\u0120\7a\2\2\u0120d\3\2\2\2\u0121\u0122\4c|\2\u0122f\3\2\2\2\u0123"+
		"\u0124\4C\\\2\u0124h\3\2\2\2\u0125\u0129\n\2\2\2\u0126\u0127\7^\2\2\u0127"+
		"\u0129\5o8\2\u0128\u0125\3\2\2\2\u0128\u0126\3\2\2\2\u0129j\3\2\2\2\u012a"+
		"\u012b\4\62;\2\u012bl\3\2\2\2\u012c\u012d\t\3\2\2\u012dn\3\2\2\2\u012e"+
		"\u012f\t\4\2\2\u012fp\3\2\2\2\u0130\u0131\t\5\2\2\u0131\u0132\3\2\2\2"+
		"\u0132\u0133\b9\2\2\u0133r\3\2\2\2\u0134\u0138\5C\"\2\u0135\u0137\n\6"+
		"\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\f"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\b:\2\2\u013et\3\2\2\2\13\2~\u0081"+
		"\u0086\u0114\u011a\u011c\u0128\u0138\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}