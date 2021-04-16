/**
 * Напишите метод, который проверяет, входит ли в массив заданный элемент или нет.
 * Используйте перебор и двоичный поиск для решения этой задачи.
 * Сравните время выполнения обоих решений для больших массивов (например, 100000000 элементов).
 */

package com.company.tasks.task016;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task016 {
    public static void run(int length) {
        int[] arrayA = new int[length];
        System.out.print("Массив: ");
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = ThreadLocalRandom.current().nextInt(1, 10);
            System.out.print(arrayA[i] + " ");
        }
        Arrays.sort(arrayA);
        System.out.println("");
        System.out.print("Сортировка: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("");
        long start = System.currentTimeMillis();
        System.out.println("Индекс элемента (прямой перебор): " + findValue(arrayA, 5));
        long end = System.currentTimeMillis();
        System.out.println("Время исполнения: " + (end - start));
        start = System.currentTimeMillis();
        System.out.println("Индекс элемента (бинарный поиск): " + binarySearch(arrayA, 0, arrayA.length, 5));
        end = System.currentTimeMillis();
        System.out.println("Время исполнения: " + (end - start));

    }

    // Прямой перебор
    private static int findValue(int[] array, int value) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            } else index = -1;
        }
        return index;
    }

    // Бинарный поиск рекурсивный
    private static int binarySearch(int[] array, int min, int max, int value) {
        int mid;
        mid = min + (max - min) / 2;
        if (max >= min) {
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, min, mid - 1, value);
            } else if (array[mid] < value) {
                return binarySearch(array, mid + 1, max, value);
            }
        }
        return -1;
    }
}