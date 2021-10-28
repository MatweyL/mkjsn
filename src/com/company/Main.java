package com.company;

import com.gen.MYJSONLexer;
import com.gen.MYJSONParser;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(1);
        MYJSONLexer myjsonLexer = new MYJSONLexer(CharStreams.fromString("(\n" +
                "    chill null \n" +
                "    Bob true\n" +
                "    Lisa (age 31 cats {Tom Gosha Barsik})\n" +
                "\n" +
                ")"));
        CommonTokenStream tokens = new CommonTokenStream(myjsonLexer);
        MYJSONParser myjsonParser = new MYJSONParser(tokens);
        myjsonParser.setBuildParseTree(true);
        MYJSONParser.ProgContext ctx = myjsonParser.prog();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new TreeWalker(), ctx);


    }
}