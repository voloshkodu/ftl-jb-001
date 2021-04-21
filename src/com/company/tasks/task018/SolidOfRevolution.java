package com.company.tasks.task018;

public class SolidOfRevolution extends Shape {
    protected double radius;

    public SolidOfRevolution (double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
