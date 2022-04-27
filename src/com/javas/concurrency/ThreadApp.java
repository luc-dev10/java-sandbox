package com.javas.concurrency;

public class ThreadApp {

    /*  process starts
     *  every process has its own head memory
     * */
    public static void main(String[] args) {

        System.out.println("Main Thread.....");

        // creating threads with the Thread Class

        // next thread
        FirstThread firstThread = new FirstThread();
        firstThread.start();

        // creating anonymous class
        new Thread() {
            public void run() {
                System.out.println("Anonymous Thread...");
            }
        }.start();

        // ________________________________

        // creating threads with the Runnable Interface
        Thread runnableThread = new Thread(new FirstRunnable());
        runnableThread.start();

        //        new Runnable() {
        //            @Override
        //            public void run() {
        //                System.out.println("Anonymous Runnable Thread");
        //            }
        //        }

        // ________________________________

        System.out.println("Main Thread ending.....");
    }
}
