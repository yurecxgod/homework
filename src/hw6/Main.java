package hw6;

import hw6.animals.Animal;
import hw6.animals.Cat;
import hw6.animals.Dog;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Зевс"),
                new Cat("Локи"),
                new Dog("Фенрир"),
                new Dog("Пушок"),
                new Dog("Ева", 242, 8)
        };

        for (int i=0; i < animals.length; i++) {
            animals[i].run(100);
            animals[i].swim(10);
        }
        System.out.println("Всего животных: " + Animal.getCount());
        System.out.println("Кошек: " + Cat.getCount());
        System.out.println("Собак: " + Dog.getCount());
    }
}

public class Animal {
    String name;
    String type;
    private static int count;

    int maxRun;
    int maxSwim;

    public Animal(String name, String type, int maxRun, int maxSwim) {
        this.name = name;
        this.type = type;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }

    public void run(int distance) {
        if (maxRun == 0) {
            System.out.println(type + name + " не бегает");
            return;
        }
        if (distance <= maxRun) {
            System.out.println(type + name + " пробежал " + distance + " метров");
        } else {
            System.out.println(type + name + "не смог пробежать " + distance + " метров");
        }
    }
    public void swim(int distance) {
        if (maxSwim == 0) {
            System.out.println(type + name + " не плавает");
            return;
        }
        if (distance <= maxSwim) {
            System.out.println(type + name + " проплыл " + distance + " метров");
        } else {
            System.out.println(type + name + " не смог проплыть " + distance + " метров");
        }
    }

    public static int getCount() {
        return count;
    }
}

public class Cat extends hw6.animals.Animal {
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

public class Dog extends hw6.animals.Animal {
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
