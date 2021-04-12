package com.company.tasks.task011;
import java.util.concurrent.ThreadLocalRandom;

public class Task011 {
    public static void run(int length, int min, int max) {
        //формирование рандомного целочисленного массива
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max);
            System.out.print(array[i] + " ");
        }
        //сортировка и вывод
        sort(array);
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //пузырьковый метод сортировки
    private static void sort(int[] array) {
        int flag;
        for (int j = 1; j < array.length; j++) {
            flag = 0;
            for (int i = 0; i < (array.length - j); i++) {
                if (array[i] > array[i + 1]) {
                    int temp;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) break;
        }
    }
}
