package com.company;

import java.util.Scanner;

public class StoreFront {

    //Create a scanner
    static Scanner sc = new Scanner(System.in);

    //Create Inventory Manager Class
    static InventoryManager inventoryTracker = new InventoryManager();

    //Create the Shopping Cart
    static shoppingCart mycart = new shoppingCart();


    public static void main(String[] args) {

        //Add Example Items to the Store Inventory
        Product computer = new Product("Macbook", "16gb of ram, 250gb hard drive"
                , 2000, 2);
        inventoryTracker.addProduct(computer);

        Product headphones = new Product("Beats", "Wireless Headphones"
                , 200, 3);

        inventoryTracker.addProduct(headphones);

        Product iPad = new Product("iPad", "32gb flash memory"
                , 500, 4);

        inventoryTracker.addProduct(iPad);

        System.out.println("Welcome to the store. Please choose an option: ");

        int action = chooseAction();

        while (action !=0)
        {
            switch (action)
            {
                //ADMIN: Add Item to Store Inventory
                case 1:
                    System.out.println("Welcome Store Owner. You have chosen to add an item to the store");
                    System.out.println("What is the product name");
                    String name = sc.next();
                    System.out.println("What is the product description");
                    String description = sc.next();
                    System.out.println("What is the product price");
                    double price = sc.nextDouble();
                    System.out.println("How many of the product are there");
                    int quanity = sc.nextInt();

                    //Create a Product
                    Product myProduct = new Product(name, description, price, quanity);

                    //Add product to Inventory Manager
                    inventoryTracker.addProduct(myProduct);

                    break;

                //ADMIN: Remove Item from Store Inventory
                case 2:
                    System.out.println("What is the name of the item you want to remove?");
                    String itemName = sc.next();
                    inventoryTracker.removeProduct(itemName);

                    break;

                    //(3) add item to cart
                case 3:
                    System.out.println("What is the name of the item you want to add to your cart?");
                    String itemName2 = sc.next();
                    Product result = inventoryTracker.searchProduct(itemName2);
                    mycart.addItemtoCart(result);

                    break;

                    //Remove item from cart
                case 4:
                    System.out.println("What is the name of the item you want to remove from your cart?");
                    String itemName3 = sc.next();
                    Product result2 = inventoryTracker.searchProduct(itemName3);
                    mycart.removeItem(result2);

                    break;

                    //View Store Inventory
                case 5:
                    inventoryTracker.viewInventory();

                    break;

                    //View Cart Inventory
                case 6:
                    mycart.viewCart();

                    break;

                    //Checkout
                case 7:
                    double cost = mycart.checkout();
                    System.out.println("The total cost of the items in the cart is: " + cost);
                    break;
            }
            action = chooseAction();
        }

    }

        static public int chooseAction()
        {
            int choice = 0;
            System.out.println("Choose an action (0) quit, (1) ADMIN: Add Item to Store Inventory (2) ADMIN: Remove Item from Store Inventory (3) add item to cart (4) Remove Item from cart (5) View Store Inventory (6)View Cart (7) Checkout");
            choice = sc.nextInt();
            return choice;
        }

        static public void printStoreInventory()
        {
            inventoryTracker.viewInventory();
        }

        static public void printShoppingCart()
        {
            mycart.viewCart();
        }





}
