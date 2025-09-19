package Class_And_Practice.Class_08.Generic;

import java.util.HashSet;
import java.util.Set;

public class SetTestInteger {
    public static void main(String[] args) {
        System.out.println("Set Test Integer------------------>");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Hello");
        stringSet.add("World");
        stringSet.add("World"); //Duplicate will not be added because Hashset is Unique
        stringSet.add("From");
        stringSet.add("Set");

        System.out.println("Set Contains: -------------------->");
        for (String string : stringSet) {
            System.out.println(string);
        }
    }
}
