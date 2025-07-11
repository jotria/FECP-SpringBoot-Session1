package org.example.entity;

public class Owl extends Bird{

    public Owl(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " hoots!");
    }
}
