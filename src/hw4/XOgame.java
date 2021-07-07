package hw4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final Scanner sc = new Scanner(System.in);
    static final Random random = new Random();
    static char[][] map;
    static int SIZE = 4;
    static int DOTS_TO_WIN = 4;
    static final char DOT_EMPTY = '.';
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {
            human();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! :)");
                break;
            }
            if (MapFull()) {
                System.out.println("Ничья :x");
                break;
            }
            ai();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил AI :(");
                break;
            }
            if (MapFull()) {
                System.out.println("Ничья :x");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static void human() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!Valid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean Valid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void ai() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!Valid(x, y));
        System.out.println("Компьютер походил " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean MapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    /*public static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }*/

    static boolean checkWin(char dot) { //проверка победы
        int diag1;
        int diag2;
        int hor;
        int ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0;
            ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    hor++;
                }
                if (map[j][i] == dot) {
                    ver++;
                }
            }
            // проверка по горизонтали и вертикали
            if (hor == SIZE || ver == SIZE) {
                return true;
            }
        }
        diag1 = 0;
        diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == dot) {
                diag2++;
            }
        }
        // проверка по диагоналям
        if (diag1 == SIZE || diag2 == SIZE) {
            return true;
        }
        return false;
    }
}