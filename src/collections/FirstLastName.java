package collections;

import java.util.HashMap;
import java.util.Map;

public class FirstLastName {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "Sophia");
        map.put("Johnson", "Isabella");
        map.put("Williams", "Jacob");
        map.put("Brown", "Mason");
        map.put("Jones", "William");
        map.put("Garcia", "Jayden");
        map.put("Miller", "Emily");
        map.put("Davis", "Abigail");
        map.put("Rodriguez", "Mia");
        map.put("Martinez", "Joshua");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);

        for (String name : copy.values()) {
            int count = 0;
            for (String nameTmp : map.values()) {
                if (nameTmp.equals(name)) {
                    count++;
                }
            }
            if (count > 1) {
                removeItemFromMapByValue(map, name);
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}
