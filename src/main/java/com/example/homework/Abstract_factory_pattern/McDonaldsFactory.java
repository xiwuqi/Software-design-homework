package com.example.homework.Abstract_factory_pattern;

// 具体工厂 - 麦当劳工厂
class McDonaldsFactory implements FastFoodFactory {
    @Override
    public Hamburg createHamburg() {
        return new McDonaldsHamburg();
    }

    @Override
    public Cola createCola() {
        return new McDonaldsCola();
    }
}