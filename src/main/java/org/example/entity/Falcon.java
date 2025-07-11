package org.example.entity;

import org.example.Buildings.Building;

public class Falcon extends Bird{

    public Falcon(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " shrills!");
    }
}
