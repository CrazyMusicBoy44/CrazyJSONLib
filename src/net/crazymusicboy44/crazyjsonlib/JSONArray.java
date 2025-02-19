package net.crazymusicboy44.crazyjsonlib;

import java.util.ArrayList;
import java.util.List;

public class JSONArray extends JSONValue{
    private List<JSONValue> values = new ArrayList<>();
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int indent) {
        StringBuilder stringBuilder = new StringBuilder("[\n");

        for (int i = 0; i < values.size() - 1; i++) {
            stringBuilder.append("    ".repeat(indent+1)).append(values.get(i).toString(indent + 1)).append(",\n");
        }
        stringBuilder.append("    ".repeat(indent+1)).append(values.get(values.size()-1).toString(indent + 1));
        return stringBuilder.append('\n').append("    ".repeat(indent)).append("]").toString();
    }

    public List<JSONValue> getValues() {
        return values;
    }
    public JSONValue getValue(int index) {
        return values.get(index);
    }
    public void setValue(int index, JSONValue value) {
        values.set(index, value);
    }
    public void addValue(JSONValue value) {
        values.add(value);
    }

    @Override
    public JSONArray clone() {
        JSONArray clone = (JSONArray) super.clone();
        clone.values = new ArrayList<>();
        for (JSONValue value : values) {
            clone.values.add(value.clone());
        }
        return clone;
    }
}
