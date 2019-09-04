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

    public Customer(){
        lastName = "Smith";
        firstName = "Alex";
        middleName = "Johnatan";
        address = "New York City";
        creditCardNumber = 0l;
        bankAccountNumber = 0l;
    }

    public Customer(int id, String lastName, String firstName, String middleName, String address, long creditCardNumber, long bankAccountNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        setFullName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        setFullName();
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
        setFullName();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    private void setFullName(){
        fullName = lastName + " " + firstName + " " + middleName;
    }

    public String getFullName(){
        return fullName;
    }

}
