package com.gen;// Generated from D:/python/ConfigManagement/mkjsn\MYJSON.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MYJSONParser}.
 */
public interface MYJSONListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MYJSONParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MYJSONParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYJSONParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MYJSONParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYJSONParser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void enterObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYJSONParser#objectKeyValue}.
	 * @param ctx the parse tree
	 */
	void exitObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYJSONParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MYJSONParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYJSONParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MYJSONParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MYJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MYJSONParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MYJSONParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MYJSONParser.ValueContext ctx);
}