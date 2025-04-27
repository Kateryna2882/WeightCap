package collections;

import java.util.HashMap;
import java.util.Map;

public class Rich {
    public static Map<String, Integer> createMap() {
        //write your code here
        Map<String, Integer> map = new HashMap<>();
        map.put("Alfia", 100);
        map.put("Inna", 200);
        map.put("Jeka", 300);
        map.put("Aliona", 50);
        map.put("Sobko", 30);
        map.put("Garcia", 600);
        map.put("Miller", 700);
        map.put("Davis", 800);
        map.put("Katrine", 3000);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> pair : copy.entrySet()) {
            if (pair.getValue() < 500) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}

