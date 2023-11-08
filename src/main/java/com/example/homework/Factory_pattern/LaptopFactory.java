package com.example.homework.Factory_pattern;

public class LaptopFactory {
    public Laptop createLaptop(String type) {
        switch (type) {
            case "HP":
                return new HpLaptop();
            case "Acer":
                return new AcerLaptop();
            case "Lenovo":
                return new LenovoLaptop();
            case "Dell":
                return new DellLaptop();
            default:
                throw new IllegalArgumentException("Unknown Laptop Brand");
        }
    }
}

