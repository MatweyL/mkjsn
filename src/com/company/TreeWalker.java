package com.company;

import com.gen.MYJSONBaseListener;
import com.gen.MYJSONParser;

import javax.json.stream.JsonParser;

public class TreeWalker extends MYJSONBaseListener {
    public void enterProg(MYJSONParser.ProgContext ctx ) {
        System.out.println( "Entering Prog : " + ctx.getText() );
    }

    public void exitProg(MYJSONParser.ProgContext ctx ) {
        System.out.println( "Exiting Prog" );
    }
}
