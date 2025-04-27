package collections;

import java.util.Set;

public class AnimalSet {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<Cat>();

        //write your code here

        return result;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        return null;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        return null;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
    }

    //write your code here

}
