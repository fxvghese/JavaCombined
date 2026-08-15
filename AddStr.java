package mod2;

import java.util.Vector;

public class AddStr {
    public static void main(String[] args) {
        Vector<String> fruits = new Vector<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Guava");
        fruits.add("Cucumber");
        fruits.add("Grapes");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}