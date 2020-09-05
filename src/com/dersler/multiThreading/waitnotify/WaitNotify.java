package com.dersler.multiThreading.waitnotify;

import java.util.Scanner;

public class WaitNotify {
/*
thread 1 içinde ki wait e gelince thread duruyor. Bu thread i notify edicek olan thread calisana kadar bekleyen thread beklemeye devam eder.
 */
    //obje uzerinde tek bir anahtar var o nedenle this ?
    public void thread1() {
        synchronized (this) {
            System.out.println("(t1)-thread 1 calisiyor.\n(t1)-thread1, thread2 nin kendisini uyandırmasını bekliyor.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("(t1)-thread1 uyandi. devam ediyor.");
        }
    }

    public void thread2() {
        Scanner sc = new Scanner(System.in);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (this) {
            System.out.println("(t2)-thread 2 calisiyor");
            System.out.println("(t2)-devam etmek icin enter");
            sc.nextLine();

            notify();
            System.out.println("(t2)-Thread1 uyandirildi.");
        }
    }
}
