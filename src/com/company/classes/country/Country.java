package com.company.classes.country;

import java.util.Arrays;

public class Country {

    private String name;
    private City capital;
    private State[] states;
    private double area;

    //constructor
    public Country() {
        name = "Belarus";
        capital = new City("Minsk", 1000);
        states = new State[0];
        area = 1000;
    }

    //to string
    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", capital=" + capital +
                ", states=" + Arrays.toString(states) +
                ", area=" + area +
                '}';
    }

    //add state
    public void addState(State s){
        states = Arrays.copyOf(states, states.length+1);
        states[states.length-1] = s;
        countArea();
    }

    //count area
    private void countArea(){
        area = 0;
        for (State s: states) {
            area += s.getArea();
        }
    }

    //print capital
    public void printCapital(){
        System.out.println("Capital: " + capital.getName());
    }

    //count states
    public void printCountStates(){
        System.out.println("Number of States: " + states.length);
    }

    //print area
    public void printArea(){
        System.out.println("Area: " + area);
    }

    //print states with its capitals
    public void printSatesCityS(){
        System.out.println("States main cities:");
        for (State s: states) {
            System.out.println(s.getName() + ": " + s.getMainCity().getName());
        }
    }

}
