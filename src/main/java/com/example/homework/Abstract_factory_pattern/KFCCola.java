package com.example.homework.Abstract_factory_pattern;

// 具体产品 - 肯德基可乐
class KFCCola implements Cola {
    @Override
    public void pour() {
        System.out.println("KFC Cola is poured.");
    }
}