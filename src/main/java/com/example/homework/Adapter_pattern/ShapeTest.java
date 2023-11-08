package com.example.homework.Adapter_pattern;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape line = new Line();
        Shape angle = new AngleAdapter(new Angle());

        circle.draw();
        rectangle.draw();
        line.draw();
        angle.draw();
    }
}
