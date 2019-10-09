package com.company.classes.airlines;

import com.company.classes.Time;

import java.util.Arrays;

public class AirLineList {

    Airline[] airlines;
    private int count;

    //constructor
    public AirLineList(Airline[] airlines) {
        this.airlines = airlines;
        count = airlines.length;
    }

    //constructor
    public AirLineList() {
        airlines = new Airline[1];
        count = 0;
    }

    //add airline to array
    public void addAirline(Airline airline){
        if (count == 0){
            airlines[0] = airline;
            count++;
        } else {
            airlines = Arrays.copyOf(airlines, airlines.length+1);
            airlines[airlines.length-1] = airline;
        }
    }

    //get array by distinct
    public AirLineList getByDistinct(String distinct){
        AirLineList res = new AirLineList();
        for (Airline airline: airlines) {
            if (airline.getDistinct().equals(distinct)){
                res.addAirline(airline);
            }
        }
        return res;
    }

    //get array by day
    public AirLineList getByDay(String day){
        AirLineList res = new AirLineList();
        for (Airline airline: airlines) {
            String[] mass = airline.getDays();
            if (hasDay(mass, day)){
                res.addAirline(airline);
            }
        }
        return res;
    }

    //check by day
    private boolean hasDay(String[] days, String day){
        for (String d: days) {
            if (d.equals(day)){
                return true;
            }
        }
        return false;
    }

    //print by day after time
    public AirLineList getByDayTime(String day, Time time){
        AirLineList res = new AirLineList();
        AirLineList byDay = getByDay(day);
        for (Airline line: byDay.airlines) {
            if (Time.compare(line.getTime(), time) > 0){
                res.addAirline(line);
            }
        }
        return res;
    }

    //print array
    public void print(){
        for (Airline a: airlines) {
            System.out.println(a);
        }
    }

}
