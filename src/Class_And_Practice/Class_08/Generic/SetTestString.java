package Class_And_Practice.Class_08.Generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTestString {
    public static void main(String[] args) {
        System.out.println("Set Test String------------------>");
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(30); //Duplicate will not be added because Hashset is Unique

        integerSet.remove(20);
        integerSet.add(50);
        integerSet.add(100);

        System.out.println("Set Contains: -------------------->");
//        for (Integer integer : integerSet) {
//            System.out.println(integer);
//        }

        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.addAll(Arrays.asList(100, 200, 300));
        integerSet.addAll(anotherSet);

        for (Integer integer : integerSet) {
            System.out.println(integer);
        }
    }
}
