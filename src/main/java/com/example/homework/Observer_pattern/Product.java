package com.example.homework.Observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setName(String name) {
        this.name = name;
        notifyObservers();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (Observer ob : observers) {
            ob.update(this.name, this.price);
        }
    }
}
