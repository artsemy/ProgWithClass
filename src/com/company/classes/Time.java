package com.company.classes;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(){
        setTime(0,0,0);
    }

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour){
        this.hour = checkHour(hour) ? hour : 0;
    }

    public void setMinute(int minute){
        this.minute = checkMinute(minute) ? minute : 0;
    }

    public void setSecond(int second){
        this.second = checkSecond(second) ? second : 0;
    }

    private boolean checkHour(int h){
        return h <= 23 && h >= 0;
    }

    private boolean checkMinute(int m){
        return m <= 59 && m >= 0;
    }

    private boolean checkSecond(int s){
        return s <= 59 && s >= 0;
    }

    public void addHour(int h){
        hour = (hour + h) % 24;
        if (hour < 0){
            hour += 24;
        }
    }

    public void addMinute(int m){
        int h = (m + minute) / 60;
        addHour(h);
        minute = m + minute - h * 60;
        if (minute < 0){
            minute += 60;
            addHour(-1);
        }
    }

    public void addSecond(int s){
        int m = (s + second) / 60;
        addMinute(m);
        second = s + second - m * 60;
        if (second < 0){
            second += 60;
            addMinute(-1);
        }
    }

    public void print(){
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }
}
