package com.company.L027;

public class ThreadExample {
    private static void runAnotherThread(String message) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    System.out.println(i + ": " + message);
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

//        runnable.run();
    }

    public static void run() {
        runAnotherThread("Thread 1");
        runAnotherThread("Thread 2");
        runAnotherThread("Thread 3");
        runAnotherThread("Thread 4");
        runAnotherThread("Thread 5");
    }
}
