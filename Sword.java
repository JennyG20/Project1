public class Sword extends Item {
    private int damage;
    private double length;

    public Sword(int ID, String name, String colour, int damage, double length) {
        super(ID, name, colour);
        this.damage = damage;
        this.length = length;
    }
}


