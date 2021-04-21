/**
 * Реализуйте ту же иерархию классов, но сделав некоторые классы абстрактными.
 */

package com.company.tasks.task019;

public class Task019 {
    public static void run() {
        Box box = new Box(5000);
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
