package com.company;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String lastName;
    private int group;
    private int[] marks;

    public Student(String firstName, String lastName, int group, int[] marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.marks = marks;
    }

    public Student(){
        firstName = "A. D.";
        lastName = "Smith";
        group = 1;
        marks = new int[]{9, 9, 9, 10, 10};
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void printWithMarks(boolean b1, boolean b2, boolean b3, int[] mass){
        boolean b = true;
        for (int k: mass) {
            if (!checkMark(k)){
                b = false;
            }
        }
        if (b){
            if (b1){
                printFirstName();
            }
            if (b2){
                printLastName();
            }
            if (b3){
                printGroup();
            }
        }
    }

    private boolean checkMark(int m){
        for (int k: marks) {
            if (k == m) {
                return true;
            }
        }
        return false;
    }

    public void printFirstName(){
        System.out.println(firstName);
    }

    public void printLastName(){
        System.out.println(firstName);
    }

    public void printGroup(){
        System.out.println(firstName);
    }

    public void printMarks(){
        if(marks.length > 0) {
            System.out.print(marks[0]);
            for (int i = 1; i < marks.length; i++) {
                System.out.print(" " + marks[i]);
            }
        }
    }
}
