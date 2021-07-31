package hw8;

public class Crossroad implements Obstacles {
    private int distance;

    public Crossroad(int distance) {
        this.distance = distance;
    }
    public boolean doThis(Sport i) {
        return i.run(distance);
    }
}
