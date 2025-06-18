package org.example.itroom_hw_3;

public class MyStringFilter implements Filter<String> {
    @Override
    public String apply(String o) {
        return o + " " + o;
    }
}
