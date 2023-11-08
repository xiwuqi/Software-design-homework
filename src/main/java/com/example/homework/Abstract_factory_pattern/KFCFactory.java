package com.example.homework.Abstract_factory_pattern;

// 具体工厂 - 肯德基工厂
class KFCFactory implements FastFoodFactory {
    @Override
    public Hamburg createHamburg() {
        return new KFCHamburg();
    }

    @Override
    public Cola createCola() {
        return new KFCCola();
    }
}