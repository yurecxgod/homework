package hw10;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"cold", "warm", "Hot", "ice", "one", "two", "three", "four", "five", "six", "warm", "seven", "one"};

        /*HashMap<String, Integer> wordsmap = new HashMap<>();
        for (String s : words) {
            wordsmap.put(s, wordsmap.getOrDefault(s, 0) + 1);
        }*/
        Map<String, Integer> wordsmap = new HashMap<String, Integer>();

        for (String s: words) {

            if (wordsmap.containsKey(s.toLowerCase())) {
                wordsmap.put(s, wordsmap.getOrDefault(s, 0) + 1);
            }
            else {
                wordsmap.put(s.toLowerCase(),1);
            }
        }

        for (Map.Entry<String, Integer> key: wordsmap.entrySet()
        ) {
            System.out.print(key.getKey()+ " - " + key.getValue() + ", ");
        }

        System.out.println("\nВсего слов: " + wordsmap.size() + "\nУникальные слова: " + wordsmap.keySet());

        Phones phoneDirectory = new Phones();
        phoneDirectory.add("Невский", "+7921337228");
        phoneDirectory.add("Майскй", "+7921337322");
        phoneDirectory.add("Невский", "+7921337229");
        phoneDirectory.add("Прикольный", "+7921337100");
        phoneDirectory.add("Невский", "+7921337227");
        phoneDirectory.add("Кентикславский", "+7921337300");


        System.out.println("\nНомера по фамилии Невский: " + phoneDirectory.get("Невский"));
        System.out.println("\nВесь телефонный справочник: " + phoneDirectory.PhoneDirectory.entrySet());
    }
}

