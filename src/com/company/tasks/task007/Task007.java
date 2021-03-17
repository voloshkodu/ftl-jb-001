package com.company.tasks.task007;

public class Task007 {
    public static void run(Integer rows, Integer columns) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
