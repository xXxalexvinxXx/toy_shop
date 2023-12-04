public class Toy {
    private int id;
    private String toyName;
    private int quantity;
    private double dropFrequency;

    public Toy(int id, String toyName, int quantity, double dropFrequency) {
        this.id = id;
        this.toyName = toyName;
        this.quantity = quantity;
        this.dropFrequency = dropFrequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(double dropFrequency) {
        this.dropFrequency = dropFrequency;
    }
}