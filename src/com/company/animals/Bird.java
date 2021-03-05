package com.company.animals;

public class Bird extends Animal {
    protected boolean flyModeActive = false;

    public void takeOff() {
        flyModeActive = true;
    }

    public void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(this.flyModeActive == true ? "Duck flying mode: Yes" : "Duck flying mode: No");
    }
}
