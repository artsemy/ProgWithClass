package com.company.classes.bank;

import java.util.Arrays;
import java.util.Comparator;

public class Bank {

    BankAccount[] bankAccounts;
    BankClient[] bankClients;

    public Bank() {
        bankAccounts = new BankAccount[0];
        bankClients = new BankClient[0];
    }

    public Bank(BankAccount[] bankAccounts, BankClient[] bankClients) {
        this.bankAccounts = bankAccounts;
        this.bankClients = bankClients;
    }

    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public BankClient[] getBankClients() {
        return bankClients;
    }

    public void setBankClients(BankClient[] bankClients) {
        this.bankClients = bankClients;
    }

    public void addClient(BankClient bankClient){
        bankClients = Arrays.copyOf(bankClients, bankClients.length+1);
        bankClients[bankClients.length-1] = bankClient;
        addClientAcc(bankClient);
    }

    private void addClientAcc(BankClient bankClient){
        for (BankAccount ba: bankClient.getBankAccounts()) {
            addAccount(ba);
        }
    }

    public void addAccount(BankAccount bankAccount){
        bankAccounts = Arrays.copyOf(bankAccounts, bankAccounts.length+1);
        bankAccounts[bankAccounts.length-1] = bankAccount;
    }

    public BankAccount[] findByName(String name){
        for (BankClient bc: bankClients) {
            if (bc.getName().equals(name)){
                return  bc.getBankAccounts();
            }
        }
        return null;
    }

    public BankAccount findByNumber(int number){
        for (BankAccount ba: bankAccounts) {
            if (ba.getNumber() == number){
                return ba;
            }
        }
        return null;
    }

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

    public double countBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            res += ba.getBalance();
        }
        return res;
    }

    public double countPositiveBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            if (ba.getBalance() > 0) {
                res += ba.getBalance();
            }
        }
        return res;
    }

    public double countNegativeBalance(){
        double res = 0;
        for (BankAccount ba: bankAccounts) {
            if (ba.getBalance() < 0) {
                res += ba.getBalance();
            }
        }
        return res;
    }

}
