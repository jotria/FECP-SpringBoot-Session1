package org.example.entity;

import org.example.Buildings.Building;

public class Hippo extends Pachyderm{

    public Hippo(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " wheezes!");
    }
}
