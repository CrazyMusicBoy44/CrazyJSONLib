package net.crazymusicboy44.crazyjsonlib;

public class JSONString extends JSONValue {
    private String string;

    public JSONString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int indent) {
        return "\""+string+"\"";
    }

    public static JSONValueTypes getType() {
        return JSONValueTypes.STRING;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


    @Override
    public JSONString clone() {
        JSONString clone = (JSONString) super.clone();
        clone.string = string;
        return clone;
    }
}
