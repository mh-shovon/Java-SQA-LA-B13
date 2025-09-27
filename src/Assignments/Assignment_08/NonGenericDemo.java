package Assignments.Assignment_08;

public class NonGenericDemo {
    public static void main(String[] args) {
        NonGenericClass obj1 = new NonGenericClass("Hello World");  // String
        NonGenericClass obj2 = new NonGenericClass(12345);          // Integer

        String str = (String) obj1.getData();
        Integer num = (Integer) obj2.getData();

        System.out.println("String Value: " + str);
        System.out.println("Integer Value: " + num);
    }
}