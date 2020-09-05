package com.dersler.multiThreading.callablefuture;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("Thread started.");
                int time = new Random().nextInt(1000) + 2000;

                if (time > 2500) {
                    throw new IOException("time>2500");
                }

                try {
                    Thread.sleep(time);
                } catch (InterruptedException ex) {
                    System.out.println("Interruped Exception");
                }
                System.out.println("Thread stopped");
                return time;
            }
        });
        executorService.shutdown();
        try {
            System.out.println("Elapsed Time: " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
