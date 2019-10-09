package com.company.classes;

public class Student {

    private String firstName;
    private String lastName;
    private int group;
    private int[] marks;

    //constructor
    public Student(String firstName, String lastName, int group, int[] marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.marks = marks;
    }

    //constructor
    public Student(){
        firstName = "A. D.";
        lastName = "Smith";
        group = 1;
        marks = new int[]{9, 9, 9, 10, 10};
    }

    //set method
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    //print 'true' fields, if marks only in 'mass'
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

    //check array of given marks
    private boolean checkMarks(int[] mass){
        for (int mark : marks) {
            if (!checkMark(mass, mark)) {
                return false;
            }
        }
        return true;
    }

    //check each mark for given array
    private boolean checkMark(int[] m, int elem){
        for (int k: m) {
            if (k == elem){
                return true;
            }
        }
        return false;
    }

    //print var
    public void printFirstName(){
        System.out.println("firstname: " + firstName);
    }

    //print var
    public void printLastName(){
        System.out.println("lastname: " + lastName);
    }

    //print var
    public void printGroup(){
        System.out.println("group: " + group);
    }

    //print var
    public void printMarks(){
        System.out.print("marks: ");
        if(marks.length > 0) {
            System.out.print(marks[0]);
            for (int i = 1; i < marks.length; i++) {
                System.out.print(" " + marks[i]);
            }
        }
        System.out.println();
    }

}
