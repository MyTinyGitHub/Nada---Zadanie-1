package Storage;

import Storage.TypesOfStorage.Rackable;

import java.util.ArrayList;

public class Rack implements Storage {
    private ArrayList<Rackable> clothes = new ArrayList();;

    public void add(Rackable clothing) {
        this.clothes.add(clothing);
    }
}
