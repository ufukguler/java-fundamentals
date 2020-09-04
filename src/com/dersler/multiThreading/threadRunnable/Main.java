package com.dersler.multiThreading.threadRunnable;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println("Thread t3 running.");
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        System.out.println("thread error");
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
                    }
                }
            }
        });
        thread.start();
    }
}
