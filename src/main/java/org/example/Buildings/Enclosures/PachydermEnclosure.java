package org.example.Buildings.Enclosures;

import org.example.Buildings.Building;
import org.example.entity.Elephant;

import java.util.ArrayList;

public class PachydermEnclosure extends Enclosure {

    public PachydermEnclosure(String staff) {
        super(staff);
        animals.addLast(new Elephant("Dumbo", true));
    }
}
