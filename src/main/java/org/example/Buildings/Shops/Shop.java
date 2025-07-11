package org.example.Buildings.Shops;

import org.example.Buildings.Building;

import java.util.HashMap;

public class Shop implements Building {
    private String staff;
    private HashMap<String, Integer> productList;

    public Shop(String staff) {
        this.staff = staff;
        productList = new HashMap<>();
    }

    public HashMap<String, Integer> getProductList() {
        return productList;
    }

    public void listAvailableProducts(){
        productList.forEach((key, value)-> System.out.print("1. "+ key + " | Price: " + value));
    }

    @Override
    public String getStaff() {
        return staff;
    }

    @Override
    public void setStaff(String staff) {
        this.staff = staff;
    }

}
