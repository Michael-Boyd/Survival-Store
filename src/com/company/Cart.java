package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mikeboyd5 on 7/2/15.
 */
public class Cart {
    List <Product> cartItems = new ArrayList<Product>();

    public void printItemsInCart(){
        for (int i = 0; i <cartItems.size() ; i++) {
            System.out.println(cartItems.get(i));

        }
    }



    public void addItemsToCart (Product item, int quantity, int index){

        cartItems.add(null);
        cartItems.add(null);1


        cartItems.add(index, item);
        cartItems.get(index).setStockCount(quantity);
    }

    public void removeItemsFromCart(){

    }

}
