package com.company.animals;

public class Duck extends Bird {
    public Duck() {
        super();
    }

    @Override
    public void voice() {
        System.out.println("quack!");
    }

    public void showSpeed() {
        if(flyModeActive == true) {
            System.out.println("40");
        }
        else {
            System.out.println("4");
        }
    }
}
