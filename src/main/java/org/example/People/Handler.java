package org.example.People;

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

    public int animalDutyMenu() {
        if (animalHandlerCheck()) {
            System.out.println("\n--- Animal Duty Menu ---");

            // Match handler to the appropriate enclosure
            if (handlerName.equals(adminModule.pachydermEnclosure.getStaff())) {
                System.out.println("Pachyderm Enclosure Animals:");
                for (int i=0; i<adminModule.pachydermEnclosure.getAnimals().size(); i++) {
                    System.out.println(i+1 + adminModule.pachydermEnclosure.getAnimals().get(i));
                }
                return adminModule.pachydermEnclosure.getAnimals().size();
            } else if (handlerName.equals(adminModule.felineEnclosure.getStaff())) {
                System.out.println("Feline Enclosure Animals:");
                for (int i=0; i<adminModule.felineEnclosure.getAnimals().size(); i++) {
                    System.out.println(i+1 + adminModule.felineEnclosure.getAnimals().get(i));
                }
                return adminModule.felineEnclosure.getAnimals().size();
            } else if (handlerName.equals(adminModule.birdEnclosure.getStaff())) {
                System.out.println("Bird Enclosure Animals:");
                for (int i=0; i<adminModule.pachydermEnclosure.getAnimals().size(); i++) {
                    System.out.println(i+1 + adminModule.birdEnclosure.getAnimals().get(i));
                }
                return adminModule.birdEnclosure.getAnimals().size();
            }
            System.out.println("No matching enclosure found for handler: " + handlerName);
            return 0;
        }
        System.out.println("Handler check failed.");
        return 0;
    }

    public void handlerAction(){
        System.out.println("Choose animal number to interact with (0 to exit): ");
        int animalNumber = scanner.nextInt();
        scanner.nextLine();

        if(animalDutyMenu()>animalNumber && animalNumber >0){
            System.out.println("Choose action: ");
            System.out.println("1. Feed" + adminModule.pachydermEnclosure.getAnimals().get(animalNumber-1));
            System.out.println("2. Examine" + adminModule.pachydermEnclosure.getAnimals().get(animalNumber-1));
            System.out.println("3. Exercise" + adminModule.pachydermEnclosure.getAnimals().get(animalNumber-1));

            int choice;

            do{
                System.out.print("Choose an option: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice){
                    case 1:
                        feedAnimal();
                        break;
                    case 2:
                        examineAnimal();
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

    public void examineAnimal(){
        System.out.println("Sending to Hospital...");

    }

    public void exerciseAnimal(){
        System.out.println("Exercise...");

    }

}