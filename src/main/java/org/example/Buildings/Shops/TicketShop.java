package org.example.Buildings.Shops;

import org.example.Buildings.Building;
import org.example.ticket_sytem.Ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class TicketShop implements Building {

    String staff;
    ArrayList<String> validTickets = new ArrayList<>();

    private static int ticketCounter = 1000;
    Scanner scanner = new Scanner(System.in);

    public Ticket buyTicket(){

        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        String type;
        double price;

        if (age <= 5) {
            type = "Child";
            price = 0.00;
        } else if (age <= 17) {
            type = "Student";
            price = 75.00;
        } else if (age <= 59) {
            type = "Adult";
            price = 150.00;
        } else {
            type = "Senior";
            price = 50.00;
        }

        String code = "ZOO-" + (ticketCounter++);
        Ticket ticket = new Ticket(code, type, price);

        System.out.println("\nYou are qualified for a " + type + " ticket.");
        System.out.println("Ticket Price: ₱" + price);

        System.out.print("\nWould you like to proceed with your purchase(yes/no): ");
        String purchaseTicket = scanner.next();
        if(purchaseTicket.equalsIgnoreCase("yes")){
            return ticket;
        }
        else{
            return null;
        }
    }

    public boolean enter(){
        boolean isValidTicket = false;
        while(!isValidTicket){
            System.out.println("== Welcome to the Zoo Ticket Shop ==");
            System.out.println("Here's what you can experience at the zoo:");
            System.out.println("- Visit animal enclosures (Elephant, Lion, Owl)");
            System.out.println("- Buy snacks and drinks from our shops");
            System.out.println("- Listen to science lectures at the hospital");
            System.out.println("- Buy fun gifts at our gift shop");

            System.out.print("\nWould you like to buy a ticket(yes/no): ");
            String buyTicket = scanner.next();

            //Buy Ticket
            if(buyTicket.equalsIgnoreCase("yes")){

                Ticket customerTicket = buyTicket();

                if (customerTicket != null){
                    System.out.println("\nTicket Purchased!");
                    System.out.println("Your ticket code is " + customerTicket.getTicketCode());
                    validTickets.add(customerTicket.getTicketCode());
                    System.out.println("[Ticket added to the system]\n");

                }
            }

            // if not buying ticket
            System.out.println("== Visitor Entry ==");
            System.out.print("Enter your Ticket Code: ");
            String visitorTicketCode = scanner.next();
            if(validTickets.contains(visitorTicketCode)){
                isValidTicket = true;
                System.out.println("Succesfully entered Zoo!");
            }
            else{
                System.out.println("Not a valid ticket!\n");
            }
        }
        return isValidTicket;
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
