package org.example.itroom_hw_3;

public class MyIntegerFilter implements Filter<Integer> {
    @Override
    public Integer apply(Integer o) {
        return Math.abs(o);
    }
}
