package org.example.entity;

import org.example.Buildings.Building;

public class Parrot extends Bird{

    public Parrot(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " chirps!");
    }
}
