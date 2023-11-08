package com.example.homework.Builder_pattern;

public abstract class CarBuilder {
    protected Car car;

    public Car getCar() {
        return car;
    }

    public void createNewCar() {
        car = new Car();
    }

    public abstract void buildWheel();
    public abstract void buildOilBox();
    public abstract void buildBody();
}

