package net.crazymusicboy44.crazyjsonlib;

public class JSONParam {
    private String name;
    private JSONValue value;
    public JSONParam(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public JSONValue getValue() {
        return value;
    }
    public void setValue(JSONValue value) {
        this.value = value;
    }
    public String toString() {
        return toString(0);
    }
    public String toString(int indent) {
        return "";
    }
}
