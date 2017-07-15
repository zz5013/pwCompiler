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
		LT=10, LTE=11, EQ=12, NEQ=13, AND=14, OR=15, NOT=16, IF=17, THEN=18, ELSE=19, 
		FI=20, WHILE=21, DO=22, OD=23, CHOOSE=24, ORR=25, RO=26, DECLARE=27, RDASSIGN=28, 
		ASSIGN=29, SEMICOLON=30, COMMA=31, HASH=32, DDOT=33, DOT=34, VAR=35, BEGIN=36, 
		END=37, SKIPP=38, STOP=39, PARA=40, OPEN_PARENTHESES=41, CLOSE_PARENTHESES=42, 
		OPEN_CURLY_BRACKET=43, CLOSE_CURLY_BRACKET=44, OPEN_SQUARE_BRACKET=45, 
		CLOSE_SQUARE_BRACKET=46, IDENT=47, ESCAPEDCHAR=48, WHITESPACE=49, COMMENT=50;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"BOOL", "INTEGER", "MUL", "DIV", "MOD", "PLUS", "MINUS", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "AND", "OR", "NOT", "IF", "THEN", "ELSE", "FI", 
		"WHILE", "DO", "OD", "CHOOSE", "ORR", "RO", "DECLARE", "RDASSIGN", "ASSIGN", 
		"SEMICOLON", "COMMA", "HASH", "DDOT", "DOT", "VAR", "BEGIN", "END", "SKIPP", 
		"STOP", "PARA", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", "OPEN_CURLY_BRACKET", 
		"CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
		"IDENT", "UNDERSCORE", "LOWERALPHA", "UPPERALPHA", "CHAR_FRAG", "DIGIT", 
		"SIGN", "ESCAPEDCHAR", "WHITESPACE", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'*'", "'/'", "'%'", "'+'", "'-'", "'>'", "'>='", "'<'", 
		"'<='", "'=='", "'!='", "'&&'", "'||'", "'!'", "'if'", "'then'", "'else'", 
		"'fi'", "'while'", "'do'", "'od'", "'choose'", "'or'", "'ro'", "':'", 
		"'?='", "':='", "';'", "','", "'#'", "'..'", "'.'", "'var'", "'begin'", 
		"'end'", "'skip'", "'stop'", "'para'", "'('", "')'", "'{'", "'}'", "'['", 
		"']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "BOOL", "INTEGER", "MUL", "DIV", "MOD", "PLUS", "MINUS", "GT", "GTE", 
		"LT", "LTE", "EQ", "NEQ", "AND", "OR", "NOT", "IF", "THEN", "ELSE", "FI", 
		"WHILE", "DO", "OD", "CHOOSE", "ORR", "RO", "DECLARE", "RDASSIGN", "ASSIGN", 
		"SEMICOLON", "COMMA", "HASH", "DDOT", "DOT", "VAR", "BEGIN", "END", "SKIPP", 
		"STOP", "PARA", "OPEN_PARENTHESES", "CLOSE_PARENTHESES", "OPEN_CURLY_BRACKET", 
		"CLOSE_CURLY_BRACKET", "OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\5\2}\n\2\3\3\5\3\u0080\n\3\3\3\6\3\u0083\n\3\r\3\16\3\u0084"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3"+
		"/\3/\3\60\3\60\3\60\5\60\u0111\n\60\3\60\3\60\3\60\3\60\7\60\u0117\n\60"+
		"\f\60\16\60\u011a\13\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\64\5"+
		"\64\u0125\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\38\39\39\79\u0133"+
		"\n9\f9\169\u0136\139\39\39\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\2c\2e\2g\2i\2k\2m\62o\63q\64\3\2\7\5\2$$))^^\4\2--//\n\2$$"+
		"))\62\62ddhhppttvv\4\2\13\f\"\"\3\2\f\f\2\u013f\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\3|\3\2\2\2\5\177\3\2\2\2\7\u0086\3\2\2\2\t\u0088\3\2\2\2\13\u008a"+
		"\3\2\2\2\r\u008c\3\2\2\2\17\u008e\3\2\2\2\21\u0090\3\2\2\2\23\u0092\3"+
		"\2\2\2\25\u0095\3\2\2\2\27\u0097\3\2\2\2\31\u009a\3\2\2\2\33\u009d\3\2"+
		"\2\2\35\u00a0\3\2\2\2\37\u00a3\3\2\2\2!\u00a6\3\2\2\2#\u00a8\3\2\2\2%"+
		"\u00ab\3\2\2\2\'\u00b0\3\2\2\2)\u00b5\3\2\2\2+\u00b8\3\2\2\2-\u00be\3"+
		"\2\2\2/\u00c1\3\2\2\2\61\u00c4\3\2\2\2\63\u00cb\3\2\2\2\65\u00ce\3\2\2"+
		"\2\67\u00d1\3\2\2\29\u00d3\3\2\2\2;\u00d6\3\2\2\2=\u00d9\3\2\2\2?\u00db"+
		"\3\2\2\2A\u00dd\3\2\2\2C\u00df\3\2\2\2E\u00e2\3\2\2\2G\u00e4\3\2\2\2I"+
		"\u00e8\3\2\2\2K\u00ee\3\2\2\2M\u00f2\3\2\2\2O\u00f7\3\2\2\2Q\u00fc\3\2"+
		"\2\2S\u0101\3\2\2\2U\u0103\3\2\2\2W\u0105\3\2\2\2Y\u0107\3\2\2\2[\u0109"+
		"\3\2\2\2]\u010b\3\2\2\2_\u0110\3\2\2\2a\u011b\3\2\2\2c\u011d\3\2\2\2e"+
		"\u011f\3\2\2\2g\u0124\3\2\2\2i\u0126\3\2\2\2k\u0128\3\2\2\2m\u012a\3\2"+
		"\2\2o\u012c\3\2\2\2q\u0130\3\2\2\2st\7v\2\2tu\7t\2\2uv\7w\2\2v}\7g\2\2"+
		"wx\7h\2\2xy\7c\2\2yz\7n\2\2z{\7u\2\2{}\7g\2\2|s\3\2\2\2|w\3\2\2\2}\4\3"+
		"\2\2\2~\u0080\5k\66\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\u0083\5i\65\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\6\3\2\2\2\u0086\u0087\7,\2\2\u0087"+
		"\b\3\2\2\2\u0088\u0089\7\61\2\2\u0089\n\3\2\2\2\u008a\u008b\7\'\2\2\u008b"+
		"\f\3\2\2\2\u008c\u008d\7-\2\2\u008d\16\3\2\2\2\u008e\u008f\7/\2\2\u008f"+
		"\20\3\2\2\2\u0090\u0091\7@\2\2\u0091\22\3\2\2\2\u0092\u0093\7@\2\2\u0093"+
		"\u0094\7?\2\2\u0094\24\3\2\2\2\u0095\u0096\7>\2\2\u0096\26\3\2\2\2\u0097"+
		"\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099\30\3\2\2\2\u009a\u009b\7?\2\2\u009b"+
		"\u009c\7?\2\2\u009c\32\3\2\2\2\u009d\u009e\7#\2\2\u009e\u009f\7?\2\2\u009f"+
		"\34\3\2\2\2\u00a0\u00a1\7(\2\2\u00a1\u00a2\7(\2\2\u00a2\36\3\2\2\2\u00a3"+
		"\u00a4\7~\2\2\u00a4\u00a5\7~\2\2\u00a5 \3\2\2\2\u00a6\u00a7\7#\2\2\u00a7"+
		"\"\3\2\2\2\u00a8\u00a9\7k\2\2\u00a9\u00aa\7h\2\2\u00aa$\3\2\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7p\2\2"+
		"\u00af&\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7u\2"+
		"\2\u00b3\u00b4\7g\2\2\u00b4(\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7\7"+
		"k\2\2\u00b7*\3\2\2\2\u00b8\u00b9\7y\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd\7g\2\2\u00bd,\3\2\2\2\u00be\u00bf"+
		"\7f\2\2\u00bf\u00c0\7q\2\2\u00c0.\3\2\2\2\u00c1\u00c2\7q\2\2\u00c2\u00c3"+
		"\7f\2\2\u00c3\60\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7j\2\2\u00c6\u00c7"+
		"\7q\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca"+
		"\62\3\2\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd\64\3\2\2\2\u00ce"+
		"\u00cf\7t\2\2\u00cf\u00d0\7q\2\2\u00d0\66\3\2\2\2\u00d1\u00d2\7<\2\2\u00d2"+
		"8\3\2\2\2\u00d3\u00d4\7A\2\2\u00d4\u00d5\7?\2\2\u00d5:\3\2\2\2\u00d6\u00d7"+
		"\7<\2\2\u00d7\u00d8\7?\2\2\u00d8<\3\2\2\2\u00d9\u00da\7=\2\2\u00da>\3"+
		"\2\2\2\u00db\u00dc\7.\2\2\u00dc@\3\2\2\2\u00dd\u00de\7%\2\2\u00deB\3\2"+
		"\2\2\u00df\u00e0\7\60\2\2\u00e0\u00e1\7\60\2\2\u00e1D\3\2\2\2\u00e2\u00e3"+
		"\7\60\2\2\u00e3F\3\2\2\2\u00e4\u00e5\7x\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7"+
		"\7t\2\2\u00e7H\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7i\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00edJ\3\2\2\2\u00ee\u00ef"+
		"\7g\2\2\u00ef\u00f0\7p\2\2\u00f0\u00f1\7f\2\2\u00f1L\3\2\2\2\u00f2\u00f3"+
		"\7u\2\2\u00f3\u00f4\7m\2\2\u00f4\u00f5\7k\2\2\u00f5\u00f6\7r\2\2\u00f6"+
		"N\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7q\2\2\u00fa"+
		"\u00fb\7r\2\2\u00fbP\3\2\2\2\u00fc\u00fd\7r\2\2\u00fd\u00fe\7c\2\2\u00fe"+
		"\u00ff\7t\2\2\u00ff\u0100\7c\2\2\u0100R\3\2\2\2\u0101\u0102\7*\2\2\u0102"+
		"T\3\2\2\2\u0103\u0104\7+\2\2\u0104V\3\2\2\2\u0105\u0106\7}\2\2\u0106X"+
		"\3\2\2\2\u0107\u0108\7\177\2\2\u0108Z\3\2\2\2\u0109\u010a\7]\2\2\u010a"+
		"\\\3\2\2\2\u010b\u010c\7_\2\2\u010c^\3\2\2\2\u010d\u0111\5a\61\2\u010e"+
		"\u0111\5c\62\2\u010f\u0111\5e\63\2\u0110\u010d\3\2\2\2\u0110\u010e\3\2"+
		"\2\2\u0110\u010f\3\2\2\2\u0111\u0118\3\2\2\2\u0112\u0117\5a\61\2\u0113"+
		"\u0117\5c\62\2\u0114\u0117\5e\63\2\u0115\u0117\5i\65\2\u0116\u0112\3\2"+
		"\2\2\u0116\u0113\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0115\3\2\2\2\u0117"+
		"\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119`\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011b\u011c\7a\2\2\u011cb\3\2\2\2\u011d\u011e\4c"+
		"|\2\u011ed\3\2\2\2\u011f\u0120\4C\\\2\u0120f\3\2\2\2\u0121\u0125\n\2\2"+
		"\2\u0122\u0123\7^\2\2\u0123\u0125\5m\67\2\u0124\u0121\3\2\2\2\u0124\u0122"+
		"\3\2\2\2\u0125h\3\2\2\2\u0126\u0127\4\62;\2\u0127j\3\2\2\2\u0128\u0129"+
		"\t\3\2\2\u0129l\3\2\2\2\u012a\u012b\t\4\2\2\u012bn\3\2\2\2\u012c\u012d"+
		"\t\5\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b8\2\2\u012fp\3\2\2\2\u0130\u0134"+
		"\5A!\2\u0131\u0133\n\6\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2"+
		"\2\2\u0137\u0138\7\f\2\2\u0138\u0139\3\2\2\2\u0139\u013a\b9\2\2\u013a"+
		"r\3\2\2\2\13\2|\177\u0084\u0110\u0116\u0118\u0124\u0134\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}