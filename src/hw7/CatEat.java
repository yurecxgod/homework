package hw7;

public class CatEat {
    private static int TIME = 0;

    public static void main(String[] args) {

        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Локи", 150, 3);
        cat[1] = new Cat("Фенрир", 100, 4);
        cat[2] = new Cat("Пушок", 30, 1);
        Bowl bowl = new Bowl(600);
        System.out.println("Три кота приступают к приему пищи, в миске - " + bowl.getFood() + " грамм корма");

        do {
            for (Cat i : cat) {

                if (i.getSatiety() == 0) {

                    if (!bowl.checkFood(i.getAppetite())) {
                        bowl.increaseFood();
                    }

                    i.eat(bowl);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() + " граммов корма и проголодается через " + (i.getSatiety()) + " часа(ов)");
                }

                i.setSatiety(i.getSatiety() - 1);
            }
            TIME++;
            System.out.println("...\nС момента начала кормежки прошел(ло) " + TIME + " час(а). В миске осталось " + bowl.getFood() + " граммов корма.");

        } while (TIME <= 10);
    }
}
