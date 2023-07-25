import Clothes.*;
import Storage.Closet;
import Storage.Drawer;
import Storage.Rack;
import Storage.Shelf;

public class Main {
    public static void main(String[] args) {
        Hoodie hoodie = new Hoodie();
        Leggings leggings = new Leggings();
        Socks socks = new Socks();
        TShirt tShirt = new TShirt();
        Underwear underwear = new Underwear();

        Drawer drawer = new Drawer();
        drawer.add(underwear);
        drawer.add(tShirt);
        drawer.add(socks);

        Rack rack = new Rack();
        rack.add(hoodie);

        Shelf shelf = new Shelf();
        shelf.add(hoodie);
        shelf.add(underwear);
        shelf.add(tShirt);
        shelf.add(socks);
        shelf.add(leggings);

        Closet closet = new Closet();
        closet.add(drawer);
        closet.add(rack);
        closet.add(shelf);
    }
}