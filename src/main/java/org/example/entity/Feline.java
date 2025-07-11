package org.example.entity;

public class Feline extends Animal {

    protected String location;

    public Feline(String name, boolean isHealthy) {
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
