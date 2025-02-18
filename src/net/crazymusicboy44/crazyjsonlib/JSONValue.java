package net.crazymusicboy44.crazyjsonlib;

public interface JSONValue {
    public default String toString() {
        return toString(0);
    }
    public String toString(int indent);

    public static JSONValue of(float number) {
        return new JSONNumber(number);
    }
}
