package org.example.Buildings.Enclosures;

import org.example.entity.Lion;

public class FelineEnclosure extends Enclosure{

    public FelineEnclosure(String staff) {
        super(staff);
        animals.addLast(new Lion("Mufasa", true));
    }
}
