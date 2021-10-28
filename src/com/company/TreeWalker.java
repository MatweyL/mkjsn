package com.company;

import com.gen.MYJSONBaseListener;
import com.gen.MYJSONParser;

import javax.json.JsonObject;
import javax.json.stream.JsonParser;
import java.util.HashMap;
import java.util.Map;

public class TreeWalker extends MYJSONBaseListener {

    private StringBuffer json = new StringBuffer();

    @Override
    public void enterObject(MYJSONParser.ObjectContext ctx) {
        super.enterObject(ctx);
        System.out.println("{");
        json.append("{");
    }

    @Override
    public void exitObject(MYJSONParser.ObjectContext ctx) {
        super.exitObject(ctx);
        System.out.println("}");
        json.delete(json.length() - 1, json.length());
        json.append("}");
    }

    @Override
    public void enterObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx) {
        super.enterObjectKeyValue(ctx);
        System.out.println(" \"" + ctx.STRING() + "\" : ");
        json.append(" \"" + ctx.STRING() + "\" : ");
    }

    @Override
    public void exitObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx) {
        super.exitObjectKeyValue(ctx);
    }

    @Override
    public void enterArray(MYJSONParser.ArrayContext ctx) {
        super.enterArray(ctx);
        System.out.println("[");
        json.append("[");
    }

    @Override
    public void exitArray(MYJSONParser.ArrayContext ctx) {
        super.exitArray(ctx);
        System.out.println("]");
        json.delete(json.length() - 1, json.length());
        json.append("]");
    }

    @Override
    public void enterValue(MYJSONParser.ValueContext ctx) {
        super.enterValue(ctx);
        printValue(ctx);
    }

    private void printValue(MYJSONParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            System.out.println("\"" + ctx.STRING() +"\"");
            json.append("\"" + ctx.STRING() +"\"");
        } else if (ctx.NUMBER() != null) {
            System.out.println(ctx.NUMBER());
            json.append(ctx.NUMBER());
        } else if (ctx.BOOL() != null) {
            System.out.println(ctx.BOOL());
            json.append(ctx.BOOL());
        } else if (ctx.getText().equals("null")) {
            System.out.println("null");
            json.append("null");
        }
    }

    @Override
    public void exitValue(MYJSONParser.ValueContext ctx) {
        super.exitValue(ctx);
        System.out.println(",");
        json.append(",");
    }

    @Override
    public void enterProg(MYJSONParser.ProgContext ctx) {
        super.enterProg(ctx);
        System.out.println("Entered prog " + ctx.getText());
    }

    @Override
    public void exitProg(MYJSONParser.ProgContext ctx) {
        super.exitProg(ctx);
        System.out.println("Exited prog");
        System.out.println(json);
    }
}
