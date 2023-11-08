package com.example.homework.Strategy_pattern;

public class StrategyTest {
    public static void main(String[] args) {
        Book computerBook = new Book("Computer Science", 50.0, new ComputerBookDiscount());
        Book englishBook = new Book("Learn English", 30.0, new EnglishBookDiscount());

        System.out.println("Computer Book Price after Discount: " + computerBook.getPrice());
        System.out.println("English Book Price after Discount: " + englishBook.getPrice());
    }
}
