package org.example.Buildings.Enclosures;

import org.example.Buildings.Building;
import org.example.entity.Animal;

import java.util.ArrayList;

public abstract class Enclosure implements Building {
    private String staff;
    protected ArrayList<Animal> animals = new ArrayList<>();

    public Enclosure(String staff) {
        this.staff = staff;
    }

    @Override
    public String getStaff() {
        return staff;
    }

    @Override
    public void setStaff(String staff) {
        this.staff = staff;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
}
