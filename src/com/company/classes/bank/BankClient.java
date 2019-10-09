package com.company.classes.bank;

import java.util.Arrays;

public class BankClient {

    private String name;
    private BankAccount[] bankAccounts;

    //constructor
    public BankClient() {
        name = "Smith";
        bankAccounts = new BankAccount[0];
    }

    //constructor
    public BankClient(String name, BankAccount[] bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    //get method
    public String getName() {
        return name;
    }

    //set method
    public void setName(String name) {
        this.name = name;
        setBankAccName();
    }

    //get method
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    //set method
    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
        setBankAccName();
    }

    //add bankAcc
    public void addBankAcc(BankAccount ba){
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length+1);
        bankAccounts[bankAccounts.length-1] = ba;
        setBankAccName();
    }

    //set name to bankAcc
    private void setBankAccName(){
        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].setClient(name);
        }
    }

}
