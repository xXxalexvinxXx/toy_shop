package Model;

import javax.swing.*;

public class Toy {
private int id;
private String toyName;
private int dropFrequency;

    public Toy(int id, String toyName, int dropFrequency) {
        this.id = id;
        this.toyName = toyName;
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

    public int getDropFrequency() {
        return dropFrequency;
    }

    public void setDropFrequency(int dropFrequency) {
        this.dropFrequency = dropFrequency;
    }
}
