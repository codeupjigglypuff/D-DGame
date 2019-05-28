import environment.TheTavernOnTheRocks;

public class Main {
    //main class for game

    public static void main(String[] args) {
        TheTavernOnTheRocks room= new TheTavernOnTheRocks(false,false,true,false);

        System.out.println(room.getDescription());
    }
}
