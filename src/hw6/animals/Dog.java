package hw6.animals;

import java.lang.String;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int maxDist, int maxSwim) {
        super(name, "Собака ", maxDist, maxSwim);
        count++;
    }

    public Dog(String name) {
        super(name, "Собака ", 500, 10);
        count++;
    }
    public static int getCount() {
        return count;
    }
}
