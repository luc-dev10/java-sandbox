package com.sandbox.immutable;

public class MainApp {
    public static void main(String[] args) {

        // immutability optimizes memory management

        // string pool stores string immutably
        String immutableValue = "Hello";

        // variable points to the Hello String in pool
        String referenceToImmutableValue = "Hello";

        // hashcode proves pointer to same location
        System.out.println(immutableValue.hashCode());
        System.out.println(referenceToImmutableValue.hashCode());

        // change value for immutable value
        immutableValue = "hello";

        // address changed
        if (immutableValue == referenceToImmutableValue)
            System.out.println("Same Locations.");
        else
            System.out.println("Different Locations.");

        // immutability offers security and thread safety
    }
}
