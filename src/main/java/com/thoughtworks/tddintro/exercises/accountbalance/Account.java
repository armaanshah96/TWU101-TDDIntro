package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int n) {
        balance = n;
    }

    public int getBalance() {
        return balance;
    }

    public void depositMoney(int n) {
        balance += n;
    }

    

}
