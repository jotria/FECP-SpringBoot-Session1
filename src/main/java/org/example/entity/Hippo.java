package org.example.entity;

import org.example.Buildings.Building;

public class Hippo extends Pachyderm{

    public Hippo(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " wheezes!");
    }
}
