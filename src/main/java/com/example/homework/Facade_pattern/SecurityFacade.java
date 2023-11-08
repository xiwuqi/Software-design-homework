package com.example.homework.Facade_pattern;

public class SecurityFacade {
    private Camera camera;
    private Light light;
    private Sensor sensor;
    private Alarm alarm;

    public SecurityFacade() {
        camera = new Camera();
        light = new Light();
        sensor = new Sensor();
        alarm = new Alarm();
    }

    public void activate() {
        camera.turnOn();
        light.turnOn();
        sensor.activate();
        alarm.alarmOn();
    }

    public void deactivate() {
        camera.turnOff();
        light.turnOff();
        sensor.deactivate();
        alarm.alarmOff();
    }
}
