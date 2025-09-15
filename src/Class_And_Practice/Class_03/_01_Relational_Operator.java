package Class_And_Practice.Class_03;

public class _01_Relational_Operator {
    public static void main(String[] args) {
        int a = 10, b = 20;

        System.out.println("a < b : " + (a < b));    // true
        System.out.println("a > b : " + (a > b));    // false
        System.out.println("a <= b : " + (a <= b));  // true
        System.out.println("a >= b : " + (a >= b));  // false
        System.out.println("a == b : " + (a == b));  // false
        System.out.println("a != b : " + (a != b));  // true

        String str = "SQA Learning Academy";
        boolean check = str instanceof String;  // instanceof check
        System.out.println("str instanceof String : " + check);
    }
}
