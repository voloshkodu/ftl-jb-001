package com.company.L024;

import com.company.animals.Flight;

public class AnonExample {
    public static void run() {
        Flight flight = new Flight() {
            @Override
            public void takeOff() {

            }

            @Override
            public void landing() {

            }
        };

        flight.landing();
        flight.takeOff();
    }
}
