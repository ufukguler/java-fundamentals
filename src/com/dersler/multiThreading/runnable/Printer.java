package com.dersler.multiThreading.runnable;

public class Printer extends Thread {
    private String name;

    public Printer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " speaks.");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println(name + " is done.");
    }
}