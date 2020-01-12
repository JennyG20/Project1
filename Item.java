public class Item extends Printable {
    private int ID;
    private String name;
    private String colour;

    public Item(int ID, String name, String colour) {
        this.ID = ID;
        this.name = name;
        this.colour = colour;
    }

    @Override
    public String toString() {
        try {
            return this.colour + " " + this.name + "\n"
                    + "--------------------\n"
                    + this.getAllValues();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return "Error you Kray Kray";
    }

}

