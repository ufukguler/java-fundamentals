package com.dersler.multiThreading.sync;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListWorker {

    Random random = new Random();
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public static void main(String[] args) {
        ListWorker worker = new ListWorker();
        worker.run();
    }

    public void fillArray1() {
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
            array1.add(random.nextInt(100));
        }
    }

    public void fillArray2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
            }
            array2.add(random.nextInt(100));
        }
    }

    public void fill() {
        for (int i = 0; i < 1000; i++) {
            fillArray1();
            fillArray2();
        }
    }

    public void run() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                fill();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                fill();
            }
        });
        long start = System.currentTimeMillis();

        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ListWorker.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("List1 Size :" + array1.size() + " List2 Size: " + array2.size());

        long end = System.currentTimeMillis();
        System.out.println("Geçen Süre : " + (end - start));


    }


}
