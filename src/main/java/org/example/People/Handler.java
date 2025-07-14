package org.example.People;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Handler extends People {
    Scanner scanner = new Scanner(System.in);
    Administrator adminModule;
    String handlerName;

    public Handler(Administrator adminModule){
        this.adminModule = adminModule;
    }

    public String getHandlerName(){
        System.out.print("\nEnter your name (Handler): ");
        handlerName = scanner.nextLine().trim();

        return handlerName;
    }

    public boolean animalHandlerCheck(){
        String pachydermHandler = adminModule.pachydermEnclosure.getStaff();
        String felineHandler = adminModule.felineEnclosure.getStaff();
        String birdHandler = adminModule.birdEnclosure.getStaff();
        String handlerName = getHandlerName();

        if((pachydermHandler != null && pachydermHandler.equals(handlerName)) ||
                (felineHandler != null && felineHandler.equals(handlerName)) ||
                (birdHandler != null && birdHandler.equals(handlerName))) {

            System.out.println("\nWelcome, Handler " + handlerName + "!");
            return true;
        } else {
            System.out.println("\nHandler not found.");
            return false;
        }
    }

    public void animalDutyMenu() {
        int animalNumber;
        String animalName;

        if (animalHandlerCheck()) {
            System.out.println("\n--- Animal Duty Menu ---");

            // Match handler to the appropriate enclosure
            if (handlerName.equals(adminModule.pachydermEnclosure.getStaff())) {
                System.out.println("\nPachyderm Enclosure Animals:");
                for (int i=0; i<adminModule.pachydermEnclosure.getAnimals().size(); i++) {
                    System.out.println((i+1) + ". " + adminModule.pachydermEnclosure.getAnimals().get(i).getName());
                }

                System.out.println("\nChoose animal number to interact with (0 to exit): ");
                animalNumber = scanner.nextInt();
                scanner.nextLine();

                animalName = adminModule.pachydermEnclosure.getAnimals().get(animalNumber-1).getName();

                handlerAction(animalName, animalNumber);

            } else if (handlerName.equals(adminModule.felineEnclosure.getStaff())) {
                System.out.println("\nFeline Enclosure Animals:");
                for (int i=0; i<adminModule.felineEnclosure.getAnimals().size(); i++) {
                    System.out.println((i+1) + ". " + adminModule.felineEnclosure.getAnimals().get(i));
                }

                System.out.println("\nChoose animal number to interact with (0 to exit): ");
                animalNumber = scanner.nextInt();
                scanner.nextLine();

                animalName = adminModule.felineEnclosure.getAnimals().get(animalNumber-1).getName();

                handlerAction(animalName, animalNumber);

            } else if (handlerName.equals(adminModule.birdEnclosure.getStaff())) {
                System.out.println("\nBird Enclosure Animals:");
                for (int i=0; i<adminModule.pachydermEnclosure.getAnimals().size(); i++) {
                    System.out.println((i+1) + ". " + adminModule.birdEnclosure.getAnimals().get(i));
                }

                System.out.print("\nChoose animal number to interact with (0 to exit): ");
                animalNumber = scanner.nextInt();
                scanner.nextLine();

                animalName = adminModule.birdEnclosure.getAnimals().get(animalNumber-1).getName();

                handlerAction(animalName, animalNumber);
            }

        }

    }

    public void handlerAction(String animalName, int animalNumber){
        if(animalNumber >0){
            System.out.println("\nChoose action: ");
            System.out.println("1. Feed " + animalName);
            System.out.println("2. Examine " + animalName);
            System.out.println("3. Exercise " + animalName);

            int choice;

            do{
                System.out.print("\nChoose an option: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        feedAnimal();
                        break;
                    case 2:
                        examineAnimal(animalName);
                        break;
                    case 3:
                        exerciseAnimal();
                        break;
                }
            } while (choice !=0);

        } else{
            System.out.println("Finished duties for the day.");
        }

    }

    public void feedAnimal(){
        System.out.println("Feeding...");
    }

    public void examineAnimal(String animalName){
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        
        System.out.println("Sending to Hospital...");
        System.out.println(animalName + "admitted at" + formattedDateTime);
    }

    public void exerciseAnimal(){
        System.out.println("Exercise...");

    }

}