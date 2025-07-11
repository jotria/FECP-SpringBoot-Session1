package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class AdministratorModule {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> zooSetupList = new HashMap<>();

    public String setup(){
        System.out.println("\n--- Zoo Setup ---");

        System.out.print("\nEnter your name, Manager: ");
        String managerName = scanner.nextLine();
        zooSetupList.put("Manager Name", managerName);

        System.out.print("Enter the Veterinarian's name: ");
        String vetName = scanner.nextLine();
        zooSetupList.put("Veterinarian Name", vetName);

        System.out.print("Enter Handler for Pachyderm Enclosure: ");
        String pachydermHandler = scanner.nextLine();
        zooSetupList.put("Pachyderm Handler", pachydermHandler);

        System.out.print("Enter Handler for Feline Enclosure: ");
        String felineHandler = scanner.nextLine();
        zooSetupList.put("Feline Handler", felineHandler);

        System.out.print("Enter Handler for Bird Enclosure: ");
        String birdHandler = scanner.nextLine();
        zooSetupList.put("Bird Handler", birdHandler);

        System.out.print("Enter Vendor for Ticket Shop: ");
        String ticketVendor = scanner.nextLine();
        zooSetupList.put("Ticket Vendor", ticketVendor);

        System.out.print("Enter vendor for the Shop: ");
        String shopVendor = scanner.nextLine();
        zooSetupList.put("Shop Vendor", shopVendor);

        return "Zoo staff setup complete.";
    }
}
