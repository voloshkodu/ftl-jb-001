//***
//Напишите класс, конструктор которого принимает два массива: массив значений и массив весов значений.
//Класс должен содержать метод, который будет возвращать элемент из первого массива случайным образом, с учётом его веса.
//Пример:
//Дан массив [1, 2, 3], и массив весов [1, 2, 10].
//В среднем, значение «1» должно возвращаться в 2 раза реже, чем значение «2» и в десять раз реже, чем значение «3».
//***

package com.company.tasks.task015;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task015 {
    public static void run(int length) {
        //инициализация массивов значений и весов
        int[] arrayA = new int[length];
        int[] arrayB = new int[length];
        //заполнение массивов случайными целочисленными значениями
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = ThreadLocalRandom.current().nextInt(1, 15);
            arrayB[i] = ThreadLocalRandom.current().nextInt(1, 15);
        }
        //вывод на экран массивов и результата отбора
        ArraysReturnValue array = new ArraysReturnValue(arrayA, arrayB);
        System.out.println(array);
        System.out.println(array.returnValue());
    }
}

class ArraysReturnValue {
    int[] valueArray;
    int[] oddsArray;

    public ArraysReturnValue(int[] valueArray, int[] oddsArray) {
        this.valueArray = valueArray;
        this.oddsArray = oddsArray;
    }

    @Override
    public String toString() {
        return "ArraysReturnValue{" +
                "valueArray=" + Arrays.toString(valueArray) +
                ", oddsArray=" + Arrays.toString(oddsArray) +
                '}';
    }

    public int returnValue() {
        //для расчета вероятности используется суммарный коэффициент всех весов, который делит единицу на равные части
        int coeffSummary = 0;
        int searchIndex = 0;
        //инициализация случайного числа для определения вероятности выбора значения
        double random = Math.random();
        for (int i = 0; i < oddsArray.length; i++) {
            coeffSummary += oddsArray[i];
        }
        //определение коэффициента; коэффициент, умноженный на вес, определеяет границы вероятности выбора значения из массива
        double coefficient = (double) 1 / coeffSummary;
        //поиск значения; сравнение random с числом, полученным в результате умножения веса на коэффициент
        for (int i = 0; i < oddsArray.length; i++) {
            if (random <= oddsArray[i]*coefficient) {
                searchIndex = i;
                break;
            } else {
            //сдвиг границы поиска
            oddsArray[i + 1] += oddsArray[i];
            }
        }
        return valueArray[searchIndex];
    }
}
