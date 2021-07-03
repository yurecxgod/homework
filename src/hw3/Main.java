package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        gameNumber();
    }

    public static void gameNumber() {
        /*int numb = 1;*/
        String numb = "y";

        do {
            int randNumber = random.nextInt(10);
            int maxNumb = 10;
            int minNumb = 0;
            boolean right = false;
            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число от " + (minNumb) + " до " + (maxNumb));

                int numbByUser = sc.nextInt();
                if (numbByUser > maxNumb) {
                    numbByUser = maxNumb;
                }
                if (numbByUser > randNumber) {
                    System.out.println("Число меньше загаданного");
                    maxNumb = numbByUser;
                }
                if (numbByUser < randNumber) {
                    System.out.println("Число больше загаданного");
                    minNumb = numbByUser;
                }
                if (numbByUser == randNumber) {
                    right = true;
                    break;
                }
            }
            if (right) {
                System.out.println("Вы угадали :) \nзагаданным числом было - " + randNumber);
            } else {
                System.out.println("Вы не угадали :( \nзагаданным числом было - " + randNumber);
            }
            System.out.println("Повторить игру? Введите 'y' для подверждения.");
            numb = sc.next();
        }
        while (numb.equals("y"));
        System.out.println("Игра завершена. До свидания!");
    }
}
