package com.company.classes.bank;

import java.util.Arrays;

public class BankClient {

    private String name;
    private BankAccount[] bankAccounts;

    public BankClient() {
        name = "Smith";
        bankAccounts = new BankAccount[0];
    }

    public BankClient(String name, BankAccount[] bankAccounts) {
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setBankAccName();
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
        setBankAccName();
    }

    public void addBankAcc(BankAccount ba){
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length+1);
        bankAccounts[bankAccounts.length-1] = ba;
        setBankAccName();
    }

    private void setBankAccName(){
        for (int i = 0; i < bankAccounts.length; i++) {
            bankAccounts[i].setClient(name);
        }
    }
}
