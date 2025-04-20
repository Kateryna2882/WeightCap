import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CatCode {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            String age = reader.readLine();
            String weight = reader.readLine();
            String tailLength = reader.readLine();

            if (name == null || name.isEmpty()) {
                break;
            }

            Cat cat = new Cat(name, Integer.parseInt(age), Integer.parseInt(weight), Integer.parseInt(tailLength));
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private final String name;
        private final int age;
        private final int weight;
        private final int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
