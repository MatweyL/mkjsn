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
        json.append("{\n");
    }

    @Override
    public void exitObject(MYJSONParser.ObjectContext ctx) {
        super.exitObject(ctx);
        json.delete(json.length() - 2, json.length());
        json.append("}");
    }

    @Override
    public void enterObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx) {
        super.enterObjectKeyValue(ctx);
        json.append(" \"" + ctx.STRING() + "\" : ");
    }

    @Override
    public void exitObjectKeyValue(MYJSONParser.ObjectKeyValueContext ctx) {
        super.exitObjectKeyValue(ctx);
    }

    @Override
    public void enterArray(MYJSONParser.ArrayContext ctx) {
        super.enterArray(ctx);
        json.append("[");
    }

    @Override
    public void exitArray(MYJSONParser.ArrayContext ctx) {
        super.exitArray(ctx);
        json.delete(json.length() - 2, json.length());
        json.append("]");
    }

    @Override
    public void enterValue(MYJSONParser.ValueContext ctx) {
        super.enterValue(ctx);
        printValue(ctx);
    }

    private void printValue(MYJSONParser.ValueContext ctx) {
        if (ctx.STRING() != null) {
            json.append("\"" + ctx.STRING() +"\"");
        } else if (ctx.COMPOUNDEDSTRING() != null) {
            json.append(ctx.COMPOUNDEDSTRING());
        } else if (ctx.NUMBER() != null) {
            json.append(ctx.NUMBER());
        } else if (ctx.BOOL() != null) {
            json.append(ctx.BOOL());
        } else if (ctx.getText().equals("null")) {
            json.append("null");
        }
    }

    @Override
    public void exitValue(MYJSONParser.ValueContext ctx) {
        super.exitValue(ctx);
        json.append(",\n");
    }

    @Override
    public void enterProg(MYJSONParser.ProgContext ctx) {
        super.enterProg(ctx);
    }

    @Override
    public void exitProg(MYJSONParser.ProgContext ctx) {
        super.exitProg(ctx);
        System.out.println(json);
    }
}
