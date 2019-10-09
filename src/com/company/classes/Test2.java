package com.company.classes;

public class Test2 {

    private int x1;
    private int x2;

    //constructor1
    public Test2(){
        x1 = 0;
        x2 = 0;
    }

    //constructor2
    public Test2(int x1, int x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    //get method
    public int getX1() {
        return x1;
    }

    //set method
    public void setX1(int x1) {
        this.x1 = x1;
    }

    //get method
    public int getX2() {
        return x2;
    }

    //set method
    public void setX2(int x2) {
        this.x2 = x2;
    }
}
