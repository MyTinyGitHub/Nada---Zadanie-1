package Furniture;

import Clothes.TypesOfClothing.Rackable;

import java.util.ArrayList;

public class Rack {
    private ArrayList<Rackable> clothes = new ArrayList();;

    public void add(Rackable clothing) {
        this.clothes.add(clothing);
    }
}
