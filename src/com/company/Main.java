package com.company;

public class Main {

    public static void main(String[] args) {
        //classes and objects start
//        part1();
        //aggregation and composition
//        part2();
    }

    static void part1(){
        CheckWork checkWork = new CheckWork();
        //class with two variables, methods: change vars, print vars,
        //sum vars, max of vars
        checkWork.func1();
        //class with two variables, with two constructors, with get,set-methods
        checkWork.func2();
        //class student, [firstName, lastName, group, marks[5]]
        //create 10 students, print with mark only [9,10]
        checkWork.func3();
        //class train, [destination, number, departure time], create 5 trains
        //sort by number, print by number, sort by departure (if same by time)
        checkWork.func4();
        //class counter, show it work
        checkWork.func5();
        //class time, change fully partly, set value
        checkWork.func6();
        //class triangle, find area, perimeter, barycenter
        checkWork.func7();
        //class customer, [id, firstName, lastName, middleName, creditCardNum, BankAcNum]
        //get,set,toString methods; class with array customers
        //sort alphabetic order, print by cardNumber in range
        checkWork.func8();
        //class book, [id, title, author, publisher, year, pages, price, binding], get,set,toString methods
        //class book array, books by author, books by author, books released after year
        checkWork.func9();
        //class airline, [distinct, number, type, time, days], methods get,set,toString,constructor
        //class array airlines, methods, array by distinct, by day, by day after time
        checkWork.func10();
    }

    static void part2(){
        CheckWork2 checkWork2 = new CheckWork2();
        //class text, class sentence, class word; print title,text; add text
        checkWork2.func1();
        //class car, class wheel, class engine; start, fuel, change wheel, print model
        checkWork2.func2();
        //class country, class state, class distinct, class city;
        //print capital, number of states, area, capital of states
        checkWork2.func3();
        //class bank, bank account, bank client; block unblock accounts
        //count sum (negative, positive), search and sort
        checkWork2.func4();
        //class trip, tripList; [type, transport food, days], method find, sort
        checkWork2.func5();
    }

}
