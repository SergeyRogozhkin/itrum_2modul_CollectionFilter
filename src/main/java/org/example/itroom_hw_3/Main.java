package org.example.itroom_hw_3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Integer[] first = {-1, 2, -3, 4, -5, 6};
        MyIntegerFilter filter = new MyIntegerFilter();

        System.out.println(Arrays.toString(first));
        Integer[] second = FilterMethod.filter(first, filter);
        System.out.println(Arrays.toString(second));
        System.out.println(" ");

        String[] firstStr = {"Adam", "Ivan", "Mike", "Jack", "Lewis"};
        MyStringFilter filter2 = new MyStringFilter();
        System.out.println(Arrays.toString(firstStr));
        String[] secondStr = FilterMethod.filter(firstStr, filter2);
        System.out.println(Arrays.toString(secondStr));
        System.out.println(" ");

        String[] arr = {"Adam", "Ivan", "Mike", "Adam", "Jack", "Lewis", "Adam", "Jack",  "Jack", "Ivan"};
        System.out.println(Arrays.toString(arr));
        Map<String, Integer> result = ReturnMapMethod.countElements(arr);
        System.out.println(result);
    }
}
