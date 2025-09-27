package Assignments.Assignment_08;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("01711111111");
        phoneNumbers.add("01822222222");
        phoneNumbers.add("01711111111"); // duplicate ignored
        phoneNumbers.add("01933333333");

        System.out.println("Phone Numbers (Set Example):");
        for (String number : phoneNumbers) {
            System.out.println(number);
        }
    }
}