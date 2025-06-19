package org.example.itroom_hw_3;

import java.util.HashMap;
import java.util.Map;

public class ReturnMapMethod {
    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> map = new HashMap<>();
        for (T item : array) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }
}
