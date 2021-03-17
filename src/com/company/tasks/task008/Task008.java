package com.company.tasks.task008;

public class Task008 {
    public static void run(Integer steps) {
        int j = 0, k = 1, summary;
        System.out.print(k + " ");
        for (int i = 0; i < steps; i++) {
            summary = j + k;
            System.out.print(summary + " ");
            j = k;
            k = summary;
        }
    }
}
