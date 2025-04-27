package collections;

import java.util.HashMap;
import java.util.Map;

public class SharedLast {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        map.put("Smith", "John");
        map.put("Johnson", "Richard");
        map.put("Williams", "Robert");
        map.put("Brown", "Michael");
        map.put("Jones", "Richard");
        map.put("Garcia", "Donald");
        map.put("Miller", "Nathan");
        map.put("Dav", "Matt");
        map.put("Davis", "Matthew");
        map.put("Davis", "Matew");

        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}
