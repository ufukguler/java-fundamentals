package com.dersler.multiThreading.semaphore;

public class Test {
    public static void main(String[] args) {
        MySemaphore sem = new MySemaphore();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                sem.thread(1);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                sem.thread(2);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                sem.thread(3);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                sem.thread(4);
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                sem.thread(5);
            }
        });

        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
