package collections;

import java.util.HashMap;
import java.util.Map;

public class Census {
    public static Map<String, String> createMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        return map;

    }

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        //write your code here
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(name)) {
                if (map2.containsKey(pair.getKey())) {
                    map2.put(pair.getKey(), map2.get(pair.getKey()) + 1);
                } else {
                    map2.put(pair.getKey(), 1);
                }
            }
        }
        return map2.size();
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        //write your code here
        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) {
                if (map2.containsKey(pair.getValue())) {
                    map2.put(pair.getValue(), map2.get(pair.getValue()) + 1);
                } else {
                    map2.put(pair.getValue(), 1);
                }
            }
        }
        return map2.size();


    }

    public static void main(String[] args) {

    }

}
