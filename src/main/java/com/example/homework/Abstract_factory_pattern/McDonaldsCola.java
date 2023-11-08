package com.example.homework.Abstract_factory_pattern;

// 具体产品 - 麦当劳可乐
class McDonaldsCola implements Cola {
    @Override
    public void pour() {
        System.out.println("McDonald's Cola is poured.");
    }
}