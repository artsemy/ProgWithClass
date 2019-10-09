package com.company.classes.airlines;

import com.company.classes.Time;

import java.util.Arrays;

public class Airline {

    private String distinct;
    private int number;
    private String type;
    private Time time;
    private String[] days;

    //constructor
    public Airline(String distinct, int number, String type, Time time, String[] days) {
        this.distinct = distinct;
        this.number = number;
        this.type = type;
        this.time = time;
        this.days = days;
    }

    //constructor
    public Airline() {
        distinct = "Minsk";
        number = 1;
        type = "big";
        time = new Time(12,0,0);
        days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

    //to string
    @Override
    public String toString() {
        return "Airline{" +
                "distinct='" + distinct + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    //get method
    public String getDistinct() {
        return distinct;
    }

    //set method
    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    //get method
    public Time getTime() {
        return time;
    }

    //set method
    public void setTime(Time time) {
        this.time = time;
    }

    //get method
    public String[] getDays() {
        return days;
    }

    //set method
    public void setDays(String[] days) {
        this.days = days;
    }

}
