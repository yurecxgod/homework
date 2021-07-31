package hw6.animals;

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
