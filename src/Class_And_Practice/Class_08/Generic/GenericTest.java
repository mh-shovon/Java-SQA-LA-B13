package Class_And_Practice.Class_08.Generic;

import Class_And_Practice.Class_02._02_Java_Elements;

public class GenericTest {
    public static void main(String[] args) {
        System.out.println("Generic Integer Test----------------->");
        Generic<Integer> integerGeneric = new Generic<>(100);
        System.out.println("Generic Integer Value: " + integerGeneric.getValue());

        System.out.println("\nGeneric Double Test----------------->");
        Generic<Double> doubleGeneric = new Generic<>(99.99);
        System.out.println("Generic Double Value: " + doubleGeneric.getValue());

        System.out.println("\nGeneric Long Test----------------->");
        Generic<Long> longGeneric = new Generic<>(123456789L);
        System.out.println("Generic Long Value: " + longGeneric.getValue());

        System.out.println("\nGeneric Float Test----------------->");
        Generic<Float> floatGeneric = new Generic<>(10.10f);  // শুধু single character
        System.out.println("Generic Float Value: " + floatGeneric.getValue());

        System.out.println("\nGeneric String Test----------------->");
        Generic<String> stringGeneric = new Generic<>("Hello Generics");
        System.out.println("Generic String Value: " + stringGeneric.getValue());

        System.out.println("\nGeneric Character Test----------------->");
        Generic<Character> charGeneric = new Generic<>('A');
        System.out.println("Generic Character Value: " + charGeneric.getValue());

        System.out.println("\nGeneric Boolean Test----------------->");
        Generic<Boolean> booleanGeneric = new Generic<>(true);
        System.out.println("Generic Boolean Value: " + booleanGeneric.getValue());

        System.out.println("\nGeneric ClassTest Test----------------->");
        Generic<_02_Java_Elements> classGeneric = new Generic<>(new _02_Java_Elements());
        System.out.println("Generic ClassTest Value: " + classGeneric.getValue());
    }
}
