package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class Minimum {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> list) {
        // Find the minimum here
        int min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Integer current = list.get(i);
            if (current < min) {
                min = current;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        List<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

}
