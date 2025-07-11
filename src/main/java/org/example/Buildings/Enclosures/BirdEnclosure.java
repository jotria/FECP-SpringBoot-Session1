package org.example.Buildings.Enclosures;

import org.example.entity.Animal;
import org.example.entity.Owl;

public class BirdEnclosure extends Enclosure{

    public BirdEnclosure(String staff) {
        super(staff);
        animals.addLast(new Owl("Kwago", true));
    }
}
