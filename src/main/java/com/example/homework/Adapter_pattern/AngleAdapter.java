package com.example.homework.Adapter_pattern;

public class AngleAdapter implements Shape {
    private Angle angle;

    public AngleAdapter(Angle angle) {
        this.angle = angle;
    }

    @Override
    public void draw() {
        angle.drawAngle();
    }
}
