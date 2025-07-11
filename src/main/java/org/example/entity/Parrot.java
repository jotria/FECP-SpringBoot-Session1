package org.example.entity;

import org.example.Buildings.Building;

public class Parrot extends Bird{

    public Parrot(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " chirps!");
    }
}
