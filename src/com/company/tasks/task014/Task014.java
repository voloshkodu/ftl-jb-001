//***
//Создайте класс, который описывает вектор (в трёхмерном пространстве).
//У него должны быть:
//1 - конструктор с параметрами в виде списка координат x, y, z
//метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
//2 - метод, вычисляющий скалярное произведение:
//3 - метод, вычисляющий векторное произведение с другим вектором:
//4 - метод, вычисляющий угол между векторами (или косинус угла): косинус угла между векторами равен скалярному произведению векторов, деленному на произведение модулей (длин) векторов:
//5 - методы для суммы и разности:
//6 - статический метод, который принимает целое число N, и возвращает массив случайных векторов размером N.
//Если метод возвращает вектор, то он должен возвращать новый объект, а не менять базовый. То есть, нужно реализовать шаблон "Неизменяемый объект"
//***

package com.company.tasks.task014;

import java.util.concurrent.ThreadLocalRandom;

public class Task014 {
    public static void run() {
        Vector a = new Vector(1, 2, 5);
        Vector b = new Vector(4, 8, 1);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Длина вектора А: " + vectorLength(a) + ", длина вектора В: " + vectorLength(b));
        System.out.println("Скалярное произвоедение векторов А и В: " + scalarMultiply(a, b));
        System.out.println("Векторное произвоедение векторов А и В: " + vectorMultiply(a, b));
        System.out.println("Угол между векторами А и В: " + vectorAngle(a, b));
        System.out.println("Сумма векторов А и В: " + vectorSum(a, b));
        System.out.println("Разность векторов А и В: " + vectorSub(a, b));
        System.out.println("Массив случайных векторов из N элементов: ");
        vectorArray(5, -10, 10);

    }

    private static double vectorLength(Vector vector) {
        double length = Math.sqrt(Math.pow(vector.xAxis,2) + Math.pow(vector.yAxis,2) + Math.pow(vector.zAxis,2));
        return length;
    }

    private static double scalarMultiply(Vector vectorA, Vector vectorB) {
        double multiply = vectorA.xAxis*vectorB.xAxis + vectorA.yAxis*vectorB.yAxis + vectorA.zAxis*vectorB.zAxis;
        return multiply;
    }

    private static Vector vectorMultiply(Vector vectorA, Vector vectorB) {
        Vector multiply = new Vector((vectorA.yAxis*vectorB.zAxis - vectorA.zAxis*vectorB.yAxis), -(vectorA.xAxis*vectorB.zAxis - vectorA.zAxis*vectorB.xAxis), (vectorA.xAxis*vectorB.yAxis - vectorA.yAxis*vectorB.xAxis));
        return multiply;
    }

    private static double vectorAngle(Vector vectorA, Vector vectorB) {
        double angle = Math.toDegrees(Math.acos(scalarMultiply(vectorA, vectorB) / (vectorLength(vectorA)*vectorLength(vectorB))));
        return angle;
    }

    private static Vector vectorSum(Vector vectorA, Vector vectorB) {
        Vector sum = new Vector((vectorA.xAxis + vectorB.xAxis), (vectorA.yAxis + vectorB.yAxis), (vectorA.zAxis + vectorB.zAxis));
        return sum;
    }

    private static Vector vectorSub(Vector vectorA, Vector vectorB) {
        Vector sub = new Vector((vectorA.xAxis - vectorB.xAxis), (vectorA.yAxis - vectorB.yAxis), (vectorA.zAxis - vectorB.zAxis));
        return sub;
    }

    private static Vector[] vectorArray(int N, int min, int max) {
        Vector[] array = new Vector[N];
        for (int i = 0; i < N; i++) {
            array[i] = new Vector(ThreadLocalRandom.current().nextInt(min, max), ThreadLocalRandom.current().nextInt(min, max), ThreadLocalRandom.current().nextInt(min, max));
            System.out.println(array[i]);
        }
        return array;
    }

}

class Vector {
    double xAxis, yAxis, zAxis;

    public Vector(double xAxis, double yAxis, double zAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
        this.zAxis = zAxis;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", zAxis=" + zAxis +
                '}';
    }
}
