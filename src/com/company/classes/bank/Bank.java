package com.company.classes.bank;

import java.util.Arrays;
import java.util.Comparator;

public class Bank {

    BankAccount[] bankAccounts;
    BankClient[] bankClients;

    //constructor
    public Bank() {
        bankAccounts = new BankAccount[0];
        bankClients = new BankClient[0];
    }

    //constructor
    public Bank(BankAccount[] bankAccounts, BankClient[] bankClients) {
        this.bankAccounts = bankAccounts;
        this.bankClients = bankClients;
    }

    //get method
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    //set method
    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    //get method
    public BankClient[] getBankClients() {
        return bankClients;
    }

    //set method
    public void setBankClients(BankClient[] bankClients) {
        this.bankClients = bankClients;
    }

    //add client
    public void addClient(BankClient bankClient){
        bankClients = Arrays.copyOf(bankClients, bankClients.length+1);
        bankClients[bankClients.length-1] = bankClient;
        addClientAcc(bankClient);
    }

    //add clientAcc
    private void addClientAcc(BankClient bankClient){
        for (BankAccount ba: bankClient.getBankAccounts()) {
            addAccount(ba);
        }
    }

    //add bankAcc
    public void addAccount(BankAccount bankAccount){
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length+1);
        bankAccounts[bankAccounts.length-1] = bankAccount;
    }

    //find by name
    public BankAccount[] findByName(String name){
        for (BankClient bc: bankClients) {
            if (bc.getName().equals(name)){
                return  bc.getBankAccounts();
            }
        }
        return null;
    }

    //find by number
    public BankAccount findByNumber(int number){
        for (BankAccount ba: bankAccounts) {
            if (ba.getNumber() == number){
                return ba;
            }
        }
        return null;
    }

    //sort by balance
    public void sortByBalance(){
        Arrays.sort(bankAccounts, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount o1, BankAccount o2) {
                double d1 = o1.getBalance();
                double d2 = o2.getBalance();
                return Double.compare(d1, d2);
            }
        });
    }

    //count balance
    public double countBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            res += ba.getBalance();
        }
        return res;
    }

    //count positive balance
    public double countPositiveBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            if (ba.getBalance() > 0) {
                res += ba.getBalance();
            }
        }
        return res;
    }

    //count negative balance
    public double countNegativeBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            if (ba.getBalance() < 0) {
                res += ba.getBalance();
            }
        }
        return res;
    }

    //print bankAcc
    public void printAcc(){
        for (BankAccount b: bankAccounts) {
            System.out.println(b);
        }
    }

}
