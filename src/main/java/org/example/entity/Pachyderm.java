package org.example.entity;

public class Pachyderm extends Animal{
    protected String location;

    public Pachyderm(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void roam() {
        System.out.println(this + "is roaming.");
    }

    @Override
    public void makeSound() {

    }

    public String getLocation() {
        return location;
    }
}
