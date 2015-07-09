package com.company;

import java.util.Random;

/**
 * Created by mikeboyd5 on 7/2/15.
 */


public class Wallet {
    Product item = new Product();
  //  Cart cart = new Cart();
    Store store = new Store();
    User user = new User();
    private double balance;
    public double amountInWallet(){
        Random random = new Random();
        double walletAmount = random.nextInt(50000 - 40000 + 1) + 40000;

        return walletAmount;
    }


    public void balance(double balance){
    this.balance = balance;

    }

    public double getTotalAmount(){
        double totalSpentOnItem = user.getQuantity() * store.getPrice();
        return totalSpentOnItem;
    }

    public double currentBalance(){
        double currentTotal = amountInWallet()-getTotalAmount();
        return currentTotal;

    }

    public void printCurrentBalance(){
        System.out.println(currentBalance());
    }
    public void addFunds(){


    }

    public boolean remainingFunds() {
        if (amountInWallet() >= getTotalAmount()) {
            return true;
        } else {
            return false;
        }
    }



}
