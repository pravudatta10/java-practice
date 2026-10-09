package com.pravudatta.javapractice.multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BeginnerQuestions {
    public static void main(String[] args) throws InterruptedException {
        question2();
//        Thread.sleep(1000);
//        System.out.println("Main thread is running");
    }

    //Create three threads that each print their name and the numbers 1 to 5.
    //Follow-up: make the main thread wait until all three finish.
    //Follow-up: what changes if you call run() instead of start()?
    static void question1() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 3; i++) {
            executorService.submit(() -> {
                String threadName = Thread.currentThread().getName();
                for (int j = 0; j < 5; j++) {
                    System.out.println("Thread Name: " + threadName + " : " + j);
                }
            });
        }
//        executorService.awaitTermination(2, TimeUnit.SECONDS);
        executorService.shutdown();
    }

    static void question2() throws InterruptedException {
        Thread worker = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    System.out.println("Worker going to sleep...");
                    Thread.sleep(1000);
                    System.out.println("Sleep completed");
                } catch (InterruptedException e) {
                    System.out.println("Worker interrupted during sleep");
                    Thread.currentThread().interrupt();
                }
            }
            System.out.println("Worker Thread stopped cleanly...");
        });
        worker.start();
        Thread.sleep(2000); // Main does other work for 2 seconds

        System.out.println("Main requesting worker to stop...");
        worker.interrupt();

        worker.join(); // Wait until worker finishes

        System.out.println("Main thread finished.");
    }

}
