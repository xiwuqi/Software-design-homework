package com.example.homework.Builder_pattern;

public class CarBuilderTest {
    public static void main(String[] args) {
        CarBuilder bmwBuilder = new BMWBuilder();
        Director director = new Director(bmwBuilder);
        director.construct();
        Car bmw = director.getCar();
        System.out.println("Car built: " + bmw);

        CarBuilder benzBuilder = new BenZBuilder();
        director = new Director(benzBuilder);
        director.construct();
        Car benz = director.getCar();
        System.out.println("Car built: " + benz);
    }
}
