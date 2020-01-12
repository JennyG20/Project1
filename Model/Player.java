package Model;

import Model.Item;

import java.util.ArrayList;

public class Player {
    private String name;
    private Integer HP;
    private ArrayList<Item> items = new ArrayList<>();
    private Sword sword;
    private Integer gold;

    public Player(String name, Integer HP, ArrayList<Item> items, Sword sword, Integer gold) {
        this.name = name;
        this.HP = HP;
        this.items = items;
        this.sword = sword;
        this.gold = gold;
    }

    public void printItems() {
        System.out.println("Backpack \n");
        for (Item item : items) System.out.println(item);
    }
}

