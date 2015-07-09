package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int userSort;
        int userCartItem;
        int userCartItemQuantity;
        boolean exit = false;

        Scanner in = new Scanner(System.in);
        Store loadProduct = new Store();
        Wallet wallet = new Wallet();
        Cart cart = new Cart();

        User user = new User();


        loadProduct.productRead("SurvivalStoreTest.txt");
        while (exit == false ) {

            System.out.println("Please enter 1 if you want all of the items");
            System.out.println("Please enter 2 if you want to sort by the category, Alphabetical ");
            System.out.println("Please enter 3 if you want to sort by the name, Alphabetical");
            System.out.println("Please enter 4 if you want to sort by the price, Lowest to Highest");
            System.out.println("Please enter 5 if want to see what is in your cart");
            System.out.println("Please enter 6 if want to remove item from your cart");
            System.out.println("Please enter 7 if want to see how much is in your wallet");

            System.out.println("Please enter 8 if you would like to exit the program");

            userSort = in.nextInt();

            switch (userSort) {
                case (1):
                    loadProduct.printList();
                    addRemoveItemInput(in, user);

                    cart.addItemsToCart(user);
                    System.out.println("You chose the following item");
                    cart.printItemsInCart();
                    break;
                case (2):
                    loadProduct.printSortedCategories();
                    addRemoveItemInput(in, user);

                    cart.addItemsToCart(user);
                    System.out.println("Now please type the quantity");
                    cart.printItemsInCart();
                    break;
                case (3):
                    loadProduct.printSortedNames();
                    addRemoveItemInput(in, user);

                    cart.addItemsToCart(user);
                    System.out.println("You chose the following item");
                    cart.printItemsInCart();
                    break;
                case (4):
                    loadProduct.printSortedPrice();
                    addRemoveItemInput(in, user);

                    cart.addItemsToCart(user);
                    System.out.println("You chose the following item");
                    cart.printItemsInCart();
                    break;
                case (5):

                    cart.printItemsInCart();
                    break;
                case (6):
                    System.out.println("List what item you want to remove");
                    userCartItem = in.nextInt();
                    System.out.println("Now please type the quantity");
                    userCartItemQuantity = in.nextInt();

                    user.userQuantity(userCartItemQuantity);
                    user.userItemId(userCartItem);

                    cart.removeItemsFromCart(user);
                    System.out.println("You chose the following item");
                    cart.printItemsInCart();
                    break;
                case (7):
                    System.out.println("If you want to see how much is in your wallet type 'View Wallet', otherwise type no");

                    in.nextLine();
                    String userWallet = in.nextLine();

                    if (userWallet.equalsIgnoreCase("View Wallet")) {
                        System.out.println(wallet.amountInWallet());
                    } else if (userWallet.equalsIgnoreCase("No")) {

                    } else {
                        System.out.println("I am sorry you did not input the right term");
                    }
                    break;
                case (8):
                    exit = true;
                    System.exit(0);


            }








        }

    }

    private static void addRemoveItemInput(Scanner in, User user) {
        int userCartItem;
        int userCartItemQuantity;
        System.out.println("List what item you want from the list using the user ID");
        userCartItem = in.nextInt();
        System.out.println("Now please type the quantity");
        userCartItemQuantity = in.nextInt();

        user.userQuantity(userCartItemQuantity);
        user.userItemId(userCartItem);
    }

}
