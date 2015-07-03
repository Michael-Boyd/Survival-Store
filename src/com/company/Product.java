package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by mikeboyd5 on 6/30/15.
 */
public class Product {
    private int stockCount =0;
    private String category = null;
    private String name = null;
    private double price = 0;
    private int productID =0;






    protected static Product convertList(String[] list) {
        Product artifact = new Product();

        for (int i = 0; i < list.length; i++) {

            if (i == 0) {
                artifact.category = list[i];
//                System.out.println("list = " + list[i]);

            } else if (i == 1) {
                artifact.name = list[i];
//                System.out.println("list = " + list[i]);

            } else if (i == 2) {
                artifact.price = Double.parseDouble(list[i]);
//                System.out.println("list = " + list[i]);
            } else if (i == 3) {
                artifact.stockCount = Integer.parseInt(list[i]);
//                System.out.println("list = " + list[i]);
            }


        }

        artifact.productID = createID();
        return artifact;
    }
    private static int idCounter = 1;

    public static synchronized int createID()
    {
        return idCounter++;
    }

    public int getStockCount() {
        return stockCount;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getProductID() {
        return productID;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
