package hw8;

public class Main {
    public static void main(String[] args) {
        Sport[] sports = {
                new Cat("Мяу", 2000, 3),
                new Robot("Клокверк", 6000, 5),
                new Human("Чел", 5000, 2),

        };

        Obstacles[] obstacles = {
                new Crossroad(2500),
                new Wall(3)
        };

        for (Sport i : sports) {
            for (Obstacles o : obstacles) {
                if (!o.doThis(i)) {
                    break;
                }
                ;
            }
        }
    }
}
