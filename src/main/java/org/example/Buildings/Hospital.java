package org.example.Buildings;

import org.example.entity.Animal;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Hospital implements Building{
    private String staff;
    private ArrayList<Animal> listOfSickAnimals;
    private HashMap<String, Date> listOfHealedAnimals;
    public Hospital(String staff) {
        this.staff = staff;
        listOfSickAnimals = new ArrayList<>();
        listOfHealedAnimals = new HashMap<>();
    }

    public void viewSickAnimals(){
        listOfSickAnimals.forEach((animal)-> System.out.println("1. " + animal));

    }

    public void viewHealedAnimals(){
        listOfHealedAnimals.forEach((key, value)-> System.out.println("Animal name: "+ key + " | Date Healed: " + value));


    }

    public void addSickAnimal (Animal animal){
        listOfSickAnimals.add(animal);
    }

    public void addHealedAnimal(Animal animal){

        listOfHealedAnimals.remove(animal);
    }

    public void removeSickAnimal (Animal animal){
        listOfSickAnimals.remove(animal);
    }

    public void removeHealedAnimal (Animal animal){
        listOfHealedAnimals.remove(animal);
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
