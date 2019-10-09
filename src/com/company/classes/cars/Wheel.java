package com.company.classes.cars;

public class Wheel {

    private int size;
    private Boolean isEmpty;

    //constructor
    public Wheel() {
        size = 16;
        isEmpty = false;
    }

    //constructor
    public Wheel(int size, Boolean isEmpty) {
        this.size = size;
        this.isEmpty = isEmpty;
    }

    //get method
    public Boolean getEmpty() {
        return isEmpty;
    }

    //set method
    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    //to string
    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", isEmpty=" + isEmpty +
                '}';
    }

}
