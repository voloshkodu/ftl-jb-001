package com.company.animals;

public class Bird extends Animal {
    protected boolean flyModeActive = false;

    public Bird() {
        super();
        this.canFly = true;
    }

    public void takeOff() {
        flyModeActive = true;
    }

    public void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(this.flyModeActive == true ? "Duck flying mode: Yes" : "Duck flying mode: No");
    }

    public boolean isFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
