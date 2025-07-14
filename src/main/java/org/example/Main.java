package org.example;

import org.example.People.Administrator;
import org.example.People.Handler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Administrator adminModule = new Administrator();
        Handler handler = new Handler(adminModule);
        boolean isZooOpen = false;
        boolean isZooSetupCompleted = false;

        boolean isLoggedIn = false;
        int choice;
        System.out.println("=== Welcome to the Zoo Admin Console ===\n");
        System.out.println("Please log in.");

        while (!isLoggedIn) {
            System.out.print("Enter username: ");
            String adminUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String adminPassword = scanner.nextLine();

            if (adminUsername.equals("admin") && adminPassword.equals("adminadmin")) {
                System.out.println("\nLogin successful. Welcome!");
                isLoggedIn = true;
            } else {
                System.out.println("\nIncorrect username or password. Please try again.");
            }
        }

        do{
            System.out.println("\n==========🐯 ZOO ADMIN MAIN MENU 🐯==========");
            System.out.println("1. Setup Zoo Staff");
            System.out.println("2. Access Handler Module");
            System.out.println("3. Open Zoo to Visitors");
            System.out.println("4. Close Zoo to Visitors");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    if (!isZooSetupCompleted) {
                        isZooOpen = adminModule.setup();
                        if (isZooOpen) {
                            System.out.println("Zoo setup has been completed.");
                            isZooSetupCompleted = true;
                        } else {
                            System.out.println("Zoo setup failed.");
                        }
                    } else {
                        System.out.println("Zoo setup has already been completed and cannot be done again.");
                    }
                    break;
                case 2:
                    handler.animalDutyMenu();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while(choice != 5);
      
    }
}