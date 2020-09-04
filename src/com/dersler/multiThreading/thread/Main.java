package com.dersler.multiThreading.thread;

public class Main {
    public static void main(String[] args) {
        Printer printer1 = new Printer("p1");
        Printer printer2 = new Printer("p11");
        Printer printer3 = new Printer("p111");
        Printer printer4 = new Printer("p1111");
        Printer printer5 = new Printer("p111111");

        printer1.start();
        printer2.start();
        printer3.start();
        printer4.start();
        printer5.start();
    }
}
