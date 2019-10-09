package com.company.classes.customers;

import com.company.classes.Counter;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerList {

    Customer[] customers;
    Counter counter;

    //constructor
    public CustomerList(Customer[] customers, Counter counter) {
        this.customers = customers;
        this.counter = counter;
    }

    //constructor
    public CustomerList(){
        customers = new Customer[1];
        counter = new Counter(0, Integer.MAX_VALUE, 0);
    }

    //add customer to array
    public void addCustomer(Customer c){
        if (counter.getValue() == customers.length){
            customers = Arrays.copyOf(customers, customers.length+1);
        }
        c.setId(counter.getValue());
        customers[counter.getValue()] = c;
        counter.increase();
    }

    //sort by name
    public void sortByName(){
        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                String s1 = o1.getFullName();
                String s2 = o2.getFullName();
                return s1.compareTo(s2);
            }
        });
    }

    //print by card interval
    public void showByCardInterval(long l1, long l2){
        for (Customer c: customers) {
            long cardNumber = c.getCreditCardNumber();
            if (cardNumber >= l1 && cardNumber <= l2){
                System.out.println(c);
            }
        }
    }

    //print customer
    public void print(){
        for (Customer c: customers) {
            System.out.println(c);
        }
    }

}
