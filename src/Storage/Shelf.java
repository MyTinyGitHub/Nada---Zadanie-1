package Storage;

import Storage.TypesOfStorage.Closetable;

import java.util.ArrayList;

public class Shelf {
    private ArrayList<Closetable> clothing= new ArrayList<>();

    public void add(Closetable clothing) {
        this.clothing.add(clothing);
    }
}
