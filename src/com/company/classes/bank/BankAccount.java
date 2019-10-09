package com.company.classes.bank;

public class BankAccount {

    private int number;
    private String client;
    private boolean isBlocked;
    private double balance;

    //constructor
    public BankAccount() {
        number = 0;
        client = "Empty";
        isBlocked = true;
        balance = 0;
    }

    //constructor
    public BankAccount(int number, String client, boolean isBlocked, double balance) {
        this.number = number;
        this.client = client;
        this.isBlocked = isBlocked;
        this.balance = balance;
    }

    //get method
    public int getNumber() {
        return number;
    }

    //set method
    public void setNumber(int number) {
        this.number = number;
    }

    //get method
    public String getClient() {
        return client;
    }

    //set method
    public void setClient(String client) {
        this.client = client;
    }

    //get method
    public boolean isBlocked() {
        return isBlocked;
    }

    //set method
    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    //get method
    public double getBalance() {
        return balance;
    }

    //set method
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //to string
    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", client='" + client + '\'' +
                ", isBlocked=" + isBlocked +
                ", balance=" + balance +
                '}';
    }

    //connect bank account with client
    public void uniteWithClient(BankClient bankClient){
        bankClient.addBankAcc(this);
        client = bankClient.getName();
    }

}
