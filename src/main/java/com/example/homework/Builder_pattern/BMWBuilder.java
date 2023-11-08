package com.example.homework.Builder_pattern;

public class BMWBuilder extends CarBuilder {
    @Override
    public void buildWheel() {
        car.setWheel("BMW Wheels");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BMW OilBox");
    }

    @Override
    public void buildBody() {
        car.setBody("BMW Body");
    }
}

