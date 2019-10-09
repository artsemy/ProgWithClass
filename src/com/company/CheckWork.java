package com.company;

import com.company.classes.*;
import com.company.classes.airlines.AirLineList;
import com.company.classes.airlines.Airline;
import com.company.classes.books.Book;
import com.company.classes.books.BookList;
import com.company.classes.customers.Customer;
import com.company.classes.customers.CustomerList;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class CheckWork {

    //class with two variables, methods: change vars, print vars,
    //sum vars, max of vars
    void func1(){
        Test1 test1 = new Test1();
        //change var1
        test1.changeX1(2);
        //change var2
        test1.changeX2(3);
        //print vars
        test1.print();
        //find sum vars
        System.out.println("sum=" + test1.sum());
        //find max of vars
        System.out.println("max=" + test1.max());
    }

    //class with two variables, with two constructors, with get,set-methods
    void func2(){
        //constructor1
        Test2 t1 = new Test2();
        //constructor2
        Test2 t2 = new Test2(3, 4);
        //set method
        t1.setX1(5);
        //get methods
        System.out.println(t1.getX1());
        System.out.println(t2.getX2());
    }

    //class student, [firstname, lastname, group, marks[5]]
    //create 10 students, print with marks only [9,10]
    void func3(){
        //create 10 students
        Student[] students = new Student[10];
        Random r = new Random();
        for (int i = 0; i < students.length; i++) {
            //init students
            students[i] = new Student();
            students[i].setMarks(new int[]{9, 9, 9, 9, r.nextInt(10)+1});
            //print with marks only [9,10]
            students[i].printWithMarks(false, true, false, true, new int[]{9, 10});
        }
    }

    //class train, [destination, number, departure time], create 5 trains
    //sort by number, print by number, sort by departure (if same by time)
    void func4(){
        //create 5 trains
        Train[] trains = func4f();
        //print all trains
        func4e(trains);
        //sort by number
        func4a(trains);
        //print by number
        func4b(trains);
        //sort by departure (if same by time)
        func4c(trains);
    }

    //sort by number
    private void func4a(Train[] trains){
        Arrays.sort(trains);
        func4e(trains);
    }

    //print by number
    private void func4b(Train[] trains){
        Random r = new Random();
        boolean b = true;
        while (b){
            int k = r.nextInt(10);
            for (Train t: trains) {
                if (t.getNumber() == k){
                    System.out.println("num = " + k);
                    t.print();
                    b = false;
                }
            }
        }
        System.out.println("---------------------");
    }

    //sort by departure (if same by time)
    private void func4c(Train[] trains){
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                if (o1.getDestination().equals(o2.getDestination())){
                    return o1.getTime().compareTo(o2.getTime());
                }
                return o1.getDestination().compareTo(o2.getDestination());
            }
        });
        func4e(trains);
    }

    //print all trains
    private void func4e(Train[] trains){
        for (Train t: trains) {
            t.print();
        }
        System.out.println("-----------------------");
    }

    //create 5 trains
    private Train[] func4f(){
        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
        }
        trains[2].setDestination("Moscow");
        trains[4].setDestination("Minsk");
        return trains;
    }

    //class counter, show it work
    public void func5(){
        //default counter
        Counter counter1 = new Counter();
        //param counter
        Counter counter2 = new Counter(2, 15, 7);
        //get actual value
        System.out.println("count1 " + "value1 " + counter1.getValue());
        //increase till can
        while (counter1.canIncrease()){
            counter1.increase();
        }
        //get actual value
        System.out.println("value1 " + counter1.getValue());
        //get actual value
        System.out.println("count2 " + "value2 " + counter2.getValue());
        //decrease till can
        while (counter2.canDecrease()){
            counter2.decrease();
        }
        //get actual value
        System.out.println("value2 " + counter2.getValue());
    }

    //class time, change fully partly, set value
    public void func6(){
        //default time
        Time time = new Time();
        //print
        System.out.println(time);
        //set time
        time.setTime(16, 1, 72);
        //print
        time.print();
        //add period of time
        time.addSecond(-3670);
        //print
        time.print();
    }

    //class triangle, find area, perimeter, barycenter
    public void func7(){
        //triangle tops
        Test2 t1 = new Test2(0, 0);
        Test2 t2 = new Test2(4, 0);
        Test2 t3 = new Test2(0, 3);
        //create triangle
        Triangle triangle = new Triangle(t1, t2, t3);
        //get perimeter
        System.out.println(triangle.perimeter());
        //get area
        System.out.println(triangle.area());
        //get barycenter
        triangle.gedMid();
    }

    //class customer, [id, firstName, lastName, middleName, creditCardNum, BankAcNum]
    //get,set,toString methods; class with array customers
    //sort alphabetic order, print by cardNumber in range
    public void func8(){
        //init customer array
        CustomerList customerList = new CustomerList();
        for (int i = 0; i < 15; i++) {
            Customer c = new Customer();
            changeCustomer(c);
            customerList.addCustomer(c);
        }
        //print customers
        customerList.print();
        //sort by name
        customerList.sortByName();
        System.out.println("------------------------");
        //print sorted by name
        customerList.print();
        System.out.println("------------------------");
        //print by cardNumber in range
        customerList.showByCardInterval(0L, 9999_9999_9999_9999L);
    }

    //change default customer
    private void changeCustomer(Customer c){
        Random r = new Random();
        String[] fNames = new String[]{"Ann", "Mike", "Max"};
        String[] lNames = new String[]{"Smith", "Cold", "Hot"};
        c.setFirstName(fNames[r.nextInt(3)]);
        c.setLastName(lNames[r.nextInt(3)]);
        c.setCreditCardNumber(r.nextLong()/1000);
    }

    //class book, [id, title, author, publisher, year, pages, price, binding], get,set,toString methods
    //class book array, books by author, books by author, books released after year
    public void func9(){
        //init books
        BookList bookList = new BookList();
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            changeBook(b);
            bookList.addBook(b);
        }
        //print books
        bookList.print();
        System.out.println("------------------------");
        //print books by author
        bookList.getByAuthor("Pifagor").print();
        System.out.println("------------------------");
        //print books by publisher
        bookList.getByPublish("AfiniBook").print();
        System.out.println("------------------------");
        //print books released after year
        bookList.getAfterYear(0).print();
    }

    //change default book
    private void changeBook(Book book){
        Random r = new Random();
        String[] authors = {"Pifagor", "Arhimed", "Evklid"};
        String[] publishes = {"SamosBook", "AfiniBook", "OlimpiaBook"};
        book.setAuthor(new String[] {authors[r.nextInt(3)]});
        book.setPublish(publishes[r.nextInt(3)]);
        book.setYear(r.nextInt(1001)-500);
    }

    //class airline, [distinct, number, type, time, days], methods get,set,toString,constructor
    //class array airlines, methods, array by distinct, by day, by day after time
    public void func10(){
        //init airlines
        AirLineList list = new AirLineList();
        for (int i = 0; i < 10; i++) {
            Airline airline = new Airline();
            changeAirline(airline, i);
            list.addAirline(airline);
        }
        //print all
        list.print();
        System.out.println("--------------------------");
        //print by distinct
        list.getByDistinct("Minsk").print();
        System.out.println("--------------------------");
        //print by day
        list.getByDay("Monday").print();
        System.out.println("--------------------------");
        //print by day after time
        list.getByDayTime("Monday", new Time(12,0,0)).print();
    }

    //change default airline
    private void changeAirline(Airline airline, int i){
        Random r = new Random();
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Time[] times = {new Time(6,0,0), new Time(18,0,0)};
        String[] dist = {"Minsk", "Moscow", "Kiev"};
        airline.setDays(new String[]{days[i%7]});
        airline.setTime(times[r.nextInt(2)]);
        airline.setDistinct(dist[r.nextInt(3)]);
    }

}
