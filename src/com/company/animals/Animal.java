package com.company.animals;

public abstract class Animal {
    public static class WeightException extends RuntimeException {

    }

    public static class AnimalWeight {
        public enum WeightType {
            kg, g
        }
        private Integer value;
        private WeightType weightType;

        public AnimalWeight(Integer value, WeightType weightType) throws WeightException {
            if (value < 0) throw new WeightException();
            this.value = value;
            this.weightType = weightType;
        }

        @Override
        public String toString() {
            return "AnimalWeight{" +
                    "value=" + value +
                    ", weightType=" + weightType +
                    '}';
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            if (value < 0) throw new WeightException();
            this.value = value;
        }

        public WeightType getWeightType() {
            return weightType;
        }

        public void setWeightType(WeightType weightType) {
            this.weightType = weightType;
        }
    }

    protected String name;
    protected AnimalWeight weight;
    protected Integer currentPosition = 0;
    protected MoveType moveType;

    public Animal(String name, AnimalWeight weight, MoveType moveType) {
        this.name = name;
        this.weight = weight;
        this.moveType = moveType;
    }

    public Animal(MoveType moveType) {
        this.moveType = moveType;
    }

    public abstract void voice();

    protected void runForward(Integer length) {
        this.currentPosition += length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnimalWeight getWeight() {
        return weight;
    }

    public void setWeight(AnimalWeight weight) {
        this.weight = weight;
    }

    public Integer getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Integer currentPosition) {
        this.currentPosition = currentPosition;
    }

    public MoveType getMoveType() {
        return moveType;
    }

    public void setMoveType(MoveType moveType) {
        this.moveType = moveType;
    }

}
