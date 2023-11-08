package com.example.homework.Decorator_pattern;

public abstract class SheepDecorator extends Sheep {
    protected Sheep decoratedSheep;

    public SheepDecorator(Sheep decoratedSheep) {
        this.decoratedSheep = decoratedSheep;
    }

    public void displayAbilities() {
        decoratedSheep.displayAbilities();
    }
}

