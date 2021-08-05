package hw6.animals;

import java.lang.String;

public class Cat extends Animal {
    private static int count;
    public Cat(String name, int maxDist, int maxSwim) {
        super(name, "Кот ", maxDist, maxSwim);
        count++;
    }

    public Cat(String name) {
        super(name, "Кот ", 200, 0);
        count++;
    }

    public static int getCount() {
        return count;
    }
}
