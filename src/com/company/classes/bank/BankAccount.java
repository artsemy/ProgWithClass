package com.company.classes.bank;

public class BankAccount {

    private int number;
    private String client;
    private boolean isBlocked;
    private double balance;

    public BankAccount() {
        number = 0;
        client = "Empty";
        isBlocked = true;
        balance = 0;
    }

    public BankAccount(int number, String client, boolean isBlocked, double balance) {
        this.number = number;
        this.client = client;
        this.isBlocked = isBlocked;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", client='" + client + '\'' +
                ", isBlocked=" + isBlocked +
                ", balance=" + balance +
                '}';
    }

    public void uniteWithClient(BankClient bankClient){
        bankClient.addBankAcc(this);
        client = bankClient.getName();
    }
}
