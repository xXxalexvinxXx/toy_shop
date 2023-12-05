public class Toy {
    private int id;             //id  игрушки
    private String toyName;     //название игрушки
    private int quantity;       //колличество
    private double dropFrequency; //частота выпадения

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