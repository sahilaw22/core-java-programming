/* Create a class BankAccount with attributes accountHolderName and balance. Use a constructor to initialize them and implement a method to deposit money and display the updated balance. */

import java.util.*;

class BankAccount {
    private String accountHoldername;
    private double balance;

    public BankAccount() {
        accountHoldername = "Unknown";
        balance = 0;
    }

    public BankAccount(String n, double b) {
        accountHoldername = n;
        balance = b;
    }
    void deposit(double currentbalance) {
        balance += currentbalance;
    }

    void Display() {
        System.out.println("Account Holder: " + accountHoldername);
        System.out.println("Your Current Balance: " + balance + "\n");
    }
}

public class SET2P9 {
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        b.Display();
        BankAccount b1 = new BankAccount("Satoshi",17000.09);
        b1.Display();
        b1.deposit(50.80); // new balance 17050.89
        b1.Display();

    }
}
