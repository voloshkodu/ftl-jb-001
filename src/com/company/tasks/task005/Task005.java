package com.company.tasks.task005;

public class Task005 {
    public static void run(Integer value, Integer multiplier) {
        int result;
        for (int i = 1; i <= multiplier; i++) {
            result = value * i;
            System.out.print(result + " ");
        }
        System.out.println("");
    }
}
