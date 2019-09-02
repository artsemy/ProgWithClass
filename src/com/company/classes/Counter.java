package com.company.classes;

public class Counter {

    private int value;
    private int max;
    private int min;

    public Counter(){
        value = 0;
        max = 100;
        min = 0;
    }

    public Counter(int min, int max, int value){
        this.min = min;
        this.max = max;
        if (value < min || value > max) {
            this.value = min;
        } else {
            this.value = value;
        }
    }

    public void increase(){
        if (canIncrease()){
            value++;
        }
    }

    public boolean canIncrease(){
        return value < max;
    }

    public void decrease(){
        if (canDecrease()){
            value--;
        }
    }

    public boolean canDecrease(){
        return value > min;
    }

    public int getValue(){
        return value;
    }
}
