package org.example.entity;

import org.example.Buildings.Building;

public class Pachyderm extends Animal{
    protected Building location;

    public Pachyderm(String name, boolean isHealthy) {
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

    public void setLocation(Building location) {
        this.location = location;
    }
  
}
