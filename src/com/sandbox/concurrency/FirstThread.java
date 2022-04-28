package com.sandbox.concurrency;

public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("First Thread is fired up...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Thread is interrupted");
            return;
        }

        System.out.println("First Thread is awake");
    }
}

