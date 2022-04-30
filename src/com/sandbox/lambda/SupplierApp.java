package com.sandbox.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> randomIntegerSupplier = () -> random.nextInt(100);
        for (int i = 0; i < 20; i++)
            if (i % 2 != 0)
                System.out.println(randomIntegerSupplier.get());
    }
}
