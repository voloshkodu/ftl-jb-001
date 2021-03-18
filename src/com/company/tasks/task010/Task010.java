package com.company.tasks.task010;

public class Task010 {
    public static void run(int length) {
        double[] randomValues = new double[length];
        double maxValue = randomValues[0], minValue = randomValues[0], summaryValue = 0;
        for (int i = 0; i < randomValues.length; i++) {
            randomValues[i] = Math.random();
            maxValue = Math.max(maxValue, randomValues[i]);
            if (i > 0) minValue = Math.min(randomValues[i-1], randomValues[i]);
            summaryValue += randomValues[i];
        }
        System.out.println("Минимальное значение массива: " + minValue + "\n" + "Максимальное значение массива: " + maxValue + "\n" + "Среднеарифметическое значение массива: " + summaryValue/randomValues.length);
    }
}
