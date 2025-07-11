package org.example.entity;

import org.example.Buildings.Building;

public class Rhino extends Pachyderm {

    public Rhino(String name, Building location) {
        super(name, location);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " grunts!");
    }
}
