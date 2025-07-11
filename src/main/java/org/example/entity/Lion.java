package org.example.entity;

import org.example.Buildings.Building;

public class Lion extends Feline{

    public Lion(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " roars!");
    }
}
