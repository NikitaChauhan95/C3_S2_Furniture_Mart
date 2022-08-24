/*
 *Author Name: Nikita Chauhan
 *Date: 24-08-2022
 *Created With: IntelliJ IDEA Community Edition
 */


package com.niit.jdp;

public class FurnitureItemImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureItem = new FurnitureItem("XYZ", "Table", 1, "RED", "OUTDOOR", 4500);
        furnitureItem.calculateDiscountForOutdoorFurniture();
        furnitureItem.displayDetails();

    }

}

