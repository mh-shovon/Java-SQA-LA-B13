package Class_And_Practice.Class_08.Generic;

public class GenericWildCardTest {
    public static void main(String[] args) {
        System.out.println("GenericWildCardTest Integer Test------------------>");
        GenericWildCard<Integer> intGeneric = new GenericWildCard<>(100);
        System.out.println("Generic Integer Value: " + intGeneric.getValue());

        System.out.println("\nGeneric Double Test----------------->");
        GenericWildCard<Double> doubleGeneric = new GenericWildCard<>(99.99);
        System.out.println("Generic Double Value: " + doubleGeneric.getValue());

        System.out.println("\nGeneric Float Test----------------->");
        GenericWildCard<Float> floatGeneric = new GenericWildCard<>(10.10f);  // শুধু single character
        System.out.println("Generic Float Value: " + floatGeneric.getValue());

        System.out.println("\nGeneric Long Test----------------->");
        Generic<Long> longGeneric = new Generic<>(123456789L);
        System.out.println("Generic Long Value: " + longGeneric.getValue());
    }
}

