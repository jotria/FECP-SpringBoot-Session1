package org.example.Buildings.Shops;

import org.example.Buildings.Building;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shop implements Building {
    private String staff;
    private HashMap<String, Integer> productList;

    public Shop(String staff) {
        this.staff = staff;
        productList = new HashMap<>();

        productList.put("Plush Toy", 100);
        productList.put("Coke", 75);
        productList.put("Fries", 30);
        productList.put("Pizza", 150);
        productList.put("Water", 20);

    }

    public HashMap<String, Integer> getProductList() {
        return productList;
    }

    public void listAvailableProducts(){
        System.out.println("===Zoo Shop===");
        System.out.println("---Available Products---");
        productList.forEach((key, value)-> System.out.println("- "+ key + " | Price: " + value));
    }



    public void makePurchase() {
        Scanner input = new Scanner(System.in);
        ArrayList<String> selectedProducts = new ArrayList<>();
        int totalCost = 0;

        System.out.println("Enter the name of the products you want to purchase (type 'done' to finish):");

        while (true) {
            String productName = input.nextLine().trim();

            if (productName.equalsIgnoreCase("done")) break;

            if (productList.containsKey(productName)) {
                selectedProducts.add(productName);
                int price = productList.get(productName);
                totalCost += price;
                System.out.println(productName + " added to cart. ₱" + price);
            } else {
                System.out.println(productName + " is not available in the shop.");
            }
        }
        System.out.println("\n---Purchase Summary---");
        for (String item : selectedProducts) {
            System.out.println(item + " - ₱" + productList.get(item));
        }

        System.out.println("Total Cost: ₱" + totalCost);

        System.out.println("Proceed to checkout? (yes/no)");
        String checkoutFlag = input.nextLine();

        if (checkoutFlag.equalsIgnoreCase("yes")) {
            System.out.println("Payment successful!");
            System.out.println("\nReceipt:");
            for (String item : selectedProducts) {
                System.out.println(item + " - ₱" + productList.get(item));
            }
            System.out.println("Total Paid: ₱" + totalCost);

        }

        System.out.println("Thank you! Please come again.");
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
