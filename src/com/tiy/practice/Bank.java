package com.tiy.practice;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by bearden-tellez on 8/18/16.
 */
public class Bank {
    public static void main(String[]args){
        Scanner inputScanner = new Scanner (System.in);

        System.out.println("Welcome to the Bank of Monies");

        accountHashMap();
        HashMap<String, BankAccount> bankAccounts = accountHashMap();


        System.out.println(" What would you like to do with your account?");
        System.out.println("0. Exit");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Print Info");
        System.out.println("4. Transfer");
        System.out.println("5. Create a new account");

        int actionChoice = Integer.valueOf(inputScanner.nextLine());
        if (actionChoice == 1) {
            System.out.println("Enter deposit amount");
            double amount = Double.valueOf(inputScanner.nextLine());
            //myChecking.RebeccaChecking().deposit(amount);
        } else if (actionChoice == 2) {
            System.out.println("Enter withdrawal amount");
            double amount = Double.valueOf(inputScanner.nextLine());
            //myChecking.RebeccaChecking.withdraw(amount);
        } else if (actionChoice == 3) {
            //myChecking.RebeccaChecking.printInfo();
        } else if (actionChoice == 0) {

        } else if (actionChoice == 4) {
            System.out.println("How much money would you like to transfer?");
            double amountToTransfer = Double.valueOf(inputScanner.nextLine());
            System.out.println("What account would you like to transfer this money to?");
        } else if  (actionChoice == 5 ) {
            System.out.println("Creating new account please select the type of account you would like");
        }

        saveBankAccountstoFile();
    }

    private static HashMap<String,BankAccount> accountHashMap() {
        HashMap<String, BankAccount> bankAccountsByName = new HashMap<String, BankAccount>();
        //BankAccount thisBankAccount = new BankAccount(Double balance, String name);
        while (true) {
            System.out.println("Are you a new user: y/n?");
            Scanner inputScanner = new Scanner (System.in);
            String continueFlag = inputScanner.nextLine();
            if (continueFlag.equals("n")) {
                break;
            }


            System.out.println("Please press enter to create a new account");
            System.out.println("Please enter your name");
            String newUserName = inputScanner.nextLine();
            System.out.println("Please enter your initial account balance");
            double initialBalance = Double.valueOf(inputScanner.nextLine());
            System.out.println("Please choose which account you would like to make: Press 1 for Checking 2 for Savings and 3 for Retirement. \nPlease note we can only create one account at a time so please enter only one number.");
            //System.out.println("If you are creating more than one type of the same account please add a number to the end for example Checking2. ");
//          int buildNewAccount = Integer.valueOf(inputScanner.nextLine());
//
//            BankAccount newAccount = null;
//            if (buildNewAccount == 1) {
//               newAccount = new Checking(name, balance);
//           } else if (buildNewAccount == 2) {
//               newAccount = new Saving(name, balance);
//           } else if (buildNewAccount == 3) {
//               newAccount = new Retirement(name, balance);
//           }
//             //add to the map
//           bankAccountsByName.put(newAccount.getName(), newAccount);
//           bankAccountsByName.put(newAccount.this.Balance(), newAccount);
//
        }
//          return accountHashMap();     //recursion
            return bankAccountsByName;
    }


        public static void saveBankAccountstoFile() {
            try {
                File bankFile = new File("bank.txt");
                FileWriter bankWriter = new FileWriter(bankFile);
                bankWriter.write("Bank Accounts" + accountHashMap() + "\n");
                bankWriter.close();
            } catch (Exception exception) {
                System.out.println("Exception while writing to file ...");
            }
        }


}