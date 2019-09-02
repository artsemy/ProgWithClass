package com.company.classes;

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

    public void printWithMarks(boolean firstname, boolean lastname, boolean group, boolean marks, int[] mass){
        if (checkMarks(mass)){
            if (firstname){
                printFirstName();
            }
            if (lastname){
                printLastName();
            }
            if (group){
                printGroup();
            }
            if (marks){
                printMarks();
            }
        }
    }

    private boolean checkMarks(int[] mass){
        for (int mark : marks) {
            if (!checkMark(mass, mark)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkMark(int[] m, int elem){
        for (int k: m) {
            if (k == elem){
                return true;
            }
        }
        return false;
    }

    public void printFirstName(){
        System.out.println("firstname: " + firstName);
    }

    public void printLastName(){
        System.out.println("lastname: " + lastName);
    }

    public void printGroup(){
        System.out.println("group: " + group);
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
