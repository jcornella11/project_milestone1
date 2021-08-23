package com.company;

import java.util.ArrayList;

public class shoppingCart {
    //List of products currently in shopping cart
    ArrayList<Product> cartItemsList = new ArrayList<Product>();

    //Add Item to Cart
    void addItemtoCart (Product item)
    {
        cartItemsList.add(item);
    }

    //View Shopping Cart Contents
    void viewCart()
    {
        System.out.println("The items in your cart are: ");
        int counter = 0;
        for (Product item: cartItemsList)
        {
            System.out.println("Item # " + counter);
            System.out.println("Item Name:" + item.getName());
            System.out.println("Item Description: " + item.getDescription());
            System.out.println("Item Cost: " + item.getPrice());
            System.out.println("Item Quanity: " + item.getQuanity());

            counter ++;
        }
    }

    //Remove a Product from the Cart
    void removeItem (Product item)
    {
        cartItemsList.remove(item);
    }

    //Check out of Store Front
    public double checkout()
    {
        double totalcost = 0;

        for (Product item : cartItemsList)
        {
            totalcost += item.getPrice();
        }



        return  totalcost;
    }

}
