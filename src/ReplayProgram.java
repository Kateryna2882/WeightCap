import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//Наразі програма читає рядки з клавіатури, поки ви не введете порожній рядок.
//Усі введені рядки перетворюються у верхній регістр і відображаються на екрані. Наприклад, якщо введено рядок «Мама» , а за ним порожній рядок, тоді має відображатися «МАМА»
//. Модифікована програма повинна читати рядки з клавіатури, поки ви не введете порожній рядок.
//Потім він повинен створити новий список рядків за таким алгоритмом:
//
//якщо вхідний рядок містить парну кількість символів, то рядок повторюється, розділяючись пробілом:
//"qq" -> "qq qq"
//"forty one" -> "forty one сорок один"
//якщо непарне, то воно повторюється тричі:
//"z" -> "zz z"
//"j r" -> "jrjrj r"
//". 1" -> ". 1 . 1 . 1"
//"bug" -> "bug bug bug"
//Програма відобразить вміст нового списку.

public class ReplayProgram {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()) {
                break;
            }
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<>();
        for (String string : strings) {
            String result;
            if (string.length() % 2 == 0) {
                result = string + " " + string;
            } else {
                result = string + " " + string + " " + string;
            }
            resultStrings.add(result);
        }

        for (String resultString : resultStrings) {
            System.out.println(resultString);
        }
    }
}