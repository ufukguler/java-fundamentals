package com.dersler.multiThreading.interrupt;

import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<Integer>();
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread started.");
                for (int i = 0; i < 100000000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("thread interrupted");
                        return;
                    }
                    list.add(i);
                }
                System.out.println("Thread stopped.");
            }
        });

        t.start();
        try {
            // if can not finish adding integers to list in 1 sec, then interrupt
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex.getStackTrace());
        }

        t.interrupt();
    }
}
