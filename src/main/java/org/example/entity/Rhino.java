package org.example.entity;

public class Rhino extends Pachyderm {

    public Rhino(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " grunts!");
    }
}
