package Storage;

import java.util.ArrayList;

public class Closet {
    ArrayList<Storage> storage = new ArrayList<>();

    public void add(Storage clothes) {
        this.storage.add(clothes);
    }

    public ArrayList<Storage> getStorage() {
        return storage;
    }
}
