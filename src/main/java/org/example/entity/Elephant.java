package org.example.entity;

import org.example.Buildings.Building;

public class Elephant extends Pachyderm{

    public Elephant(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " growls!");
    }
}
