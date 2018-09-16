package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;

    public Account(int startingBalance) {
        balance = startingBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void depositMoney(int depositAmount) {
        balance += depositAmount;
    }

    public void withdrawMoney(int withdrawAmount){
        if(balance > withdrawAmount) {
            balance -= withdrawAmount;
        }
    }

}
