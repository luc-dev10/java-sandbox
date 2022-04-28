package com.sandbox.concurrency;

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
        //        new Thread() {
        //            public void run() {
        //                System.out.println("Anonymous Thread...");
        //            }
        //        }.start();

        // ________________________________

        // creating threads with the Runnable Interface
        Thread runnableThread = new Thread(new FirstRunnable() {
            @Override
            public void run() {
                System.out.println("First Runnable Running with runny legs...");
                try {
                    firstThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("First Runnable waited for first thread to complete...");
            }
        });
        runnableThread.start();

        // anonymous thread and runnable
        //        new Thread(new Runnable() {
        //            @Override
        //            public void run() {
        //                System.out.println("Anonymous Runnable Thread");
        //            }
        //        }).start();

        // ________________________________

        // thread interruption
        // firstThread.interrupt();

        // ________________________________

        // waiting for thread to finalize execution

        System.out.println("Main Thread ending.....");
    }
}
