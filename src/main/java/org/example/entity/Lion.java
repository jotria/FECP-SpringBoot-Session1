package org.example.entity;

import org.example.Buildings.Building;

public class Lion extends Feline{

    public Lion(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " roars!");
    }
}
