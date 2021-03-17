package com.company.tasks.task006;

public class Task006 {
    public static void run(Integer value, Integer iteration) {
        int result = 1;
        int step = 0;
        do {
            System.out.print(result + " ");
            result *= value;
            step ++;
        } while (step < iteration);
    }
}
