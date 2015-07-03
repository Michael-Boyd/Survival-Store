package com.company;

/**
 * Created by mikeboyd5 on 7/2/15.
 */
public class User {

    Wallet wallet = new Wallet();
    public void seeWallet(){
        wallet.balance();
    }
}
