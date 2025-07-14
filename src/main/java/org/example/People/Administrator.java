package org.example.People;

import org.example.Buildings.Enclosures.BirdEnclosure;
import org.example.Buildings.Enclosures.FelineEnclosure;
import org.example.Buildings.Enclosures.PachydermEnclosure;
import org.example.Buildings.Hospital;
import org.example.Buildings.Shops.TicketShop;
import org.example.Zoo;

import java.util.HashMap;
import java.util.Scanner;

public class Administrator extends People{
    Scanner scanner = new Scanner(System.in);
    Zoo zoo = new Zoo(this);
    HashMap<String, String> zooSetupList = zoo.getZooSetupList();
    PachydermEnclosure pachydermEnclosure;
    FelineEnclosure felineEnclosure;
    BirdEnclosure birdEnclosure;
    Hospital hospital;
    TicketShop ticketShop;

    public boolean setup() {
        System.out.println("\n--- Zoo Setup ---");

        System.out.print("Enter your name, Manager: ");
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

        System.out.print("Enter Vendor for the Shop: ");
        String shopVendor = scanner.nextLine();
        zooSetupList.put("Shop Vendor", shopVendor);

        zoo.setZooOpen(true);

        pachydermEnclosure = new PachydermEnclosure(zooSetupList.get("Pachyderm Handler"));
        felineEnclosure = new FelineEnclosure(zooSetupList.get("Feline Handler"));
        birdEnclosure = new BirdEnclosure(zooSetupList.get("Bird Handler"));

        hospital = new Hospital(vetName);
        hospital.addSickAnimal(birdEnclosure.getAnimals().getFirst());
        hospital.addSickAnimal(felineEnclosure.getAnimals().getFirst());

        ticketShop = new TicketShop();

        System.out.println("Zoo staff setup complete.");

        return true;
    }

    public HashMap<String, String> getZooSetupList() {
        return zooSetupList;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public TicketShop getTicketShop() {
        return ticketShop;
    }

    public PachydermEnclosure getPachydermEnclosure() {
        return pachydermEnclosure;
    }

    public FelineEnclosure getFelineEnclosure() {
        return felineEnclosure;
    }

    public BirdEnclosure getBirdEnclosure() {
        return birdEnclosure;
    }

    public Zoo getZoo() {
        return zoo;
    }
}