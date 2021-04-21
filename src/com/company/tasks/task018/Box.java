package com.company.tasks.task018;

public class Box extends Shape {

    public Box(double volume) {
        super(volume);
    }

    private double availableSpace = volume;

    public boolean add (Shape shape) {
        availableSpace -= shape.volume;
        if (availableSpace <= 0) {
            System.out.println("No available left");
            return false;
        } else {
            System.out.println("Available space left: " + availableSpace);
            return true;
        }
    }
}
