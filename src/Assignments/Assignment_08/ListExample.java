package Assignments.Assignment_08;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Eggs"); // duplicate allowed

        System.out.println("Shopping List (List Example):");
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}