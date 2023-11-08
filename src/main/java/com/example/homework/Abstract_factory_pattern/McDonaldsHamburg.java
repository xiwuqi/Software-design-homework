package com.example.homework.Abstract_factory_pattern;

// 具体产品 - 麦当劳汉堡
class McDonaldsHamburg implements Hamburg {
    @Override
    public void prepare() {
        System.out.println("McDonald's Hamburg is prepared.");
    }
}