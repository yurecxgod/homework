package hw11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] yoo = {"qwe", "zxc", "asd", "123"};
        System.out.println(arrToList(yoo));
        swapElements(yoo, 1, 3);
        System.out.println(Arrays.asList(yoo));

        Boxes();

    }

    public static void Boxes() {
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        Box<Fruits> boxWithFruits = new Box<>(new Apple(), new Orange());
        System.out.println("Коробка с яблоками 1 весит " + boxWithApple.getWeight());
        System.out.println("Коробка с апельсинами весит " + boxWithOranges.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        System.out.println("Добавили одно яблоко в коробку");
        boxWithApple.add(new Apple());
        System.out.println("Коробка с яблоками 1 весит " + boxWithApple.getWeight());
        System.out.println(boxWithApple.compare(boxWithOranges));
        boxWithFruits.add(new Apple());
        boxWithFruits.add(new Orange());
        System.out.println("Общая коробка с фруктами весит: " + boxWithFruits.getWeight());


        Box<Apple> boxWithApple1 = new Box<>();
        System.out.println("Коробка с яблоками 2 весит " + boxWithApple1.getWeight());
        System.out.println("Высыпаем из 1 коробки во 2.");
        boxWithApple.replaceFruits(boxWithApple1);
        System.out.println("Коробка с яблоками 1 весит " + boxWithApple.getWeight());
        System.out.println("Коробка с яблоками 2 весит " + boxWithApple1.getWeight());
        System.out.println("В общей коробке лежат: " + boxWithFruits.getBox());
    }

    public static void swapElements(Object[] arr, int first, int second) {
        Object o = arr[first];
        arr[first] = arr[second];
        arr[second] = o;
    }

    public static <T> ArrayList<T> arrToList(T[] arr) {
        return new ArrayList<>(Arrays.asList(arr));
    }
}
