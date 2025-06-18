package org.example.itroom_hw_3;

import java.util.Arrays;

public class Main {
    public static  <T> T[] filter(T[] array, Filter<T> filter) {
        T[] result = array.clone();
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] first = {-1, 2, -3, 4, -5, 6};
        MyIntegerFilter filter = new MyIntegerFilter();


        System.out.println(Arrays.toString(first));
        Integer[] second = Main.filter(first, filter);
        System.out.println(Arrays.toString(second));
        System.out.println(" ");

        String[] firstStr = {"Adam", "Ivan", "Mike", "Jack", "Lewis"};
        MyStringFilter filter2 = new MyStringFilter();
        System.out.println(Arrays.toString(firstStr));
        String[] secondStr = Main.filter(firstStr, filter2);
        System.out.println(Arrays.toString(secondStr));
    }
}
