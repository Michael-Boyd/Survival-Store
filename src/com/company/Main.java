package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userSort;
        int userCartItem;
        int userCartItemQuantity;

        Scanner in = new Scanner(System.in);
        Store loadProduct = new Store();
        Wallet wallet = new Wallet();
        Cart cart = new Cart();
        Product product = new Product();


        loadProduct.productRead("SurvivalStoreTest.txt");



        System.out.println("Please enter 1 if you want all of the items");
        System.out.println("Please enter 2 if you want to sort by the category, Alphabetical ");
        System.out.println("Please enter 3 if you want to sort by the name, Alphabetical");
        System.out.println("Please enter 4 if you want to sort by the price, Lowest to Highest");
        userSort = in.nextInt();

        switch (userSort){
            case(1):
                loadProduct.printList();
                break;
            case(2):
                loadProduct.printSortedCategories();
                break;
            case(3):
                loadProduct.printSortedNames();
                break;
            case(4):
                loadProduct.printSortedPrice();
                break;



        }

        System.out.println("If you want to see how much is in your wallet type 'View Wallet");

        in.nextLine();
        String userWallet = in.nextLine();

        if (userWallet.equalsIgnoreCase("View Wallet")){
            System.out.println(wallet.amountInWallet());
        }else{
            System.out.println("I am sorry you did not input the right term");
        }


        System.out.println("List what item you want from the list, also the quantity");
        userCartItem = in.nextInt();
        userCartItemQuantity = in.nextInt();


        cart.addItemsToCart(product, userCartItemQuantity, userCartItem);


    }
}
