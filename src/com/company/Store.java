package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by mikeboyd5 on 6/30/15.
 */
public class Store {
    private String line = null;
    private String[] lineArray;
    ArrayList<Product> itemizedList = new ArrayList();



    public void productRead(String fileName) {


        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader =
                    new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {


                line = line.replaceAll("\\$", "");
                lineArray = line.split(",");


                itemizedList.add(Product.convertList(lineArray));


            }

//            printDisplay(itemizedList);

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        } catch (IOException ex) {
            System.out.println(
                    "Error reading file '"
                            + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

    }


    public void printList(){

        printDisplay(itemizedList);

    }

    public void printSortedCategories(){

        Collections.sort(itemizedList,new CategoryComparator());
        printDisplay(itemizedList);


    }
    public void printSortedNames(){
        Collections.sort(itemizedList, new NameComparator());
        printDisplay(itemizedList);

    }
    public void printSortedPrice(){
        Collections.sort(itemizedList, new PriceComparator());
        printDisplay(itemizedList);

    }
    public void printDisplay(ArrayList<Product> itemizedList) {
        StringBuilder builder = new StringBuilder();
        System.out.println("CATEGORY" + "\t\t\t\t\t\t\t" + "NAME" + "\t\t\t\t\t\t\t" + "PRICE" + "\t\t\t\t\t\t\t" + "UNIT COUNT" + "\t\t\t\t\t\t\t"+ "PRODUCT ID" + "\t\t\t\t\t\t\t");
        int index = 1;

        for (int i = 0; i < itemizedList.size(); i++) {
            builder.append(index);
            builder.append("\t");
            builder.append(itemizedList.get(i).getCategory());
            builder.append("\t");
            builder.append(itemizedList.get(i).getName());
            builder.append("\t");
            builder.append(itemizedList.get(i).getPrice());
            builder.append("\t");
            builder.append(itemizedList.get(i).getStockCount());
            builder.append("\t");
            builder.append(itemizedList.get(i).getProductID());
            builder.append("\n");

            index++;
        }

        System.out.printf(builder.toString());

    }



    class NameComparator implements Comparator<Product> {

        @Override
        public int compare(Product o1, Product o2) {
            return (o1.getName().compareToIgnoreCase(o2.getName()));


        }
    }
    class CategoryComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            return (o1.getCategory().compareToIgnoreCase(o2.getCategory()));
        }
    }
    class PriceComparator implements Comparator<Product>{

        @Override
        public int compare(Product o1, Product o2) {
            if(o1.getPrice() > o2.getPrice()){
                return 1;
            }
            return -1;
        }
    }
}
