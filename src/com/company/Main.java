package com.company;

import com.gen.MYJSONLexer;
import com.gen.MYJSONParser;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pathToFile;
        try {
            pathToFile = args[0];
            InputStream file = new FileInputStream(pathToFile);
            MYJSONLexer myjsonLexer = new MYJSONLexer(new ANTLRInputStream(file));
            CommonTokenStream tokens = new CommonTokenStream(myjsonLexer);
            MYJSONParser myjsonParser = new MYJSONParser(tokens);
            myjsonParser.setBuildParseTree(true);
            MYJSONParser.ProgContext ctx = myjsonParser.prog();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new TreeWalker(), ctx);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}