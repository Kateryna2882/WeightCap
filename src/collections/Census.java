package collections;

import java.util.HashMap;
import java.util.Map;

public class Census {
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

    public static int getSameFirstNameCount(Map<String, String> map, String name) {
        int count = 0;
        for (String nameTmp : map.values()) {
            if (nameTmp.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getSameLastNameCount(Map<String, String> map, String lastName) {
        int count = 0;
        for (String lastNameTmp : map.keySet()) {
            if (lastNameTmp.equals(lastName)) {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {

    }
}
