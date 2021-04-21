package com.company.tasks.task018;

public class Ball extends SolidOfRevolution {
    public Ball (double radius) {
        super(4 * Math.PI * Math.pow(radius, 3) / 3, radius);
    }
}
