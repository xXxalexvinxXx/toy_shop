public class Counter {
    private int id;

    public Counter(int id) {
        this.id = id;
    }

    public int getId() {
        id++;
        return id;
    }
}
