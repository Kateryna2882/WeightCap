public class FamilyCensus {
    public static void main(String[] args) {
        Human paternalGrandfather = new Human("Pitt", true, 61);
        Human paternalGrandmother = new Human("Maria", false, 60);
        Human maternalGrandfather = new Human("Alex", true, 63);
        Human maternalGrandmother = new Human("Helen", false, 62);
        Human father = new Human("Max", true, 35, paternalGrandfather, paternalGrandmother);
        Human mother = new Human("Arianna", false, 30, maternalGrandfather, maternalGrandmother);
        Human firstChild = new Human("Arnold", true, 15, father, mother);
        Human secondChild = new Human("Silvester", false, 10, father, mother);
        Human thirdChild = new Human("Jack", true, 5, father, mother);

        System.out.println(paternalGrandfather);
        System.out.println(paternalGrandmother);
        System.out.println(maternalGrandfather);
        System.out.println(maternalGrandmother);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(firstChild);
        System.out.println(secondChild);
        System.out.println(thirdChild);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
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






















