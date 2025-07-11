package org.example.Buildings.Enclosures;

import org.example.Buildings.Building;

import java.util.ArrayList;

public abstract class Enclosure implements Building {
    private String staff;
    private ArrayList<String> animals = new ArrayList<>();

    @Override
    public String getStaff() {
        return staff;
    }

    @Override
    public void setStaff(String staff) {
        this.staff = staff;
    }

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<String> animals) {
        this.animals = animals;
    }
}
