package com.example.homework.Strategy_pattern;

public class Book {
    private String name;
    private double price;
    private DiscountStrategy discountStrategy;

    public Book(String name, double price, DiscountStrategy discountStrategy) {
        this.name = name;
        this.price = price;
        this.discountStrategy = discountStrategy;
    }

    public double getPrice() {
        return this.discountStrategy.calculateDiscount(price);
    }

    // Other getters and setters
}
