package Storage;

import Storage.TypesOfStorage.Drawerable;

import java.util.ArrayList;

public class Drawer {
    private ArrayList<Drawerable> clothes = new ArrayList();;

    public void add(Drawerable clothing) {
        clothes.add(clothing);
    }
}
