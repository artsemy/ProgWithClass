package com.company.classes.cars;

import java.util.Arrays;

public class Car {

    private String model;
    private Wheel[] wheels;
    private Engine engine;
    private boolean isFueled;
    private boolean isStarted;

    public Car() {
        model = "Lada";
        wheels = new Wheel[4];
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
        engine = new Engine();
        isFueled = true;
        isStarted = false;
    }

    public Car(String model, Wheel[] wheels, Engine engine, boolean isFueled, boolean isStarted) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.isFueled = isFueled;
        this.isStarted = isStarted;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isFueled() {
        return isFueled;
    }

    public void setFueled(boolean fueled) {
        isFueled = fueled;
    }

    public boolean isStarted() {
        return isStarted;
    }

    public void setStarted(boolean started) {
        isStarted = started;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
//                ", wheels=" + Arrays.toString(wheels) +
                ", engine=" + engine +
                ", isFueled=" + isFueled +
                ", isStarted=" + isStarted +
                '}';
    }
}
