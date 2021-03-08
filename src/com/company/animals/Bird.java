package com.company.animals;

public class Bird extends Animal {
    protected boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff() {
        flyModeActive = true;
    }

    public final void landing() {
        flyModeActive = false;
    }

    public void isTheBirdFlying() {
        System.out.println(this.flyModeActive == true ? "Bird flying mode: Yes" : "Bird flying mode: No");
    }

    public boolean isFlyModeActive() {
        return flyModeActive;
    }

    public void setFlyModeActive(boolean flyModeActive) {
        this.flyModeActive = flyModeActive;
    }
}
