package com.dersler.multiThreading.pools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        executorService();
    }

    static void executorService() {
        // 2 threadlik havuz olusturduk
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // 2 thread e 5 tane is verdim / aynı anda 2 is yapicaklar diyebiliriz
        for (int i = 1; i < 6; i++) {
            executorService.submit(new Worker(String.valueOf(i), i));
        }
         // bunu yazmassak sona ermez :(
        executorService.shutdown();

        // islemi maximum 1 dakika tut hala bitmediyse terminate et
        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("isler tamamlandi.");
    }

    static void thread() {
        Thread t1 = new Thread(new Worker("worker1", 1));
        Thread t2 = new Thread(new Worker("worker2", 2));
        Thread t3 = new Thread(new Worker("worker3", 3));
        Thread t4 = new Thread(new Worker("worker4", 4));
        Thread t5 = new Thread(new Worker("worker5", 5));

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t3.start();
        t4.start();
        try {
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        t5.start();

    }

}
