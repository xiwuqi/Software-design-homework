package com.example.homework.Decorator_pattern;

public class HappySheep extends Sheep {
    @Override
    public void displayAbilities() {
        System.out.println("喜羊羊现在有 " + life + " 条命。");
    }
}
