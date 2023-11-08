package com.example.homework.Decorator_pattern;

public class YellowAppleDecorator extends SheepDecorator {
    public YellowAppleDecorator(Sheep decoratedSheep) {
        super(decoratedSheep);
    }

    @Override
    public void displayAbilities() {
        decoratedSheep.displayAbilities();
        runThroughWater(decoratedSheep);
    }

    private void runThroughWater(Sheep sheep) {
        System.out.println("喜羊羊可以趟着水跑了。");
    }
}
