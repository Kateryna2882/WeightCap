package collections;

import java.util.Set;

public class GreaterThanTen {
    public static Set<Integer> createSet() {
        // write your code here
        Set<Integer> set = new java.util.HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add((int) (Math.random() * 20));

        }
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        // write your code here
        for (Integer i : set) {
            if (i > 10) {
                set.remove(i);
            }
        }

    }

    public static void main(String[] args) {

    }

}
