package com.company.animals;

public class Bird extends Animal implements Flight {
    protected boolean flyModeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    @Override
    public void takeOff() {
        this.flyModeActive = true;
    }

    @Override
    public void landing() {
        this.flyModeActive = false;
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
