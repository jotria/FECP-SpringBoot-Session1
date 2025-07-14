package org.example.Buildings;

import org.example.entity.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.time.LocalDate;

public class Hospital implements Building{
    private String staff;
    private ArrayList<Animal> listOfSickAnimals;
    private HashMap<Animal, LocalDate> listOfHealedAnimals;


    public Hospital(String staff) {
        this.staff = staff;
        listOfSickAnimals = new ArrayList<>();
        listOfHealedAnimals = new HashMap<>();
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
        listOfSickAnimals.forEach(this::addHealedAnimal);
        listOfSickAnimals.forEach(this::removeSickAnimal);
        viewHealedAnimals();
    }

    public void attendScienceLecture(){
        System.out.println(staff + " gives a science lecture. Wow!");
    }

    public void exitHospital(){
        System.out.println("Exiting Zoo Vet Hospital. Goodbye!");
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
