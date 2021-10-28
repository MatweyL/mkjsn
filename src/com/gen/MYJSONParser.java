package com.gen;// Generated from D:/python/ConfigManagement/mkjsn\MYJSON.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MYJSONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, NULL=5, BOOL=6, STRING=7, COMPOUNDEDSTRING=8, 
		NUMBER=9, WS=10, COMMENTLINES=11, COMMENT=12;
	public static final int
		RULE_prog = 0, RULE_object = 1, RULE_objectKeyValue = 2, RULE_array = 3, 
		RULE_value = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "object", "objectKeyValue", "array", "value"
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

	@Override
	public String getGrammarFileName() { return "MYJSON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MYJSONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYJSONVisitor ) return ((MYJSONVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			object();
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

	public static class ObjectContext extends ParserRuleContext {
		public List<ObjectKeyValueContext> objectKeyValue() {
			return getRuleContexts(ObjectKeyValueContext.class);
		}
		public ObjectKeyValueContext objectKeyValue(int i) {
			return getRuleContext(ObjectKeyValueContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYJSONVisitor ) return ((MYJSONVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(T__0);
			setState(13);
			objectKeyValue();
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING) {
				{
				{
				setState(14);
				objectKeyValue();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20);
			match(T__1);
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

	public static class ObjectKeyValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MYJSONParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ObjectKeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectKeyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).enterObjectKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).exitObjectKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYJSONVisitor ) return ((MYJSONVisitor<? extends T>)visitor).visitObjectKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectKeyValueContext objectKeyValue() throws RecognitionException {
		ObjectKeyValueContext _localctx = new ObjectKeyValueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_objectKeyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(STRING);
			setState(23);
			value();
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

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYJSONVisitor ) return ((MYJSONVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__2);
			setState(26);
			value();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << NULL) | (1L << BOOL) | (1L << STRING) | (1L << COMPOUNDEDSTRING) | (1L << NUMBER))) != 0)) {
				{
				{
				setState(27);
				value();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			match(T__3);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(MYJSONParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(MYJSONParser.STRING, 0); }
		public TerminalNode COMPOUNDEDSTRING() { return getToken(MYJSONParser.COMPOUNDEDSTRING, 0); }
		public TerminalNode NULL() { return getToken(MYJSONParser.NULL, 0); }
		public TerminalNode BOOL() { return getToken(MYJSONParser.BOOL, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MYJSONListener ) ((MYJSONListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MYJSONVisitor ) return ((MYJSONVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(STRING);
				}
				break;
			case COMPOUNDEDSTRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(COMPOUNDEDSTRING);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				match(NULL);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				match(BOOL);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				array();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 7);
				{
				setState(41);
				object();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16/\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\3\3\3\3\3\7\3\22\n\3\f\3\16\3\25"+
		"\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\7\5\37\n\5\f\5\16\5\"\13\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6-\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2\61\2"+
		"\f\3\2\2\2\4\16\3\2\2\2\6\30\3\2\2\2\b\33\3\2\2\2\n,\3\2\2\2\f\r\5\4\3"+
		"\2\r\3\3\2\2\2\16\17\7\3\2\2\17\23\5\6\4\2\20\22\5\6\4\2\21\20\3\2\2\2"+
		"\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2"+
		"\26\27\7\4\2\2\27\5\3\2\2\2\30\31\7\t\2\2\31\32\5\n\6\2\32\7\3\2\2\2\33"+
		"\34\7\5\2\2\34 \5\n\6\2\35\37\5\n\6\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3"+
		"\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\6\2\2$\t\3\2\2\2%-\7\13\2\2"+
		"&-\7\t\2\2\'-\7\n\2\2(-\7\7\2\2)-\7\b\2\2*-\5\b\5\2+-\5\4\3\2,%\3\2\2"+
		"\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\13\3"+
		"\2\2\2\5\23 ,";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}