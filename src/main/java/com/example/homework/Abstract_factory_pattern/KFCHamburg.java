package com.example.homework.Abstract_factory_pattern;

// 具体产品 - 肯德基汉堡
class KFCHamburg implements Hamburg {
    @Override
    public void prepare() {
        System.out.println("KFC Hamburg is prepared.");
    }
}