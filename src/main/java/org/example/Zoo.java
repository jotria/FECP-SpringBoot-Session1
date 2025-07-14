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

            int animalNumber = 1;
            String animalName = "";

            switch (choice){
                case 1:
                    System.out.println("===Zoo Enclosure===");
                    System.out.println("Choose Enclosure: ");
                    System.out.println("1. Pachyderm");
                    System.out.println("2. Feline");
                    System.out.println("3. Bird");

                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();
                    scanner.nextLine();

                    if(option == 1){
                        System.out.println("\nPachyderm Enclosure Animals:");
                        for (int i=0; i<adminModule.getPachydermEnclosure().getAnimals().size(); i++) {
                            System.out.println((i+1) + ". " + adminModule.getPachydermEnclosure().getAnimals().get(i).getName());
                        }

                        System.out.print("\nChoose animal number to interact with (0 to exit): ");
                        animalNumber = scanner.nextInt();
                        scanner.nextLine();

                        animalName = adminModule.getPachydermEnclosure().getAnimals().get(animalNumber-1).getName();

                    } else if(option == 2){
                        System.out.println("\nFeline Enclosure Animals:");
                        for (int i=0; i<adminModule.getFelineEnclosure().getAnimals().size(); i++) {
                            System.out.println((i+1) + ". " + adminModule.getFelineEnclosure().getAnimals().get(i).getName());
                        }

                        System.out.print("\nChoose animal number to interact with (0 to exit): ");
                        animalNumber = scanner.nextInt();
                        scanner.nextLine();

                        animalName = adminModule.getFelineEnclosure().getAnimals().get(animalNumber-1).getName();

                    } else if (option==3) {
                        System.out.println("\nBird Enclosure Animals:");
                        for (int i=0; i<adminModule.getBirdEnclosure().getAnimals().size(); i++) {
                            System.out.println((i+1) + ". " + adminModule.getBirdEnclosure().getAnimals().get(i).getName());
                        }

                        System.out.print("\nChoose animal number to interact with (0 to exit): ");
                        animalNumber = scanner.nextInt();
                        scanner.nextLine();

                        animalName = adminModule.getBirdEnclosure().getAnimals().get(animalNumber-1).getName();
                    } else{
                        animalName = "Not in choices";
                    }

                    System.out.print("Would you like to feed " + animalName +" ? (yes/no): ");
                    String willFeed = scanner.nextLine();

                    if(willFeed.equals("yes")) {
                        System.out.println(animalName + " is eating.");
                        if(option == 1){
                            adminModule.getPachydermEnclosure().getAnimals().get(animalNumber-1).makeSound();
                        } else if(option == 2){
                            adminModule.getFelineEnclosure().getAnimals().get(animalNumber-1).makeSound();
                        } else if (option==3) {
                            adminModule.getBirdEnclosure().getAnimals().get(animalNumber-1).makeSound();
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
