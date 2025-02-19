package net.crazymusicboy44.crazyjsonlib;

public class JSONParam implements Cloneable {
    private String name;
    private JSONValue value;
    public JSONParam(String name, JSONValue value) {
        this.name = name;
        this.value = value;
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
        return "\""+name+"\": "+value.toString(indent);
    }

    @Override
    public JSONParam clone() {
        try {
            JSONParam clone = (JSONParam) super.clone();
            clone.name = name;
            clone.value = value.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
