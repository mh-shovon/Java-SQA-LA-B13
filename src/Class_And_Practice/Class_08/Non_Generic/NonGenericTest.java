package Class_And_Practice.Class_08.Non_Generic;

public class NonGenericTest {
    public static void main(String[] args) {
        System.out.println("Non-Generic Integer Test---------------->");
        IntegerTest integerTest = new IntegerTest(20);
        System.out.println("Integer Value: " + integerTest.getValue());

        System.out.println("\nNon-Generic Double Test---------------->");
        DoubleTest doubleTest = new DoubleTest(20.0);
        System.out.println("Double Value: " + doubleTest.getValue());

        System.out.println("\nNon-Generic String Test---------------->");
        StringTest stringTest = new StringTest("Hello");
        System.out.println("String Value: " + stringTest.getValue());

        System.out.println("\nNon-Generic Long Test---------------->");
        LongTest longTest = new LongTest(2000000000000000000L);
        System.out.println("Long Value: " + longTest.getValue());

        System.out.println("\nNon-Generic Boolean Test---------------->");
        BooleanTest booleanTest = new BooleanTest(true);
        System.out.println("Boolean Value: " + booleanTest.getValue());
    }
}
