package com.example.homework.Decorator_pattern;

public class RedAppleDecorator extends SheepDecorator {
    public RedAppleDecorator(Sheep decoratedSheep) {
        super(decoratedSheep);
    }

    @Override
    public void displayAbilities() {
        decoratedSheep.displayAbilities();
        addShield(decoratedSheep);
    }

    private void addShield(Sheep sheep) {
        System.out.println("喜羊羊得到了保护罩。");
    }
}
