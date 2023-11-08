package com.example.homework.Bridge_pattern;

public class Sugar implements CoffeeAdditives {
    @Override
    public void addSomething() {
        System.out.println("with sugar");
    }
}
