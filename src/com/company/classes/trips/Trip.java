package com.company.classes.trips;

public class Trip {

    public static String[] tripTypes = {"rest", "tour", "healing", "shopping", "cruise"};
    public static String[] transportTypes = {"bus", "plane", "ship", "train"};
    private String type;
    private String transport;
    private boolean food;
    private int days;

    public Trip() {
        type = tripTypes[0];
        transport = transportTypes[0];
        food = false;
        days = 3;
    }

    public Trip(String type, String transport, boolean food, int days) {
        this.type = type;
        this.transport = transport;
        this.food = food;
        this.days = days;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setType(int i) {
        if (i >= 0 && i < tripTypes.length) {
            type = tripTypes[i];
        } else {
            type = tripTypes[0];
        }
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public void setTransport(int i) {
        if (i >= 0 && i < transportTypes.length) {
            transport = transport;
        } else {
            transport = transportTypes[0];
        }
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

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
