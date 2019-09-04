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

    void func1(){
        Test1 test1 = new Test1();
        test1.changeX1(2);
        test1.changeX2(3);
        test1.print();
        System.out.println("sum=" + test1.sum());
        System.out.println("max=" + test1.max());
    }

    void func2(){
        Test2 t1 = new Test2();
        Test2 t2 = new Test2(3, 4);
        t1.setX1(5);
        System.out.println(t1.getX1());
        System.out.println(t2.getX2());
    }

    void func3(){
        Student[] students = new Student[5];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].setMarks(new int[]{9, 9, 9, 9, i*2 + 2});
            students[i].printWithMarks(true, false, true, false, new int[]{9, 10});
        }
    }

    void func4(){
        Train[] trains = func4f();
        func4e(trains);
        func4a(trains);
        func4b(trains);
        func4c(trains);
    }

    private void func4a(Train[] trains){
        Arrays.sort(trains);
        func4e(trains);
    }

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

    private void func4e(Train[] trains){
        for (Train t: trains) {
            t.print();
        }
        System.out.println("-----------------------");
    }

    private Train[] func4f(){
        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();
        }
        trains[2].setDestination("Moscow");
        trains[4].setDestination("Minsk");
        return trains;
    }

    public void func5(){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(1, 15, 7);
        System.out.print("count1 " + counter1.getValue());
        while (counter1.canIncrease()){
            counter1.increase();
        }
        System.out.println(" " + counter1.getValue());
        System.out.print("count2 " + counter2.getValue());
        while (counter2.canDecrease()){
            counter2.decrease();
        }
        System.out.println(" " + counter2.getValue());
    }

    public void func6(){
        Time time = new Time();
        System.out.println(time);
        time.setTime(16, 1, 1);
        System.out.println(time);
        time.addSecond(-3670);
        System.out.println(time);
    }

    public void func7(){
        Test2 t1 = new Test2(0, 0);
        Test2 t2 = new Test2(4, 0);
        Test2 t3 = new Test2(0, 3);
        Triangle triangle = new Triangle(t1, t2, t3);
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
        triangle.gedMid();
    }

    public void func8(){
        CustomerList customerList = new CustomerList();
        for (int i = 0; i < 15; i++) {
            Customer c = new Customer();
            changeCustomer(c);
            customerList.addCustomer(c);
        }
        customerList.print();
        customerList.sortByName();
        System.out.println("------------------------");
        customerList.print();
        System.out.println("------------------------");
        customerList.showByCardInterval(0L, 9999_9999_9999_9999L);
    }

    private void changeCustomer(Customer c){
        Random r = new Random();
        String[] fNames = new String[]{"Ann", "Mike", "Max"};
        String[] lNames = new String[]{"Smith", "Cold", "Hot"};
        c.setFirstName(fNames[r.nextInt(3)]);
        c.setLastName(lNames[r.nextInt(3)]);
        c.setCreditCardNumber(r.nextLong()/1000);
    }

    public void func9(){
        BookList bookList = new BookList();
        for (int i = 0; i < 10; i++) {
            Book b = new Book();
            changeBook(b);
            bookList.addBook(b);
        }
        bookList.print();
        System.out.println("------------------------");
        bookList.getByAuthor("Pifagor").print();
        System.out.println("------------------------");
        bookList.getByPublish("AfiniBook").print();
        System.out.println("------------------------");
        bookList.getAfterYear(0).print();
    }

    private void changeBook(Book book){
        Random r = new Random();
        String[] authors = {"Pifagor", "Arhimed", "Evklid"};
        String[] publishes = {"SamosBook", "AfiniBook", "OlimpiaBook"};
        book.setAuthor(new String[] {authors[r.nextInt(3)]});
        book.setPublish(publishes[r.nextInt(3)]);
        book.setYear(r.nextInt(1001)-500);
    }

    public void func10(){
        AirLineList list = new AirLineList();
        for (int i = 0; i < 10; i++) {
            Airline airline = new Airline();
            changeAirline(airline, i);
            list.addAirline(airline);
        }
        list.print();
        System.out.println("--------------------------");
        list.getByDistinct("Minsk").print();
        System.out.println("--------------------------");
        list.getByDay("Monday").print();
        System.out.println("--------------------------");
        list.getByDayTime("Monday", new Time(12,0,0)).print();
    }

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
