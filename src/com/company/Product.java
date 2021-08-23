package com.company;

public class Product {
    private String name;
    private String description;
    private double price;
    private int quanity;

    public Product(String name, String description, double price, int quanity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quanity = quanity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
}
