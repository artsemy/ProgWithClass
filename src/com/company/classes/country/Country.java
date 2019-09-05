package com.company.classes.country;

import java.util.Arrays;

public class Country {

    private String name;
    private City capital;
    private State[] states;
    private double area;

    public Country() {
        name = "Belarus";
        capital = new City("Minsk", 1000);
        states = new State[0];
        area = 1000;
    }

    public Country(String name, City capital, State[] states, double area) {
        this.name = name;
        this.capital = capital;
        this.states = states;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public State[] getStates() {
        return states;
    }

    public void setStates(State[] states) {
        this.states = states;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", states=" + Arrays.toString(states) +
                ", area=" + area +
                '}';
    }

    public void addState(State s){
        states = Arrays.copyOf(states, states.length+1);
        states[states.length-1] = s;
        countArea();
    }

    private void countArea(){
        area = 0;
        for (State s: states) {
            area += s.getArea();
        }
    }

    public void printCapital(){
        System.out.println("Capital: " + capital.getName());
    }

    public void printCountStates(){
        System.out.println("Number of States: " + states.length);
    }

    public void printArea(){
        System.out.println("Area: " + area);
    }

    public void printSatesCityS(){
        System.out.println("States main cities:");
        for (State s: states) {
            System.out.println(s.getMainCity().getName());
        }
    }

}
