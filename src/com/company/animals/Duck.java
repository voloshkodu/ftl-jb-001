package com.company.animals;

public class Duck extends Bird {
    public static final String DUCK_VOICE = "quack!";
    public static final Integer SPEED_FLY = 40;
    public static final Integer SPEED_WALK = 4;

    public Duck() {
        super();
    }

    @Override
    public void voice() {
        System.out.println(DUCK_VOICE);
    }

    public void showSpeed() {
        if(flyModeActive == true) {
            System.out.println(SPEED_FLY);
        }
        else {
            System.out.println(SPEED_WALK);
        }
    }
}
