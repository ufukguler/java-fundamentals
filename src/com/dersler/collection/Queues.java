package com.dersler.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    /*
     * Queue(Kuyruk) Interface'ini implemente eden LinkedList Classı FIFO(First In, First Out Mantığıyla Çalışır.)
     * add(Eleman) ----> Elemanı Kuyruğa Ekler. Ekleyemezse Hata Fırlatır.
     * offer(Eleman) ----> Elemanı Kuyruğa Ekler. Eklerse True Döner, Ekleyemezse False Döner.
     * remove() ----> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa hata fırlatır.
     * poll() ------> Kuyruğun en başındaki elemanı kuyruktan çıkarır. Kuyruk boşsa null referans döner.
     * element() ----> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa ,  hata fırlatır.
     * peek() ------> Kuyruğun en başındaki elemanı döner. Kuyruk boşsa , null referans döner.
     *

     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Java");
        queue.offer("PHP");
        queue.offer("Python");
        for (String s : queue) {
            System.out.print(s + " ");
        }
        System.out.println("size: " + queue.size());
        System.out.println("\n1st element: " + queue.peek());
        queue.poll();
        System.out.println("remove 1st element: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("removed from queue: " + queue.poll());
        }
        System.out.println("size: " + queue.size());
    }
}
