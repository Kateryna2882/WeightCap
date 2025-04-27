package collections;

import java.util.HashSet;
import java.util.Set;

public class Words {
    public static Set<String> createSet() {
        //write your code here
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(String.valueOf(i));
        }
        return set;

    }

    public static void main(String[] args) {

    }

}
