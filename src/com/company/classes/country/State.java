package com.company.classes.country;

import java.util.Arrays;

public class State {

    private String name;
    private City mainCity;
    private double area;
    private District[] districts;

    public State() {
        name = "Sta";
        mainCity = new City("Brest", 100);
        area = 100;
        districts = new District[0];
    }

    public State(String name, City mainCity, double area, District[] districts) {
        this.name = name;
        this.mainCity = mainCity;
        this.area = area;
        this.districts = districts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getMainCity() {
        return mainCity;
    }

    public void setMainCity(City mainCity) {
        this.mainCity = mainCity;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                ", mainCity=" + mainCity +
                ", districts=" + Arrays.toString(districts) +
                ", area=" + area +
                '}';
    }

    public void addDistrict(District d){
        districts = Arrays.copyOf(districts, districts.length+1);
        districts[districts.length-1] = d;
        countArea();
    }

    private void countArea(){
        area = 0;
        for (District d: districts) {
            area += d.getArea();
        }
    }
}
