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

        //write your code here
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //write your code here

    }

    public static void main(String[] args) {

    }

}
