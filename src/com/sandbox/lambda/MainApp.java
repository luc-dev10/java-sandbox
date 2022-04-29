package com.sandbox.lambda;

public class MainApp {
    public static void main(String[] args) {

        // using lambda expression for thread
        Thread thread = new Thread(() -> System.out.println("Thread is running"));
        thread.start();

    }
}
