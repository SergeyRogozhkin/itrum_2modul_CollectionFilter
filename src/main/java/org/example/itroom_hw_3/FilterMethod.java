package org.example.itroom_hw_3;

public class FilterMethod {
    public static  <T> T[] filter(T[] array, Filter<T> filter) {
        T[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }
}
