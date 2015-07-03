package com.company;

import java.util.Random;

/**
 * Created by mikeboyd5 on 7/2/15.
 */
public class Wallet {
    public double amountInWallet(){
        Random random = new Random();
        double walletAmount = random.nextInt(5000 - 1000 + 1) + 1000;

        return walletAmount;
    }

    public void balance(){


    }

}
