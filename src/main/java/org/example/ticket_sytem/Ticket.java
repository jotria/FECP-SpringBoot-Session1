package org.example.ticket_sytem;

public class Ticket {
    private String ticketCode;
    private String type;
    private double price;

    public Ticket(String ticketCode, String type, double price){
        this.ticketCode = ticketCode;
        this.type = type;
        this.price = price;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void displayTicket() {
        System.out.println("Ticket Code: " + ticketCode);
        System.out.println("Category: " + type);
        System.out.println("Price: ₱" + price);
    }

}
