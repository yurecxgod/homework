package hw9;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException() {
        super("Размер массива должна быть 4 x 4\n");
    }
}
