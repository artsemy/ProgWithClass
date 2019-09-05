package com.company.classes.country;

import java.util.Arrays;

public class District {

    private City mainCity;
    private City[] cities;
    private String name;
    private double area;

    public District() {
        mainCity = new City("Slutsk", 10);
        cities = new City[0];
        name = "Dis";
        area = 10;
    }

    public District(City mainCity, City[] cities, String name, double area) {
        this.mainCity = mainCity;
        this.cities = cities;
        this.name = name;
        this.area = area;
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "District{" +
                "name='" + name + '\'' +
                ", mainCity=" + mainCity +
                ", cities=" + Arrays.toString(cities) +
                ", area=" + area +
                '}';
    }

    public void addCity(City c){
        cities = Arrays.copyOf(cities, cities.length+1);
        cities[cities.length-1] = c;
    }

}
