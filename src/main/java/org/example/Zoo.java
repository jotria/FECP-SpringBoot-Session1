package org.example;

import org.example.People.Administrator;
import org.example.entity.Lion;

import java.util.HashMap;
import java.util.Scanner;

public class Zoo {
    Scanner scanner = new Scanner(System.in);
    private boolean isZooOpen;
    private HashMap<String, String> zooSetupList;
    Administrator adminModule;


    public Zoo(Administrator adminModule) {
        zooSetupList = new HashMap<>();
        this.isZooOpen = false;
        this.adminModule = adminModule;
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }

    public void setZooOpen(boolean zooOpen) {
        isZooOpen = zooOpen;
    }

    public HashMap<String, String> getZooSetupList() {
        return zooSetupList;
    }

    public void setZooSetupList(HashMap<String, String> zooSetupList) {
        this.zooSetupList = zooSetupList;
    }

    public void zooMenu(){
        System.out.println("What would you like to do?");
        System.out.println("1. Visit Enclosure");
        System.out.println("2. Visit Shop");
        System.out.println("3. Visit Hospital");
        System.out.println("4. Leave Zoo");

        int choice;
        do{
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            String animal;

            switch (choice){
                case 1:
                    System.out.println("===Zoo Enclosure===");
                    System.out.println("Choose Enclosure: ");
                    System.out.println("1. Pachyderm (Elephant)");
                    System.out.println("2. Feline (Lion)");
                    System.out.println("3. Bird (Owl)");

                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    if(option == 1){
                        animal = "Elephant";
                    } else if(option == 2){
                        animal = "Lion";
                    } else if (option==3) {
                        animal = "Owl";
                    } else{
                        animal = "Not in choices";
                    }

                    System.out.print("Would you like to feed " + animal +" ? (yes/no): ");
                    String willFeed = scanner.nextLine();

                    if(willFeed.equals("yes")) {
                        System.out.println(animal + " is eating.");
                        if(option == 1){
                            adminModule.getPachydermEnclosure().getAnimals().getFirst().makeSound();
                        } else if(option == 2){
                            adminModule.getFelineEnclosure().getAnimals().getFirst().makeSound();
                        } else if (option==3) {
                            adminModule.getBirdEnclosure().getAnimals().getFirst().makeSound();
                        }
                    } else{
                        break;
                    }
                    break;
                case 2:
                    adminModule.getShop().enterShop();
                    break;
                case 3:
                    adminModule.getHospital().enterHospital();
                    break;
                case 4:
                    break;
            }
        }while(choice!=4);
    }
}
