package com.example.homework.Bridge_pattern;

public class Milk implements CoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("with milk");
    }
}
