package com.example.homework.Bridge_pattern;

public class JorumCoffee implements CoffeeSize {
    @Override
    public void pourCoffee() {
        System.out.print("Pouring large coffee");
    }
}
