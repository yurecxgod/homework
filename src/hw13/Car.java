package hw13;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static int CARS_COUNT;
    private AtomicInteger finishCount;
    private Race race;
    private int speed;
    private String name;
    private static CyclicBarrier startBarrier;
    private static CountDownLatch countDownLatchFinish;
    private static CountDownLatch countDownLatchReady;

    static {
        countDownLatchFinish = Main.countDownLatchFinish;
        countDownLatchReady = Main.countDownLatchReady;
        startBarrier = Main.startBarrier;
    }

    String getName() {
        return name;
    }
    int getSpeed() {
        return speed;
    }
    Car(Race race, int speed, CountDownLatch countDownLatchFinish, AtomicInteger finishCount) {
        this.race = race;
        this.speed = speed;
        this.finishCount = finishCount;
        this.countDownLatchFinish = countDownLatchFinish;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int)(Math.random() * 800));
            countDownLatchReady.countDown();
            System.out.println(this.name + " готов");

            startBarrier.await();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }

        final ArrayList<Stage> stages = race.getStages();
        for (Stage stage : stages) {
            stage.go(this);
        }
        countDownLatchFinish.countDown();
        int finishPlace = finishCount.incrementAndGet();
        if (finishPlace == 1) {
            try {
                countDownLatchFinish.await();
                System.out.println("ПОБЕДИЛ " + name + "! ПОЗДРАВЛЯЕМ!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
