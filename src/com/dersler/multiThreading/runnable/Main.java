package com.dersler.multiThreading.runnable;

public class Main {
    public static void main(String[] args) {
        Thread printer1 = new Thread(new Printer("p1"));
        Thread printer2 = new Thread(new Printer("p2"));
        Thread printer3 = new Thread(new Printer("p3"));

        printer1.start();
        printer2.start();
        printer3.start();
    }
}
