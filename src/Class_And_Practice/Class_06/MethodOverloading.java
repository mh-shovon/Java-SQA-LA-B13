package Class_And_Practice.Class_06;

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add());
        System.out.println(calc.add(10));
        System.out.println(calc.add(5, 10));
        System.out.println(calc.add(5, 10, 20));
        System.out.println(calc.add(5, 10, 20, 30));
    }
}
