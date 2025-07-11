package org.example.entity;

import org.example.Buildings.Building;

public class Feline extends Animal {

    protected Building location;

    public Feline(String name, boolean isHealthy) {
        super(name, isHealthy);
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
}
