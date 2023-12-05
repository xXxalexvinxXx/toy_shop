import java.util.ArrayList;


public class ToyStore {
    private ArrayList<Toy> toys;

    public ToyStore() {
        toys = new ArrayList<>();
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public ArrayList<Toy> getToys() {
        return toys;
    }

    public boolean setDropFrequency(int id, double dropFrequency) { //установка частоты выпадения игрушки
        int i = 0;
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setDropFrequency(dropFrequency);
                i++;
            }
        }
        if (i == 0) {
            return false;
        } else return true;
    }

    public void removeToy(ArrayList<Toy> toys, String name) { //удаление игрушки
        int i = 0;
        for (Toy toy : toys) {
            if (toy.getToyName().contains(name)) {
                toys.remove(toy);
                i++;
                break;
            }
        }

        if (i > 0) {
            System.out.println("Игрушка " + name + " была изъята");
        }
        else System.out.println("Игрушки " + name + " не существует");
    }

    public boolean changeItem(String name, int quantity, double dropFrequency){
        boolean flag = false;
        for (Toy toy: toys){
            if(toy.getToyName().contains(name)){
                toy.setToyName(name);
                toy.setQuantity(quantity);
                toy.setDropFrequency(dropFrequency);
                flag = true;
            }
        }
        return flag;
    }
}
