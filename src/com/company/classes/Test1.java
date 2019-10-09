package com.company.classes;

public class Test1 {
    private int x1;
    private int x2;

    //print vars
    public void print(){
        System.out.println(x1 + " " + x2);
    }

    //change both vars
    public void changeAll(int x1, int x2){
        changeX1(x1);
        changeX2(x2);
    }

    //change var1
    public void changeX1(int x1){
        this.x1 = x1;
    }

    //change var2
    public void changeX2(int x2){
        this.x2 = x2;
    }

    //find sum vars
    public int sum(){
        return x1 + x2;
    }

    //find max of vars
    public int max(){
        return Math.max(x1, x2);
    }
}
