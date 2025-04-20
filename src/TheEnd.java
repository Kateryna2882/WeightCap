import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheEnd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> list = new ArrayList<>();
        list.add(reader.readLine());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
