package hw9;

public class MyArrayDataException extends RuntimeException {
    private int hor;
    private int ver;

    public MyArrayDataException(String message, int hor, int ver) {
        super(message);
        this.hor = hor;
        this.ver = ver;
    }

    public int getHor() {
        return hor;
    }

    public int getVer() {
        return ver;
    }
}
