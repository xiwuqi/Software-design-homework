package com.example.homework.Bridge_pattern;

public class SmallCoffee implements CoffeeSize {
    @Override
    public void pourCoffee() {
        System.out.print("Pouring small coffee");
    }
}

