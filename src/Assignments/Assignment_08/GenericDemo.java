package Assignments.Assignment_08;

public class GenericDemo {
    public static void main(String[] args) {
        GenericClass<String> strObj = new GenericClass<>("Hello World");
        GenericClass<Integer> intObj = new GenericClass<>(12345);

        String str = strObj.getData();
        Integer num = intObj.getData();

        System.out.println("String Value: " + str);
        System.out.println("Integer Value: " + num);
    }
}