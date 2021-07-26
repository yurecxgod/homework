package hw8;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height){
        this.height = height;
    }

    public boolean doThis(Sport i) {
        return i.jump(height);
    }
}
