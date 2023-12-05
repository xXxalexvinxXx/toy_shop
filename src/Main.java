import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        MakeFileEmpty.MakeFileEmpty();

        ToyStore store = new ToyStore();            //создание магазина с
        Counter counter = new Counter(0);       //автозаполнение id
        Menu menu = new Menu();                     //вызов меню

        //region Создание игруушек

        Toy robot = new Toy(counter.getId(), "Робот", 15, 12);
        Toy constructor = new Toy(counter.getId(), "Конструктор", 300, 40);
        Toy skittles = new Toy(counter.getId(), "Кегли", 220, 40);
        Toy doll = new Toy(counter.getId(), "Кукла", 180, 35);
        Toy slime = new Toy(counter.getId(), "Слайм", 250, 95);
        Toy car = new Toy(counter.getId(), "Машинка", 30, 8);
        //endregion


        //region Добавление игрушек в магазин
        store.addToy(robot);
        store.addToy(constructor);
        store.addToy(skittles);
        store.addToy(doll);
        store.addToy(slime);
        store.addToy(car);
        //end region

        menu.userMenu(store, counter, store.getToys());
    }
}
