package com.company.classes.airlines;

import com.company.classes.Time;

import java.util.Arrays;

public class Airline {

    private String distinct;
    private int number;
    private String type;
    private Time time;
    private String[] days;

    public Airline(String distinct, int number, String type, Time time, String[] days) {
        this.distinct = distinct;
        this.number = number;
        this.type = type;
        this.time = time;
        this.days = days;
    }

    public Airline() {
        distinct = "Minsk";
        number = 1;
        type = "big";
        time = new Time(12,0,0);
        days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    }

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

    public String getDistinct() {
        return distinct;
    }

    public void setDistinct(String distinct) {
        this.distinct = distinct;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String[] getDays() {
        return days;
    }

    public void setDays(String[] days) {
        this.days = days;
    }
}
