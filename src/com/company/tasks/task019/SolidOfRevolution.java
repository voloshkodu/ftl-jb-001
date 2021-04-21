package com.company.tasks.task019;

public abstract class SolidOfRevolution extends Shape {
    protected double radius;

    public SolidOfRevolution (double volume, double radius) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
