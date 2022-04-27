package com.javas.concurrency;

public class FirstThread extends Thread {
    @Override
    public void run() {
        System.out.println("First Thread is fired up...");
    }
}

