package com.javas.concurrency;

public class ThreadApp {

    /*  process starts
     *  every process has its own head memory
     * */
    public static void main(String[] args) {
        System.out.println("Main Thread.....");

        // next thread
        FirstThread firstThread = new FirstThread();
        firstThread.start();

    }
}
