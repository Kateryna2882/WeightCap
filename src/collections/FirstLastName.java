package collections;

import java.util.HashMap;
import java.util.Map;

public class FirstLastName {
    public static Map<String, String> createMap() {
        //write your code here

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

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
