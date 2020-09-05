package com.dersler.multiThreading.semaphore;

import java.util.concurrent.Semaphore;

public class MySemaphore {
    private Semaphore semaphore = new Semaphore(3);

    public void thread(int id) {
        long start = System.currentTimeMillis();

        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + id + " started.");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();

        long end = System.currentTimeMillis();
        System.out.println("Thread " + id + " Elapsed Time: " + (end - start));
    }
}
