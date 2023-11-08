package com.example.homework.Strategy_pattern;

public class ComputerBookDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.7;
    }
}

