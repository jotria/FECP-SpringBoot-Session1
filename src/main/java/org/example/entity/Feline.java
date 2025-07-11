package org.example.entity;

import org.example.Buildings.Building;

public class Feline extends Animal {

    protected Building location;

    public Feline(String name, Building location) {
        super(name);
        this.location = location;
    }

    @Override
    public void roam() {
        System.out.println(this.name + "is roaming.");
    }

    @Override
    public void makeSound() {

    }

    public Building getLocation() {
        return location;
    }

    public void setLocation(Building location) {
        this.location = location;
    }
}
