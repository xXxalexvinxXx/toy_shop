public class Toy {
    private int id;             //id  игрушки
    private String toyName;     //название игрушки
    private int quantity;       //колличество
    private double dropChance; //частота выпадения

    public Toy(int id, String toyName, int quantity, double dropChance) {
        this.id = id;
        this.toyName = toyName;
        this.quantity = quantity;
        this.dropChance = dropChance;
    }

    public int getId() {
        return id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDropChance() {
        return dropChance;
    }

    public void setDropChance(double dropChance) {
        this.dropChance = dropChance;
    }
}