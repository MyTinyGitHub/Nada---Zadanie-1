package Furniture;

import Clothes.TypesOfClothing.Drawerable;

import java.util.ArrayList;

public class Drawer {
    private ArrayList<Drawerable> clothes = new ArrayList();;

    public void add(Drawerable clothing) {
        clothes.add(clothing);
    }
}
