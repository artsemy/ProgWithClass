package com.company.classes.country;

import java.util.Arrays;

public class State {

    private String name;
    private City mainCity;
    private double area;
    private District[] districts;

    //constructor
    public State() {
        name = "Sta";
        mainCity = new City("Brest", 100);
        area = 100;
        districts = new District[0];
    }

    //constructor
    public State(String name, City mainCity, double area, District[] districts) {
        this.name = name;
        this.mainCity = mainCity;
        this.area = area;
        this.districts = districts;
    }

    //get method
    public String getName() {
        return name;
    }

    //set method
    public void setName(String name) {
        this.name = name;
    }

    //get method
    public City getMainCity() {
        return mainCity;
    }

    //set method
    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }

    //get method
    public double getArea() {
        return area;
    }

    //set method
    public void setArea(double area) {
        this.area = area;
    }

    //to string
    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", mainCity=" + mainCity +
                ", districts=" + Arrays.toString(districts) +
                ", area=" + area +
                '}';
    }

    //add district
    public void addDistrict(District d){
        districts = Arrays.copyOf(districts, districts.length+1);
        districts[districts.length-1] = d;
        countArea();
    }

    //count area
    private void countArea(){
        area = 0;
        for (District d: districts) {
            area += d.getArea();
        }
    }

}
