package com.company;

import java.util.ArrayList;

public class InventoryManager {
    //Array List Used to Store Products in Inventory
    ArrayList<Product> storeInventory = new ArrayList<Product>();

    //Method to add Product to the Inventory
    void addProduct (Product item)
    {
        //Add Product to the Inventory
        storeInventory.add(item);
    }

    //Method to Remove Product from the Inventory
    void removeProduct (String productName)
    {
        Product result2 = null;
        for (Product item: storeInventory)
        {
            if (item.getName().equals(productName))
            {
                result2 = item;
            }
        }
        storeInventory.remove(result2);
    }

    //Search Method
    Product searchProduct(String productName)
    {
        Product result = null;
        for (Product item: storeInventory)
        {
            if (item.getName().equals(productName))
            {
                result = item;
            }
        }
        return result;
    }

    //View current products in Inventory
    void viewInventory()
    {
        System.out.println("The items in the store inventory are: ");
        int counter = 0;
        for (Product item: storeInventory)
        {
            System.out.println("Item # " + counter);
            System.out.println("Item Name:" + item.getName());
            System.out.println("Item Description: " + item.getDescription());
            System.out.println("Item Cost: " + item.getPrice());
            System.out.println("Item Quanity: " + item.getQuanity());

            counter ++;
        }
    }

    //Purchase a Product
    void purchaseProduct(Product item)
    {
        //Decrease Quanity of the Item
        item.setQuanity(item.getQuanity() - 1);

        //If there are no items left, remove its listing from the store
        if (item.getQuanity() == 0)
        {
            storeInventory.remove(item);
        }

    }

    //Return a Product
    void returnProduct (Product item)
    {
        //Increase item Quanity
        item.setQuanity(item.getQuanity() + 1);
    }

    //Sort by Name

    //Sort by Price

    //Admin user get and update Inventory &


}
