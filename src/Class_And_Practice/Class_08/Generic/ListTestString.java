package Class_And_Practice.Class_08.Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTestString {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("World");
        stringList.add("From");
        stringList.add("List");

        System.out.println("After adding values--------------->");
        for(String string : stringList){
            System.out.println(string);
        }

        System.out.println("After removing values--------------->");
        stringList.remove(1);

        for(String string : stringList){
            System.out.println(string);
        }

        System.out.println("After adding a new value at index(1)--------------->");
        stringList.add(1, "Java");

        for(String string : stringList){
            System.out.println(string);
        }

        System.out.println("After adding a new value--------------->");
        stringList.add("Selenium"); // if index is not define then the value should add on the last.

        for(String string : stringList){
            System.out.println(string);
        }

        //Add a new List--------------->

        List<String> anotherList = Arrays.asList("with", "Generics");
        stringList.addAll(anotherList);

        for(String string : anotherList){
            System.out.println(string);
        }

        stringList.removeAll(anotherList);

        System.out.println("List Contents now: ------------------>");
        for(String string : stringList){
            System.out.println(string);
        }
    }
}
