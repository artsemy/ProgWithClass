package com.company.classes.cars;

public class Wheel {

    private int size;
    private Boolean isEmpty;

    public Wheel() {
        size = 16;
        isEmpty = false;
    }

    public Wheel(int size, Boolean isEmpty) {
        this.size = size;
        this.isEmpty = isEmpty;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public void setEmpty(Boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "size=" + size +
                ", isEmpty=" + isEmpty +
                '}';
    }
}
