import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Counter counter;
    private ToyStore store;
    private Game game;
    private ArrayList<Toy> toys;

    public void showStore(ArrayList<Toy> toys) {

        System.out.printf("%-8s%-20s%-18s%-10s\n", "Id", "Name", "Quantity", "Frequency");
        for (Toy toy : toys)
            System.out.printf("%-8d%-20s%-18d%-10f\n", toy.getId(), toy.getToyName(), toy.getQuantity(), toy.getDropChance());

    }


    public void userMenu(ToyStore store, Counter counter, ArrayList <Toy> toys) {
        boolean flag = true;
        while (flag) {
            System.out.println("\n         выберите пункт меню\n" +
                    "1 - показать игрушки в магазине\n" +
                    "2 - начать игру\n" +
                    "3 - изменить частоту выпадения игрушки по ID\n" +
                    "4 - добавить игрушку в магазин\n" +
                    "5 - удалить игрушку из магазина\n" +
                    "6 - изменить параметры игрушки\n" +
                    "7 - выход");

            Scanner in = new Scanner(System.in);

            String user_input = in.next();
            if (user_input.contains("1")) {
                System.out.println("\nигрушки в магазине:");
                showStore(store.getToys());
            } else if (user_input.contains("2")) {
                Game game = new Game(store.getToys());
                game.choosePrizesRandom(store.getToys());
                Toy prizeToy = game.getPrizeToy();
                if (prizeToy != null) {
                    System.out.println("\nпризовая игрушка: " + prizeToy.getToyName() + '\n');
                }
            } else if (user_input.contains("3")) {
                System.out.println("Введите id: ");
                int id = Integer.parseInt(in.next());
                System.out.println("Введите шанс выпадения: ");
                double newFrequency = Double.parseDouble(in.next());
                if (newFrequency > 0 && newFrequency < 100) {
                    if (!store.setDropChance(id, newFrequency)) {
                        System.out.println("id не существует");
                    } else {
                        System.out.println("изменение частоты выпадения успешно\n");
                    }
                } else {
                    System.out.println("шанс выпадения должен быть 0 до 100\n");
                }

            } else if (user_input.contains("4")) {

                System.out.println("введите название игрушки: ");
                String name = in.next();
                System.out.println("введите кол-во игрушек: ");
                int quantity = Integer.parseInt(in.next());
                boolean flag1 = true;
                System.out.println("введите шанс выпадения: ");
                double chance = Double.parseDouble(in.next());
                while (flag1) {
                    if (chance > 0 && chance < 100) {
                        flag1 = false;
                    } else {
                        System.out.println("введите шанс выпадения от 0 до 100: ");
                        chance = Double.parseDouble(in.next());
                    }
                }
                store.addToy(new Toy(counter.getId(), name, quantity, chance));
                System.out.println("новая игрушка добавлена ");

            }else if (user_input.contains("5")) {
                System.out.println("введите название игрушки для удаления: ");
                String name = in.next();
                store.removeToy(toys, name);
            }else if (user_input.contains("6")){
                System.out.println("введите название игрушки для изменения параметров: ");
                String name = in.next();
                System.out.println("введите кол-во игрушек: ");
                int quantity = Integer.parseInt(in.next());
                boolean flag2 = true;
                System.out.println("введите шанс выпадения игрушки: ");
                double chance = Double.parseDouble(in.next());
                while (flag2) {
                    if (chance > 0 && chance < 100) {
                        flag2 = false;
                    } else {
                        System.out.println("шанс выпадения от 0 до 100: ");
                        chance = Double.parseDouble(in.next());
                    }
                }
                if(store.changeItem(name, quantity, chance)){
                    System.out.println("параметры игрушки  " + name + " изменены" );
                }
                else{
                    System.out.println(name + " нет в магазине" );
                }

            }
            else {
                flag = false;

            }
        }

    }

}