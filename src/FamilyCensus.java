public class FamilyCensus {
    public static void main(String[] args) {
        // write your code here
        Human father = new Human("name", 49,true);
        Human father1 = new Human("name", 38,true);
        Human mother = new Human("name", 35,false);
        Human mother1 = new Human("name", 35,false);
        Human mother2 = new Human("name", 35,false, "father", "mother" );
        Human mother3 = new Human("name", 39,true, "father", "mother" );
        Human mother4 = new Human("name", 42,false, "father", "mother" );
        Human mother5 = new Human("name", 42,true, "father", "mother" );
    }

    public static class Human {
        // write your code here
        String name;
        int age;
        boolean sex;
        String father ;
        String mother;

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, int age, boolean sex, String father, String mother) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }

            return text;
        }
    }

}
