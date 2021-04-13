package com.company.tasks.task012;

public class Task012 {
    public static void run() {
        int[] array = new int[99];
        int a = 5;
        int b = 3;
        for (int i = 0; i < 99; i++) {
            array[i] = a % b;
            a += 2;
            b += 1;
            System.out.print(array[i] + " ");
        }
    }
}
