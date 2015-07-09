package com.company;

import java.util.ArrayList;

/**
 * Created by mikeboyd5 on 7/2/15.
 */
public class Cart {
    ArrayList<Product> cartItems = new ArrayList<>();











    public void addItemsToCart (User user) {
        Product item = new Product();
        int itemID = user.getItemId();
        item = Store.getItemizedList().get(user.getItemId()-1);
        Product itemInCart = Product.getCopy(item);


      if (user.getItemId() <= Store.getItemizedList().size()) {
            cartItems.add(itemInCart);
        }else{
          System.out.println("I am sorry, that item does not exist in the inventory");
      }
        if (user.getQuantity() <= item.getStockCount()) {
            itemInCart.setStockCount(user.getQuantity());
        }else{
            System.out.println("I am sorry, that is more than the amount");
        }


        user.userItemId(0);
        user.userQuantity(0);

//        return quantity * itemInCart.getPrice();




        }
    public void printItemsInCart(){
        StringBuilder builder = new StringBuilder();
        int size = cartItems.size();
        if(size > 0) {
            for (int i = 0; i < size; i++) {

                builder.append("\t");
                builder.append(cartItems.get(i).getCategory());
                builder.append("\t");
                builder.append(cartItems.get(i).getName());
                builder.append("\t");
                builder.append(cartItems.get(i).getPrice());
                builder.append("\t");
                builder.append(cartItems.get(i).getStockCount());
                builder.append("\t");
                builder.append(cartItems.get(i).getProductID());
                builder.append("\n");


            }

            System.out.printf(builder.toString());
        }else{
            System.out.println("You currently do no have any items in your cart!");
        }

    }









    public void removeItemsFromCart(User user){


        for (Product item: cartItems){
            if(item.getProductID() == user.getItemId()){
                Product itemToRemove = Product.getCopy(item);
                if(user.getQuantity() < item.getStockCount()) {
                    item.setStockCount(item.getStockCount() - user.getQuantity());
                }else if(user.getQuantity() == item.getStockCount()){
                    cartItems.remove(item);
                    System.out.println("That item is now removed");
                }
                else{
                    System.out.println("You asked to remove more than the amount in your cart. We went ahead and removed all of it");
                    cartItems.remove(item);

                }
                break;
            }

        }
    }

}
