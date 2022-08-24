/*
 *Author Name: Nikita Chauhan
 *Date: 24-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class FurnitureItem {
    String furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String color;
    String furnitureUsage;
    double price;


    public FurnitureItem() {
    }

    public FurnitureItem(String furnitureCode, String furnitureType, int gradeOfFurniture, String color, String furnitureUsage, double price) {
        this.furnitureCode = "XYZ";
        this.furnitureType = "TABLE";
        this.gradeOfFurniture = 1;
        this.color = "RED";
        this.furnitureUsage = "OUTDOOR";
        this.price = 4500.00;
    }

    public double calculateDiscountForOutdoorFurniture() {
        double discountedPrice = 0.0;
        if ("OUTDOOR".equals(furnitureType)) {
            discountedPrice = price - price * 0.05;
        } else {
            discountedPrice = price;
        }
        return discountedPrice;

    }


}

