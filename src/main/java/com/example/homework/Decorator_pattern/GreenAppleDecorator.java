package com.example.homework.Decorator_pattern;

public class GreenAppleDecorator extends SheepDecorator {
    public GreenAppleDecorator(Sheep decoratedSheep) {
        super(decoratedSheep);
    }

    @Override
    public void displayAbilities() {
        decoratedSheep.displayAbilities();
        increaseSpeed(decoratedSheep);
    }

    private void increaseSpeed(Sheep sheep) {
        System.out.println("喜羊羊的奔跑速度加快了。");
    }
}
