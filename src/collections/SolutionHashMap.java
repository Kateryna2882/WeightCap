package collections;

import java.util.HashMap;
import java.util.Map;

public class SolutionHashMap {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("Sim", 5);
        map.put("Tom", 5.5);
        map.put("Arbus", false);
        map.put("Baby", null);
        map.put("Cat", "Cat");
        map.put("Eat", Long.valueOf(56L));
        map.put("Food", Character.valueOf('3'));
        map.put("Gevey", '6');
        map.put("Hugs", 111111111111L);
        map.put("Comp", (double) 123);

        //write your code here
        for (Map.Entry<String, Object> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

    }

}
