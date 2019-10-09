package com.company.classes;

public class Counter {

    private int value;
    private int max;
    private int min;

    //constructor
    public Counter(){
        value = 0;
        max = 100;
        min = 0;
    }

    //constructor
    public Counter(int min, int max, int value){
        this.min = min;
        this.max = max;
        if (value < min || value > max) {
            this.value = min;
        } else {
            this.value = value;
        }
    }

    //increase value
    public void increase(){
        if (canIncrease()){
            value++;
        }
    }

    //check if can increase
    public boolean canIncrease(){
        return value < max;
    }

    //decrease value
    public void decrease(){
        if (canDecrease()){
            value--;
        }
    }

    //check if can decrease
    public boolean canDecrease(){
        return value > min;
    }

    //get value
    public int getValue(){
        return value;
    }

}
