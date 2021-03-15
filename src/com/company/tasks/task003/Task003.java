package com.company.tasks.task003;

public class Task003 {
    public static void run(Integer coefficient) {
        int result;
        for (int i = 1; i < 11; i++) {
            result = coefficient * i;
            System.out.println(coefficient + "*" + i + "=" + result);
        }
    }
}
