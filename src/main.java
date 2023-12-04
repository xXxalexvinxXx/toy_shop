public class main {
    public static void main(String[] args){
        ToyStore tStore = new ToyStore();

        tStore.addToy(1, "TeddyBear", 15, 15);
        tStore.addToy(2, "Big Doll", 25, 5);
        tStore.addToy(3,"Doll", 50, 35);
        tStore.addToy(4,"Lollipop", 100, 45);

        tStore.setDropFrequency(5, 15);

        tStore.play();
    }
}
