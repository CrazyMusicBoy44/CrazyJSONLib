package net.crazymusicboy44.crazyjsonlib;

public interface JSONValue {
    public String toString(int indent);

    public static JSONValue of(float number) {
        return new JSONNumber(number);
    }
}
