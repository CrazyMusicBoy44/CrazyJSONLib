package net.crazymusicboy44.crazyjsonlib;

public class JSONNumber implements JSONValue{
    private double number;
    public JSONNumber(double number) {
        this.number = number;
    }

    @Override
    public String toString(int indent) {
        return "    ".repeat(indent) + number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
}
