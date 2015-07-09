package com.company;

/**
 * Created by mikeboyd5 on 7/2/15.
 */
public class User {
   private int quantity;
    private int itemId;
//    Wallet wallet = new Wallet();
//    public void seeWallet(){
//        wallet.currentBalance();
//    }


    public void userQuantity(int quantity){
        this.quantity = quantity;

    }
    public void userItemId(int itemId){
        this.itemId = itemId;

    }

    public int getQuantity() {
        return quantity;
    }

    public int getItemId() {
        return itemId;
    }
}
