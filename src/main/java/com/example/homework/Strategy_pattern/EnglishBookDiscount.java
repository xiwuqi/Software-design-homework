package com.example.homework.Strategy_pattern;

public class EnglishBookDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.6;
    }
}

