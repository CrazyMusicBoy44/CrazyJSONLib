package net.crazymusicboy44.crazyjsonlib;

public abstract class JSONValue implements Cloneable{
    public String toString() {
        return toString(0);
    }
    public static JSONValue NULL = new JSONValue() {
        @Override
        public String toString(int indent) {
            return null;
        }
    };
    public abstract String toString(int indent);

    public static JSONValue of(double number) {
        return new JSONNumber(number);
    }

    public static JSONValue of(String string) {
        if (string==null) return NULL;
        return new JSONString(string);
    }

    public static JSONValue of(boolean bool) {
        return null;
    }

    public static JSONValueTypes getType() {
        return JSONValueTypes.NULL;
    }

    @Override
    public JSONValue clone() {
        try {
            return (JSONValue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public enum JSONValueTypes {
        STRING,
        NUMBER,
        OBJECT,
        ARRAY,
        BOOLEAN,
        NULL
    }
}
