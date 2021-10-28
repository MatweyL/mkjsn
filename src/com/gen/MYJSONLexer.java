package com.gen;// Generated from D:/python/ConfigManagement/mkjsn\MYJSON.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MYJSONLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, NULL=3, BOOL=4, STRING=5, NUMBER=6, WS=7, COMMENTLINES=8, 
		COMMENT=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "NULL", "BOOL", "STRING", "NUMBER", "WS", "COMMENTLINES", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "NULL", "BOOL", "STRING", "NUMBER", "WS", "COMMENTLINES", 
			"COMMENT"
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


	public MYJSONLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MYJSON.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5("+
		"\n\5\3\6\6\6+\n\6\r\6\16\6,\3\7\5\7\60\n\7\3\7\6\7\63\n\7\r\7\16\7\64"+
		"\3\7\5\78\n\7\3\7\6\7;\n\7\r\7\16\7<\3\7\5\7@\n\7\3\7\6\7C\n\7\r\7\16"+
		"\7D\5\7G\n\7\3\b\6\bJ\n\b\r\b\16\bK\3\b\3\b\3\t\3\t\3\t\3\t\7\tT\n\t\f"+
		"\t\16\tW\13\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\7\nb\n\n\f\n\16\ne\13"+
		"\n\3\n\3\n\3U\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\b\6\2"+
		"\62;C\\aac|\3\2//\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\4\2\f\f\17\17\2"+
		"s\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\25\3\2\2\2\5\27\3\2\2\2"+
		"\7\31\3\2\2\2\t\'\3\2\2\2\13*\3\2\2\2\rF\3\2\2\2\17I\3\2\2\2\21O\3\2\2"+
		"\2\23]\3\2\2\2\25\26\7*\2\2\26\4\3\2\2\2\27\30\7+\2\2\30\6\3\2\2\2\31"+
		"\32\7p\2\2\32\33\7w\2\2\33\34\7n\2\2\34\35\7n\2\2\35\b\3\2\2\2\36\37\7"+
		"v\2\2\37 \7t\2\2 !\7w\2\2!(\7g\2\2\"#\7h\2\2#$\7c\2\2$%\7n\2\2%&\7u\2"+
		"\2&(\7g\2\2\'\36\3\2\2\2\'\"\3\2\2\2(\n\3\2\2\2)+\t\2\2\2*)\3\2\2\2+,"+
		"\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\f\3\2\2\2.\60\t\3\2\2/.\3\2\2\2/\60\3\2"+
		"\2\2\60\62\3\2\2\2\61\63\t\4\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2"+
		"\2\2\64\65\3\2\2\2\65G\3\2\2\2\668\t\3\2\2\67\66\3\2\2\2\678\3\2\2\28"+
		":\3\2\2\29;\t\4\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2"+
		">@\t\5\2\2?>\3\2\2\2?@\3\2\2\2@B\3\2\2\2AC\t\4\2\2BA\3\2\2\2CD\3\2\2\2"+
		"DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2F/\3\2\2\2F\67\3\2\2\2G\16\3\2\2\2HJ\t\6"+
		"\2\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\b\b\2\2N\20\3"+
		"\2\2\2OP\7\61\2\2PQ\7,\2\2QU\3\2\2\2RT\13\2\2\2SR\3\2\2\2TW\3\2\2\2UV"+
		"\3\2\2\2US\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7,\2\2YZ\7\61\2\2Z[\3\2\2\2["+
		"\\\b\t\2\2\\\22\3\2\2\2]^\7\61\2\2^_\7\61\2\2_c\3\2\2\2`b\n\7\2\2a`\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\b\n\2\2g\24"+
		"\3\2\2\2\17\2\',/\64\67<?DFKUc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}