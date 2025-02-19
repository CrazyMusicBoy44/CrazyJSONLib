package net.crazymusicboy44.crazyjsonlib;

public class JSONNumber extends JSONValue {
    private double number;
    public JSONNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString(int indent) {
        return String.valueOf(number);
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public static JSONValueTypes getType() {
        return JSONValueTypes.NUMBER;
    }

    @Override
    public JSONNumber clone() {
        JSONNumber clone = (JSONNumber) super.clone();
        clone.number = number;
        return clone;
    }
}
