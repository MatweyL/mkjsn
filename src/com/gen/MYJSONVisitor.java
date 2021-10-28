package com.gen;// Generated from D:/python/ConfigManagement/mkjsn\MYJSON.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MYJSONParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MYJSONVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MYJSONParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MYJSONParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYJSONParser#objectKeyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYJSONParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MYJSONParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MYJSONParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MYJSONParser.ValueContext ctx);
}