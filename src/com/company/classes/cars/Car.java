package com.company.classes.cars;

public class Car {

    private String model;
    private Wheel[] wheels;
    private Engine engine;
    private boolean isFueled;
    private boolean isStarted;

    //constructor
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

    //constructor
    public Car(String model, Wheel[] wheels, Engine engine, boolean isFueled, boolean isStarted) {
        this.model = model;
        this.wheels = wheels;
        this.engine = engine;
        this.isFueled = isFueled;
        this.isStarted = isStarted;
    }

    //get method
    public String getModel() {
        return model;
    }

    //set method
    public void setModel(String model) {
        this.model = model;
    }

    //get method
    public Wheel[] getWheels() {
        return wheels;
    }

    //set method
    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    //get method
    public Engine getEngine() {
        return engine;
    }

    //set method
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    //get method
    public boolean isFueled() {
        return isFueled;
    }

    //set method
    public void setFueled(boolean fueled) {
        isFueled = fueled;
    }

    //get method
    public boolean isStarted() {
        return isStarted;
    }

    //set method
    public void setStarted(boolean started) {
        isStarted = started;
    }

    //to string
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

    //print model
    public void printModel(){
        System.out.println(model);
    }

}
