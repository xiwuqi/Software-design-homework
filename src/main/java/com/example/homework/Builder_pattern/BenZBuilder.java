package com.example.homework.Builder_pattern;

public class BenZBuilder extends CarBuilder {
    @Override
    public void buildWheel() {
        car.setWheel("BenZ Wheels");
    }

    @Override
    public void buildOilBox() {
        car.setOilBox("BenZ OilBox");
    }

    @Override
    public void buildBody() {
        car.setBody("BenZ Body");
    }
}
