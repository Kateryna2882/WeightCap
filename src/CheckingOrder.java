import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckingOrder {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the word: ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(br.readLine());
            for (String string : list) {
                System.out.println(string);
            }
            String currentString = list.get(0);
            for (int j = 1; j < list.size(); j++) {
                if (list.get(j).equals(currentString)) {
                    if (list.get(i).length() >= currentString.length()) {
                        currentString = list.get(i);
                    } else {
                        System.out.println(i);
                        break;

                    }
                }

            }
        }
    }
}
