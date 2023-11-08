package com.example.homework.Bridge_pattern;

public class RefinedCoffee extends Coffee {
    public RefinedCoffee(CoffeeSize size, CoffeeAdditives additives) {
        super(size, additives);
    }

    @Override
    public void makeCoffee() {
        System.out.print("Making ");
        size.pourCoffee();
        additives.addSomething();
    }
}

