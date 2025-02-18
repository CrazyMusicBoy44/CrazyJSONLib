package net.crazymusicboy44.crazyjsonlib;

import java.util.ArrayList;
import java.util.List;

public class JSONObj implements JSONValue {
    private List<JSONParam> params = new ArrayList<>();

    @Override
    public String toString(int indent) {
        StringBuilder stringBuilder = new StringBuilder("{");

        for (int i = 0; i < params.size() - 1; i++) {
            stringBuilder.append("    ".repeat(indent)).append(params.get(i).toString(indent + 1));
        }

        return stringBuilder.append("}").toString();
    }
}
