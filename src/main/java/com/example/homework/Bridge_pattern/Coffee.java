package com.example.homework.Bridge_pattern;

public abstract class Coffee {
    protected CoffeeSize size;
    protected CoffeeAdditives additives;

    public Coffee(CoffeeSize size, CoffeeAdditives additives) {
        this.size = size;
        this.additives = additives;
    }

    public abstract void makeCoffee();
}
