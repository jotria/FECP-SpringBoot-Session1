package org.example.entity;

public class Elephant extends Pachyderm{

    public Elephant(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " growls!");
    }
}
