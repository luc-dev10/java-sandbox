package com.sandbox.box;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        int x = 10;

        // autobox
        Integer y = 10;

        // unbox and evaluation
        int result = x + y;
        System.out.println(result);

        List<Integer> integerList = new ArrayList<>(2);
        integerList.add(y);

        // autoboxing
        integerList.add(x);
        integerList.forEach(System.out::println);
    }
}
