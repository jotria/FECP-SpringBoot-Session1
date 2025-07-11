package org.example.People;

import java.util.Scanner;

public class HandlerModule {
    Scanner scanner = new Scanner(System.in);
    AdministratorModule adminModule;
    String handlerName;

    public HandlerModule(AdministratorModule adminModule){
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
        if (animalHandlerCheck()) {
            System.out.println("\n--- Animal Duty Menu ---");

            // Match handler to the appropriate enclosure
            if (handlerName.equals(adminModule.pachydermEnclosure.getStaff())) {
                System.out.println("Pachyderm Enclosure Animals:");
                for (String animal : adminModule.pachydermEnclosure.getAnimals()) {
                    System.out.println("- " + animal);
                }
            } else if (handlerName.equals(adminModule.felineEnclosure.getStaff())) {
                System.out.println("Feline Enclosure Animals:");
                for (String animal : adminModule.felineEnclosure.getAnimals()) {
                    System.out.println("- " + animal);
                }
            } else if (handlerName.equals(adminModule.birdEnclosure.getStaff())) {
                System.out.println("Bird Enclosure Animals:");
                for (String animal : adminModule.birdEnclosure.getAnimals()) {
                    System.out.println("- " + animal);
                }
            }
        }
    }

}