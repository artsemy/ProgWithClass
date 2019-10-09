package com.company.classes.country;

import java.util.Arrays;

public class District {

    private City mainCity;
    private City[] cities;
    private String name;
    private double area;

    //constructor
    public District() {
        mainCity = new City("Slutsk", 10);
        cities = new City[0];
        name = "Dis";
        area = 10;
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
        return "District{" +
                "name='" + name + '\'' +
                ", mainCity=" + mainCity +
                ", cities=" + Arrays.toString(cities) +
                ", area=" + area +
                '}';
    }

    //add city
    public void addCity(City c){
        cities = Arrays.copyOf(cities, cities.length+1);
        cities[cities.length-1] = c;
    }

}
