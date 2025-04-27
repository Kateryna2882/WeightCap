package collections;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SolutionBorn {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Smith", dateFormat.parse("MAY 1 2012"));
        map.put("Johnson", dateFormat.parse("JUNE 1 2012"));
        map.put("Williams", dateFormat.parse("JULY 1 2012"));
        map.put("Brown", dateFormat.parse("AUGUST 1 2012"));
        map.put("Jones", dateFormat.parse("SEPTEMBER 1 2012"));
        map.put("Garcia", dateFormat.parse("MAY 1 2012"));
        map.put("Miller", dateFormat.parse("JUNE 1 2012"));
        map.put("Davis", dateFormat.parse("JUNE 1 2012"));
        map.put("Rodriguez", dateFormat.parse("JUNE 1 2012"));
        map.put("Martinez", dateFormat.parse("JUNE 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {

    }
}
