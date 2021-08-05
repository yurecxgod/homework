package hw12;

public class Main {
    private static void singleThread(float[] arr) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < SIZE; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long singleTime = System.currentTimeMillis() - start;

        System.out.println("Время выполнения при однопоточных вычислениях: " + singleTime);
    }

    private static void multiThread(float[] arr) {
        float[] a = new float[h];
        float[] b = new float[h];

        long start = System.currentTimeMillis();

        System.arraycopy(arr, 0, a, 0, h);
        System.arraycopy(arr, h, b, 0, h);

        MyThread t1 = new MyThread("a", a);
        MyThread t2 = new MyThread("b", b);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = t1.getArr();
        b = t2.getArr();

        System.arraycopy(a, 0, arr, 0, h);
        System.arraycopy(b, 0, arr, a.length, b.length);

        long multiTime = System.currentTimeMillis() - start;

        System.out.println("Время выполнения при многопоточных вычислениях: " + multiTime);
    }

    private static final int SIZE = 10_000_000;
    private static final int h = SIZE / 2;
    private static float[] arr = new float[SIZE];

    public static void main(String[] args) {

        for (int i = 0; i < SIZE; i++) {
            arr[i] = 1;
        }
        singleThread(arr);
        multiThread(arr);
    }
}

class MyThread extends Thread {
    private float[] arr;

    MyThread(String name, float[] arr) {
        super(name);
        this.arr = arr;
    }

    float[] getArr() {
        return arr;
    }

    @Override
    public void run() {
        calculate();
    }

    private void calculate() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
