package com.example.homework.Factory_pattern;

public class OEMTest {
    public static void main(String[] args) {
        LaptopFactory factory = new LaptopFactory();

        // 创建HP笔记本
        Laptop hpLaptop = factory.createLaptop("HP");
        hpLaptop.assemble();

        // 创建Acer笔记本
        Laptop acerLaptop = factory.createLaptop("Acer");
        acerLaptop.assemble();

        // 创建Lenovo笔记本
        Laptop lenovoLaptop = factory.createLaptop("Lenovo");
        lenovoLaptop.assemble();

        // 创建Dell笔记本
        Laptop dellLaptop = factory.createLaptop("Dell");
        dellLaptop.assemble();
    }
}

