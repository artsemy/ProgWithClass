package com.company.classes.trips;

public class Trip {

    public static String[] tripTypes = {"rest", "tour", "healing", "shopping", "cruise"};
    public static String[] transportTypes = {"bus", "plane", "ship", "train"};
    private String type;
    private String transport;
    private boolean food;
    private int days;

    //constructor
    public Trip() {
        type = tripTypes[0];
        transport = transportTypes[0];
        food = false;
        days = 3;
    }

    //constructor
    public Trip(String type, String transport, boolean food, int days) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    //get method
    public String getType() {
        return type;
    }

    //set method
    public void setType(String type) {
        this.type = type;
    }

    //set method
    public void setType(int i) {
        if (i >= 0 && i < tripTypes.length) {
            type = tripTypes[i];
        } else {
            type = tripTypes[0];
        }
    }

    //get method
    public String getTransport() {
        return transport;
    }

    //set method
    public void setTransport(String transport) {
        this.transport = transport;
    }

    //set method
    public void setTransport(int i) {
        if (i >= 0 && i < transportTypes.length) {
            transport = transport;
        } else {
            transport = transportTypes[0];
        }
    }

    //get method
    public boolean isFood() {
        return food;
    }

    //set method
    public void setFood(boolean food) {
        this.food = food;
    }

    //get method
    public int getDays() {
        return days;
    }

    //set method
    public void setDays(int days) {
        this.days = days;
    }

    //to string
    @Override
    public String toString() {
        return "Trip{" +
                "type='" + type + '\'' +
                ", transport='" + transport + '\'' +
                ", food=" + food +
                ", days=" + days +
                '}';
    }

}
