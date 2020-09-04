package com.dersler.multiThreading.pools;

public class Worker implements Runnable {

    private String name;
    private int taskID;

    public Worker(String name, int taskID) {
        this.name = name;
        this.taskID = taskID;
    }

    @Override
    public void run() {
        try {
            System.out.println("Worker " + name + " ID:" + taskID + " started.");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Worker " + name + " ID:" + taskID + " finished.");
    }
}
