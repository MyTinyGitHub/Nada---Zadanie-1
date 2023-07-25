package Furniture;

import Clothes.TypesOfClothing.Drawerable;

import java.sql.Array;
import java.util.ArrayList;

public class Closet {
    ArrayList<Drawer> drawers = new ArrayList<>();
    ArrayList<Rack> racks = new ArrayList<>();
    ArrayList<Shelf> shelves = new ArrayList<>();

    public void addToDrawer(Drawer clothes) {
        this.drawers.add(clothes);
    }

    public void addToRacks(Rack rack) {
        this.racks.add(rack);
    }

    public void addToShelves(Shelf shelf) {
        this.shelves.add(shelf);
    }

    public ArrayList<Drawer> getDrawers() {
        return drawers;
    }

    public ArrayList<Rack> getRacks() {
        return racks;
    }

    public ArrayList<Shelf> getShelves() {
        return shelves;
    }
}
