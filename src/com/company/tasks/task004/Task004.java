package com.company.tasks.task004;

import java.util.Scanner;

public class Task004 {
    public static class ValueException extends RuntimeException {}
    public static void run() throws ValueException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int value = scanner.nextInt();
        int result = 0;
        if (value < 0) {
            throw new ValueException();
        }
        for (int i = 1; i <= value; i++) {
            result += i;
        }
        System.out.println("Summary:" + result);
    }
}
