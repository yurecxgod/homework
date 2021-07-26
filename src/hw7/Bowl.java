package hw7;

public class Bowl {
    private int food;

    int getFood() {
        return food;
    }

    Bowl(int food) {
        this.food = food;
    }

    void decreaseFood(int n) {
        food -= n;
    }

    void increaseFood() {
        this.food += 300;
        System.out.println("В миску добавили 300 грамм корма");
    }

    boolean checkFood(int n) {
        return (food - n) >= 0;
    }
}
