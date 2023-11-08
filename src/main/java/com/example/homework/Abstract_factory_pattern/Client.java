package com.example.homework.Abstract_factory_pattern;

// 客户端代码
public class Client {
    private Hamburg hamburg;
    private Cola cola;

    public Client(FastFoodFactory factory) {
        hamburg = factory.createHamburg();
        cola = factory.createCola();
    }

    public void serveMeal() {
        hamburg.prepare();
        cola.pour();
    }

    public static void main(String[] args) {
        FastFoodFactory mcdonaldsFactory = new McDonaldsFactory();
        Client mcdonaldsClient = new Client(mcdonaldsFactory);
        mcdonaldsClient.serveMeal();

        FastFoodFactory kfcFactory = new KFCFactory();
        Client kfcClient = new Client(kfcFactory);
        kfcClient.serveMeal();
    }
}
