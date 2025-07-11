package org.example.entity;

public class Cheetah extends Feline{

    public Cheetah(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " purrs!");
    }
}
