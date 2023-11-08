package com.example.homework.Observer_pattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Product product = new Product("XYZ Laptop", 999.99);

        // Create members and register them as observers
        Member member1 = new Member("John Doe");
        Member member2 = new Member("Jane Doe");
        product.addObserver(member1);
        product.addObserver(member2);

        // Change product price and notify observers
        product.setPrice(899.99);
    }
}
