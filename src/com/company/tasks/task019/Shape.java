package com.company.tasks.task019;

public abstract class Shape {
    protected double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "volume=" + volume +
                '}';
    }
}
