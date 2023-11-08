package com.example.homework.Builder_pattern;

public class Director {
    private CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.createNewCar();
        builder.buildBody();
        builder.buildOilBox();
        builder.buildWheel();
    }

    public Car getCar() {
        return builder.getCar();
    }
}

