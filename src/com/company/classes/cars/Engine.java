package com.company.classes.cars;

public class Engine {

    private String model;
    private int run;

    public Engine(String model, int run) {
        this.model = model;
        this.run = run;
    }

    public Engine() {
        model = "mercedes";
        run = 100_000;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", run=" + run +
                '}';
    }
}
