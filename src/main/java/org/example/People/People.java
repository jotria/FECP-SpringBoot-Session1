package org.example.People;

import org.example.Buildings.Building;

public abstract class People {
    protected String name;
    protected Building location;

    public String getName() {
        return name;
    }

    public Building getLocation() {
        return location;
    }

    public void goTo(Building destination) {
        this.location = destination;
        System.out.println(name + " goes to " + destination);
    }
}
