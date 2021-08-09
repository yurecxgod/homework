package hw10;

import java.util.*;

public class Phones {
    Map<String, Set<String>> PhoneDirectory = new HashMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> number = PhoneDirectory.getOrDefault(name, new HashSet<>());
        number.add(phoneNumber);
        PhoneDirectory.put(name, number);
    }
    Set<String> get(String name) {
        return PhoneDirectory.get(name);
    }
}
