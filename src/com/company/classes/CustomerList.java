package com.company.classes;

import java.util.Arrays;
import java.util.Comparator;

public class CustomerList {

    Customer[] customers;
    Counter counter;

    public CustomerList(Customer[] customers, Counter counter) {
        this.customers = customers;
        this.counter = counter;
    }

    public CustomerList(){
        customers = new Customer[1];
        counter = new Counter(0, Integer.MAX_VALUE, 0);
    }

    public void addCustomer(Customer c){
        if (counter.getValue() == customers.length){
            customers = Arrays.copyOf(customers, customers.length+1);
        }
        c.setId(counter.getValue());
        customers[counter.getValue()] = c;
        counter.increase();
    }

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

    public void showByCardInterval(long l1, long l2){
        for (Customer c: customers) {
            long cardNumber = c.getCreditCardNumber();
            if (cardNumber >= l1 && cardNumber <= l2){
                System.out.println(c);
            }
        }
    }

    public void print(){
        for (Customer c: customers) {
            System.out.println(c);
        }
    }
}
