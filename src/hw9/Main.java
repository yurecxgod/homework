package hw9;

public class Main {
    static int MASSIVESIZE = 4;

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4" },
                {"2", "2", "3", "4" },
                {"3", "2", "4", "4" },
                {"4", "2", "3", "4" }
        };
        String[][] array1 = {
                {"1", "2", "3", "31234werwer" },
                {"2", "2", "3", "42" },
                {"3", "3", "4", "4" },
                {"4", "2", "3", "4" }
        };
        String[][] array2 = {
                {"1", "2", "3", "3", "234" },
                {"2", "2", "3", "4" },
                {"3", "2", "3", "4" },
                {"4", "2", "3", "4" }
        };
        try {
            System.out.println("первый массив: " + sum(array));
            System.out.println("второй массив: " + sum(array1));
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println("ошибка в ячейке: " + e.getHor() + " " + e.getVer());
        } finally {
            try {
                System.out.println("третий массив: " + sum(array2));
            } catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }
    }

    static int sum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != MASSIVESIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != MASSIVESIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                try {
                    sum = sum + Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("ячейка " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}
