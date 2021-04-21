package com.company.tasks.task018;

public class Pyramid extends Shape {
    protected double s, h;

    public Pyramid(double s, double h) {
        super(s * h / 3);
        this.s = s;
        this.h = h;
    }
}
