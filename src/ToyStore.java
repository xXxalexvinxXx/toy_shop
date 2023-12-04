import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyStore {
    private List<Toy> toys;
    private List<Toy> prizes;

    public ToyStore(){
        toys = new ArrayList<>();
        prizes = new ArrayList<>();

    }
    public void addToy(int id, String toyName, int quantity, double dropFrequency){
        Toy toy = new Toy (id, toyName, quantity, dropFrequency);
        toys.add(toy);
    }
    public void setDropFrequency (int id, double dropFrequency){
        for (Toy toy : toys){
            if (toy.getId() == id){
                toy.setDropFrequency(dropFrequency);
                break;
            }
        }
    }

    public void getPrize() throws IOException {
        if (prizes.size() > 0) {
            Toy prize = prizes.remove(0);

            FileWriter writer = new FileWriter("prize.log", true);
            writer.write(prize.getId() + ";" + prize.getToyName()+"\n");
            writer.close();
        }
    }

    public void play()
    {
        //calc total elements
        double totalFrequency = 0;
        for (Toy toy : toys){
            totalFrequency += toy.getDropFrequency();
        }

//        random generator for game

        Random rnd = new Random();
        double rndNumber = rnd.nextDouble() * totalFrequency;

        Toy prize = null;
        for (Toy toy :toys){
            if (rndNumber < toy.getDropFrequency()){
                prize = toy;
                break;
            }
            rndNumber -= toy.getDropFrequency();
        }

//        fill prizes list
        if (prize != null && prize.getQuantity() >0 ){
            prizes.add(prize);
            prize.setQuantity((prize.getQuantity()) - 1);
        }
    }
}