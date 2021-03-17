package com.company.tasks.task009;

import java.util.Scanner;

public class Task009 {
    private static boolean quiz() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        switch (answer) {
            case "Троллейбус":
                System.out.println("Правильно!");
                return true;
            case "Сдаюсь":
                System.out.println("Правильный ответ: троллейбус.");
                return true;
            default:
                System.out.println("Подумай еще.");
                return false;
        }
    }

    public static void run() {
        int attempt = 0, leftAttempt = 3;
        System.out.print("Что это такое: синий, большой, с усами и полностью набит зайцами? У вас 3 попытки. Ответ: ");
        do {
            if (quiz()) break;
            attempt += 1;
            leftAttempt -= 1;
            System.out.println("Осталось попыток:" + leftAttempt);
        } while (attempt < 3);
    }
}
