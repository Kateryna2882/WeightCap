package collections;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class MeasureTwo {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList<>())));
        System.out.println(getGetTimeInMs(fill(new LinkedList<>())));
    }

    public static List<Object> fill(List<Object> list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List<Object> list) {
        // write your code here
        Date start = new Date();
        get10000(list);
        Date end = new Date();
        return end.getTime() - start.getTime();

        // write your code here

    }

    public static void get10000(List<Object> list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }

}
