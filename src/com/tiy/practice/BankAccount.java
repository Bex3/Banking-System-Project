package com.tiy.practice;

/**
 * Created by bearden-tellez on 8/18/16.
 */
public class BankAccount {
    //private String userName;
    private double balance = 0;
    //double balance = 0;
    private String name = null;
    //String name = null;

    public BankAccount(String name, double balance) {

        //super(name, balance);
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amountToDeposit) {
        balance += amountToDeposit;
        return balance;
    }

    public double withdraw(double amountToWithdraw) {
        balance -= amountToWithdraw;
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
