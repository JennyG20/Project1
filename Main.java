import Model.Item;
import Model.Player;
import Model.Potion;
import Model.Sword;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword(45, "Greggs", "brown", 15, 80);
        Sword sword1 = new Sword(40, "Pret a manager", "red", 10, 90);
        Potion potion = new Potion(41, "Sugar", "green", 20);
        ArrayList<Item> items = new ArrayList<>();
        items.add(potion);
        items.add(sword1);
        Player player = new Player("Pako", 100, items, sword, 20);
        player.printItems();
    }
}
