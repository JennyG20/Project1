package Model;

import Model.Item;

public class Potion extends Item {
    private Integer health;

    public Potion(int ID, String name, String colour, int health) {
        super(ID, name, colour);
        this.health = health;
    }
}
