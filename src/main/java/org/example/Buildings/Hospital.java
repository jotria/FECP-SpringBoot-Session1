package org.example.Buildings;

import org.example.entity.Animal;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.time.LocalDate;
import java.util.Scanner;

public class Hospital implements Building{
    private String staff;
    private ArrayList<Animal> listOfSickAnimals;
    private HashMap<Animal, LocalDate> listOfHealedAnimals;


    public Hospital(String staff) {
        this.staff = staff;
        listOfSickAnimals = new ArrayList<>();
        listOfHealedAnimals = new HashMap<>();
    }

    public void enterHospital(){
        Scanner input = new Scanner(System.in);
        int choice;

        do{

            System.out.println("-----Zoo Hospital Monitor-----");
            System.out.println("1. View sick animals.");
            System.out.println("2. View healed animals.");
            System.out.println("3. Attend Science Lecture");
            System.out.println("4. Heal Animals");
            System.out.println("5. Exit");
            System.out.print("Option: ");

            choice = input.nextInt();
            switch (choice){
                case 1:
                    viewSickAnimals();
                    break;
                case 2:
                    viewHealedAnimals();
                    break;
                case 3:
                    attendScienceLecture();
                    break;
                case 4:
                    healAllSickAnimals();
                    break;
            }

        }while(choice != 5);
        System.out.println("Exiting Zoo Vet Hospital. Goodbye!");

    }

    public void viewSickAnimals(){
        System.out.println("Sick animals currently in Hospital: ");
        listOfSickAnimals.forEach((animal)-> System.out.println("- " + animal.getName()));

    }

    public void viewHealedAnimals(){
        System.out.println("HEALED ANIMALS: ");
        listOfHealedAnimals.forEach((key, value)-> System.out.println(key.getName() + " has been healed and returned to the enclosure! | Date Healed: " + value));
    }

    public void addSickAnimal (Animal animal){
        listOfSickAnimals.add(animal);
    }

    public void addHealedAnimal(Animal animal){

        listOfHealedAnimals.put(animal, LocalDate.now());
    }

    public void removeSickAnimal (Animal animal){
        listOfSickAnimals.remove(animal);
    }

    public void healAllSickAnimals(){
        ArrayList<Animal> toHeal = new ArrayList<>(listOfSickAnimals);

        for(Animal animal : toHeal){
            addHealedAnimal(animal);
            listOfHealedAnimals.put(animal,LocalDate.now());
        }

        viewHealedAnimals();
    }

    public void attendScienceLecture(){
        System.out.println(staff + " gives a science lecture. Wow!");
    }

    @Override
    public String getStaff() {
        return this.staff;
    }

    @Override
    public void setStaff(String staff) {
        this.staff = staff;
    }
}
