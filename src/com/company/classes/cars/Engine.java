package com.company.classes.cars;

public class Engine {

    private String model;
    private int run;

    //constructor
    public Engine(String model, int run) {
        this.model = model;
        this.run = run;
    }

    //constructor
    public Engine() {
        model = "mercedes";
        run = 100_000;
    }

    //to string
    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", run=" + run +
                '}';
    }

}
