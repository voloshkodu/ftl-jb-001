package com.company;

import com.company.L001.HelloWorld;
import com.company.L002.POJO;
import com.company.L003.Cat;

public class Main {

    public static void main(String[] args) {
        HelloWorld.run();
        POJO.run();

        Cat catVar = new Cat();
        catVar.voice();
        Cat barsik = new Cat();
    }
}
