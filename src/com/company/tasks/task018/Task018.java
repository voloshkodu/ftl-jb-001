/**
 * Реализуйте иерархию классов:
 * Класс Box является контейнером, он можем содержать в себе другие фигуры. Метод add() принимает на вход Shape.
 * Нужно добавлять новые фигуры до тех пор, пока для них хватаем места в Box (будем считать только объём, игнорируя форму.
 * Допустим, мы переливаем жидкость). Если места для добавления новой фигуры не хватает, то метод должен вернуть false.
 */

package com.company.tasks.task018;

public class Task018 {
    public static void run() {
        Box box = new Box (5000);
        Pyramid pyramid = new Pyramid(100, 30);
        Ball ball = new Ball(8);
        Cylinder cylinder = new Cylinder(10, 5);
        System.out.println("Box: " + box);
        System.out.println("Pyramid: " + pyramid);
        System.out.println("Ball: " + ball);
        System.out.println("Cylinder: " + cylinder);
        box.add(pyramid);
        box.add(ball);
        box.add(cylinder);



    }

}
