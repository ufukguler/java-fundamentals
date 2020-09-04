package com.dersler.multiThreading.sync;

public class ThreadSafe {
    static int count = 0;

    public static void main(String[] args) {
        runThreads();
    }

    static void runThreads() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    increase();
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    increase();
                }
            }
        });
        //first run t1 & t2 then main
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("thread error: " + e);
        }

        System.out.println("count: " + count);
    }

    // by defining the method as synchronized, we allowed only 1 thread can access this method at the same time.
    static synchronized void increase() {
        count++;
    }
}
