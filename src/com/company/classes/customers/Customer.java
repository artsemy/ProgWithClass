package com.company.classes.customers;

public class Customer {

    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private long creditCardNumber;
    private long bankAccountNumber;
    private String fullName;

    //constructor
    public Customer(){
        lastName = "Smith";
        firstName = "Alex";
        middleName = "Johnatan";
        address = "New York City";
        creditCardNumber = 0l;
        bankAccountNumber = 0l;
    }

    //constructor
    public Customer(int id, String lastName, String firstName, String middleName, String address, long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    //to string
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + String.format("%02d", id) +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", creditCardNumber=" + String.format("%,d",creditCardNumber) +
                ", bankAccountNumber=" + bankAccountNumber +
                '}';
    }

    //get method
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //get method
    public String getLastName() {
        return lastName;
    }

    //set method
    public void setLastName(String lastName) {
        this.lastName = lastName;
        setFullName();
    }

    //get method
    public String getFirstName() {
        return firstName;
    }

    //set method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setFullName();
    }

    //get method
    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    //set method
    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    //set method
    private void setFullName(){
        fullName = lastName + " " + firstName + " " + middleName;
    }

    //get method
    public String getFullName(){
        return fullName;
    }

}
