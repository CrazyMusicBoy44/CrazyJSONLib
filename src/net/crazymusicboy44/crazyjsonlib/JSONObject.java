package net.crazymusicboy44.crazyjsonlib;

import java.util.ArrayList;
import java.util.List;

public class JSONObject extends JSONValue {
    private List<JSONParam> params = new ArrayList<>();

    @Override
    public String toString(int indent) {
        StringBuilder stringBuilder = new StringBuilder("{\n");

        for (int i = 0; i < params.size() - 1; i++) {
            stringBuilder.append("    ".repeat(indent+1)).append(params.get(i).toString(indent + 1)).append(",\n");
        }
        stringBuilder.append("    ".repeat(indent+1)).append(params.get(params.size()-1).toString(indent + 1));
        return stringBuilder.append('\n').append("    ".repeat(indent)).append("}").toString();
    }

    public String toString() {
        return toString(0);
    }

    public JSONObject add(JSONParam param) {
        params.add(param);
        return this;
    }

    public List<JSONParam> getParams() {
        return params;
    }

    public void setParam(int index, JSONParam param) {
        params.set(index, param);
    }

    @Override
    public JSONObject clone() {
        JSONObject clone = (JSONObject) super.clone();
        clone.params = new ArrayList<>();
        for (JSONParam param : params) {
            clone.params.add(param.clone());
        }
        return clone;
    }

    public static JSONValueTypes getType() {
        return JSONValueTypes.OBJECT;
    }
}
