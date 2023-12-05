import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Game {
    private ArrayList<Toy> prizes;
    private ArrayList<Toy> toys;
    private String prizeFile;           //имя файла с логом

    Menu menu = new Menu();

    public Game(ArrayList<Toy> toys) {
        this.prizes = new ArrayList<Toy>();
        this.toys = toys;
        prizeFile = MakeFileEmpty.file;


    }
    public void choosePrizesRandom(ArrayList<Toy> toys) {
        prizes.clear();

        for (Toy toy : toys) {
            double random = Math.random() * 100;

            if (random < toy.getDropChance()) {
                prizes.add(toy);

            }
        }
        System.out.println("\nprizes:");
        menu.showStore(prizes);
    }

    public Toy getPrizeToy() {
        if (!prizes.isEmpty()) {

            Toy prizeToy = prizes.remove(0);

            prizeToy.setQuantity(prizeToy.getQuantity() - 1);


            try {
                FileWriter writer = new FileWriter(prizeFile, true);
                writer.write(prizeToy.getToyName() + "\n");
                writer.close();
            } catch (IOException e) {
                System.out.println("Error writing to the toy file");
            }

            return prizeToy;
        } else {
            System.out.println("All the toys are over");
            return null;
        }
    }

}
