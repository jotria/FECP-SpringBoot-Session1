package org.example.entity;

public class Tiger extends Feline{

    public Tiger(String name, boolean isHealthy) {
        super(name, isHealthy);
    }

    @Override
    public void makeSound(){
        System.out.println(this.name + " roars!");
    }
}
