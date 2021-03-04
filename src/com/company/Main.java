package com.company;


import com.company.animals.Cat;
import com.company.animals.Dog;

public class Main {

    public static void main(String[] args) {
//        HelloWorld.run();
//        POJO.run();
//
//        Cat catVar = new Cat();
//        catVar.voice();
//
//        com.company.L004.Cat catL004 = new com.company.L004.Cat();
//        catL004.voice();
          Cat cat = new Cat("Barsik", 20);
          System.out.println(cat.jumpHeight());

          Dog dog = new Dog();
          dog.goToStick(14);
          dog.whereTheDog();
          dog.goToStick(20);
          dog.whereTheDog();
          dog.goToStick(5);
          dog.whereTheDog();

          Dog homelessDog = Dog.ofHomeless(100);

    }
}
