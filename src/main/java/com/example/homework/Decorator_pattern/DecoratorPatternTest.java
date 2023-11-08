package com.example.homework.Decorator_pattern;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Sheep happySheep = new HappySheep();
        happySheep.displayAbilities();
        System.out.println("------------");

        happySheep = new RedAppleDecorator(happySheep);
        happySheep.displayAbilities();
        System.out.println("------------");

        happySheep = new GreenAppleDecorator(happySheep);
        happySheep.displayAbilities();
        System.out.println("------------");

        happySheep = new YellowAppleDecorator(happySheep);
        happySheep.displayAbilities();
    }
}
