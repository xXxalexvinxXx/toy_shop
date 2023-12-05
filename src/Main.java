import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        MakeFileEmpty.MakeFileEmpty();

        ToyStore store = new ToyStore();                                                                 //создание магазина с
        Counter counter = new Counter(0);                                                   // создание автозаполнение id
        Menu menu = new Menu();                                                                         //создание интерфейса с пользователем

        Toy car = new Toy(counter.getId(), "Мяч", 15, 12);                  //создание игрушек
        Toy transformer = new Toy(counter.getId(), "Головоломка", 300, 40);
        Toy ball = new Toy(counter.getId(), "Кегли", 220, 40);
        Toy doll = new Toy(counter.getId(), "Кукла", 180, 35);
        Toy rubikCube = new Toy(counter.getId(), "Слайм", 250, 95);
        Toy soapBubbles = new Toy(counter.getId(), "Машинка", 30, 8);


        store.addToy(car);                                                                          //добавления игрушек в магазин
        store.addToy(transformer);
        store.addToy(ball);
        store.addToy(doll);
        store.addToy(rubikCube);
        store.addToy(soapBubbles);

        menu.userMenu(store, counter, store.getToys());
    }
}
