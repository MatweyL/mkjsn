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
		T__0=1, T__1=2, T__2=3, T__3=4, NULL=5, BOOL=6, STRING=7, COMPOUNDEDSTRING=8, 
		NUMBER=9, WS=10, COMMENTLINES=11, COMMENT=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "NULL", "BOOL", "STRING", "COMPOUNDEDSTRING", 
			"NUMBER", "WS", "COMMENTLINES", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "NULL", "BOOL", "STRING", "COMPOUNDEDSTRING", 
			"NUMBER", "WS", "COMMENTLINES", "COMMENT"
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16\177\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\62\n\7\3\b\3\b\3\b\7\b\67"+
		"\n\b\f\b\16\b:\13\b\3\t\3\t\3\t\7\t?\n\t\f\t\16\tB\13\t\3\t\3\t\3\n\5"+
		"\nG\n\n\3\n\6\nJ\n\n\r\n\16\nK\3\n\5\nO\n\n\3\n\6\nR\n\n\r\n\16\nS\3\n"+
		"\5\nW\n\n\3\n\6\nZ\n\n\r\n\16\n[\5\n^\n\n\3\13\6\13a\n\13\r\13\16\13b"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\7\fk\n\f\f\f\16\fn\13\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\7\ry\n\r\f\r\16\r|\13\r\3\r\3\r\3l\2\16\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\t\6\2C\\aac|\u0412\u0451"+
		"\b\2/\60\62;C\\aac|\u0412\u0451\5\2\13\f\17\17\"\"\3\2//\3\2\62;\3\2\60"+
		"\60\4\2\f\f\17\17\2\u008c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3"+
		"\2\2\2\t!\3\2\2\2\13#\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21;\3\2\2\2\23"+
		"]\3\2\2\2\25`\3\2\2\2\27f\3\2\2\2\31t\3\2\2\2\33\34\7*\2\2\34\4\3\2\2"+
		"\2\35\36\7+\2\2\36\6\3\2\2\2\37 \7}\2\2 \b\3\2\2\2!\"\7\177\2\2\"\n\3"+
		"\2\2\2#$\7p\2\2$%\7w\2\2%&\7n\2\2&\'\7n\2\2\'\f\3\2\2\2()\7v\2\2)*\7t"+
		"\2\2*+\7w\2\2+\62\7g\2\2,-\7h\2\2-.\7c\2\2./\7n\2\2/\60\7u\2\2\60\62\7"+
		"g\2\2\61(\3\2\2\2\61,\3\2\2\2\62\16\3\2\2\2\63\64\t\2\2\2\648\b\b\2\2"+
		"\65\67\t\3\2\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\20\3\2"+
		"\2\2:8\3\2\2\2;@\7$\2\2<?\5\17\b\2=?\t\4\2\2><\3\2\2\2>=\3\2\2\2?B\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\7$\2\2D\22\3\2\2\2EG\t"+
		"\5\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\t\6\2\2IH\3\2\2\2JK\3\2\2\2KI\3"+
		"\2\2\2KL\3\2\2\2L^\3\2\2\2MO\t\5\2\2NM\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PR\t"+
		"\6\2\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UW\t\7\2\2VU\3"+
		"\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\t\6\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2]F\3\2\2\2]N\3\2\2\2^\24\3\2\2\2_a\t\4\2\2`_\3\2\2"+
		"\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\13\3\2e\26\3\2\2\2fg\7"+
		"\61\2\2gh\7,\2\2hl\3\2\2\2ik\13\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj"+
		"\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\7,\2\2pq\7\61\2\2qr\3\2\2\2rs\b\f\3\2s"+
		"\30\3\2\2\2tu\7\61\2\2uv\7\61\2\2vz\3\2\2\2wy\n\b\2\2xw\3\2\2\2y|\3\2"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\b\r\3\2~\32\3\2\2\2\21"+
		"\2\618>@FKNSV[]blz\4\3\b\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}