package com.company.classes.country;

public class City {

    private String name;
    private int population;

    //constructor
    public City() {
        name = "Vil";
        population = 1;
    }

    //constructor
    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    //get method
    public String getName() {
        return name;
    }

    //set method
    public void setName(String name) {
        this.name = name;
    }

    //to string
    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

}
