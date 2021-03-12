package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        try {
            dogs.add(Dog.of("Sharik", new AnimalWeight(-3, AnimalWeight.WeightType.kg)));
            dogs.add(Dog.of("Bubble", new AnimalWeight(1, AnimalWeight.WeightType.kg)));
            dogs.add(Dog.of("Tuzik", new AnimalWeight(5, AnimalWeight.WeightType.kg)));
        } catch (WeightException e) {
            e.printStackTrace();
        }
        return dogs;
    }

    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно определить разницу между текущей позицией и позицией палки
     * @param stickPosition - позиция палки
     */

    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - this.currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog() {
        System.out.println(this.currentPosition);
    }

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(AnimalWeight weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("wow!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
