package collections;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class SoftwareUpdate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) {
                break;
            }
            String family = reader.readLine();

            map.put(city, family);
        }

        String city = reader.readLine();

        if (map.containsKey(city)) {
            String familyName = map.get(city);
            System.out.println(familyName);
        }
    }
}
