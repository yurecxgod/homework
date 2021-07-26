package hw2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1
        int[] array = {1, 0, 0, 1, 0, 0, 1, 0, 0, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        // 2
        int[] array2 = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = i * 3;
        }
        System.out.println(Arrays.toString(array2));

        // 3
        int[] array3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 6) {
                array3[i] = array3[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array3));

        // 4
        int[][] array4 = new int[5][5];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (i == j || i + j == array4.length - 1) {
                    array4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                System.out.print(array4[i][j] + " ");
            }
            System.out.println();
        }

        // 5
        /*int[] array5 = {1, -1, 0, 4, 2, 25, -3, 13};
        int max = array5[0];
        for(int i = 0; i < array5.length; i++) {
            if(array5[i] > max)
            {
                max = array5[i];
            }
        }
        int min = array5[0];
        for(int i = 0; i < array5.length; i++) {
            if(array5[i] < min)
            {
                min = array5[i];
            }
        }
        System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);*/

        // 2ой способ (попробовал упростить код)
        int[] array5 = {1, -1, 0, 4, 2, 25, -3, 13};
        int max = array5[0];
        int min = array5[0];
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] > max) {
                max = array5[i];
            }
            if (array5[i] < min) {
                min = array5[i];
            }
        }
        System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);

        // 6
        int[] arr6 = {2, 2, 2, 2, 6, 2};
        sumArray6(arr6);
        if (sumArray6(arr6)) {
            System.out.println("есть симметрия");
        } else {
            System.out.println("нет симметрии");
        }
        /*System.out.println(sumArray6(arr6));*/
    }

    public static boolean sumArray6(int[] array6) {
        int sum = 0;
        for (int i = 0; i < array6.length; i++) {
            sum = sum + array6[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int halfSum = 0;
        int i = 0;
        while (halfSum < sum / 2) {
            halfSum = halfSum + array6[i];
            i++;
        }
        /* проверка чисел
        System.out.println(sum);
        System.out.println(halfSum); */
        return halfSum == sum / 2;
    }
    // 7

}
