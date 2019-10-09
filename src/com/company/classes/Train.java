package com.company.classes;

import java.util.Date;
import java.util.Random;

public class Train implements Comparable<Train>{

    private int number;
    private Date time;
    private String destination;

    //constructor
    public Train(int number, Date time, String destination){
        this.number = number;
        this.time = time;
        this.destination = destination;
    }

    //constructor
    public Train(){
        Random r = new Random();
        number = r.nextInt(10);
        time = new Date(new Date().getTime() + r.nextInt(100000) - 50000);
        destination = "London";
    }

    //string to print
    public String toString(){
        String res = "train number: " + number + "\n"
                + "time: " + time.toString() + "\n"
                + "destination: " + destination;
        return res;
    }

    //print
    public void print(){
        System.out.println(this);
    }

    //clever print
    public void print(boolean number, boolean time, boolean destination){
        if (number){
            System.out.println("train number: " + this.number);
        }
        if (time){
            System.out.println("time: " + this.time.toString());
        }
        if (destination){
            System.out.println("destination: " + this.destination);
        }
    }

    //for sort by number
    @Override
    public int compareTo(Train t) {
        return Integer.compare(number, t.getNumber());
    }

    //get method
    public int getNumber() {
        return number;
    }

    //set method
    public void setNumber(int number) {
        this.number = number;
    }

    //get method
    public Date getTime() {
        return time;
    }

    //set method
    public void setTime(Date time) {
        this.time = time;
    }

    //get method
    public String getDestination() {
        return destination;
    }

    //set method
    public void setDestination(String destination) {
        this.destination = destination;
    }

}
