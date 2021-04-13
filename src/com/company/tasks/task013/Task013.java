//***
//Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно).
//***

package com.company.tasks.task013;

import java.util.concurrent.ThreadLocalRandom;

public class Task013 {

    public static void run(int min, int max, int length, int toDelete) {
        //формирование рандомного целочисленного массива
        int[] array = new int[length];
        int searchIterations = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(min, max);
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        //определение количества итераций поиска
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toDelete) searchIterations++;
        }

        //поиск и удаление элементов
        do {
            array = searchAndDelete(array, toDelete);
            searchIterations--;
        } while (searchIterations > 0);

        //вывод на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    //метод поиска и удаления элемента из массива
    private static int[] searchAndDelete(int[] array, int search) {
        int searchedIndex = 0;
        int[] modifiedArray = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                searchedIndex = i;
                break;
            } else {
                modifiedArray[i] = array[i];
            }
        }

        for (int i = searchedIndex; i < array.length - 1; i++) {
            modifiedArray[i] = array[i + 1];
        }

        return modifiedArray;
    }
}
