package org.example.entity;

import org.example.Buildings.Building;

public class Owl extends Bird{

    public Owl(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " hoots!");
    }
}
