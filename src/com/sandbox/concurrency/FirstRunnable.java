package com.sandbox.concurrency;

public class FirstRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable Implementation Thread...");
    }
}
