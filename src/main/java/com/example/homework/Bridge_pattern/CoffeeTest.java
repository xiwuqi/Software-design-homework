package com.example.homework.Bridge_pattern;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee largeCoffeeMilk = new RefinedCoffee(new JorumCoffee(), new Milk());
        largeCoffeeMilk.makeCoffee();

        Coffee mediumCoffeeSugar = new RefinedCoffee(new MediumCoffee(), new Sugar());
        mediumCoffeeSugar.makeCoffee();

        Coffee smallCoffeeLemon = new RefinedCoffee(new SmallCoffee(), new Lemon());
        smallCoffeeLemon.makeCoffee();
    }
}
