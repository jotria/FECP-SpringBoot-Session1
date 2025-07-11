package org.example.entity;

public abstract class Animal {
    protected String name;
    protected boolean isHealthy;

    public Animal(String name, boolean isHealthy){
        this.name = name;
        this.isHealthy = isHealthy;
    }

    public void eat(){
        System.out.println(this + " is eating.");
        this.makeSound();
    }

    public void sleep(){

    }

    public abstract void roam();
    public abstract void makeSound();
}
