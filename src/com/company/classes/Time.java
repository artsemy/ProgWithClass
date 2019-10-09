package com.company.classes;

public class Time {

    private int hour;
    private int minute;
    private int second;

    //constructor
    public Time(){
        setTime(0,0,0);
    }

    //constructor
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    //set time with correct params
    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    //set time with correct params
    public void setHour(int hour){
        this.hour = checkHour(hour) ? hour : 0;
    }

    //set time with correct params
    public void setMinute(int minute){
        this.minute = checkMinute(minute) ? minute : 0;
    }

    //set time with correct params
    public void setSecond(int second){
        this.second = checkSecond(second) ? second : 0;
    }

    //check for correct params
    private boolean checkHour(int h){
        return h <= 23 && h >= 0;
    }

    //check for correct params
    private boolean checkMinute(int m){
        return m <= 59 && m >= 0;
    }

    //check for correct params
    private boolean checkSecond(int s){
        return s <= 59 && s >= 0;
    }

    //add hour
    public void addHour(int h){
        hour = (hour + h) % 24;
        if (hour < 0){
            hour += 24;
        }
    }

    //add minute
    public void addMinute(int m){
        int h = (m + minute) / 60;
        addHour(h);
        minute = m + minute - h * 60;
        if (minute < 0){
            minute += 60;
            addHour(-1);
        }
    }

    //add second
    public void addSecond(int s){
        int m = (s + second) / 60;
        addMinute(m);
        second = s + second - m * 60;
        if (second < 0){
            second += 60;
            addMinute(-1);
        }
    }

    //print time
    public void print(){
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    //to string
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    //compare
    static public int compare(Time o1, Time o2) {
        int l1 = o1.hour*3600 + o1.minute*60 + o1.second;
        int l2 = o2.hour*3600 + o2.minute*60 + o2.second;
        return Integer.compare(l1, l2);
    }

}
