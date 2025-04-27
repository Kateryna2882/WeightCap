package collections;

import java.util.Map;

public class MapOfCats {
    public static void main(String[] args) throws Exception {
        String[] catsArray = new String[]{"cooper", "missy", "oreo", "tiger", "lulu", "tucker", "jasmine", "jackson", "murphy", "pepper"};

        Map<String, Cat> map = addCatsToMap(catsArray);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //write your code here
        Map<String, Cat> map = new java.util.HashMap<>();
        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        return map;

    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
