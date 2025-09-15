package Class_And_Practice.Class_06;

public class AbstratClassTest {
    public static void main(String[] args) {
        Summation sum = new Summation();
        System.out.println("Sum with no parameters: " + sum.add());
        System.out.println("Sum with one parameters: " + sum.add(100));
        System.out.println("Sum with two parameters: " + sum.add(10, 20));
        System.out.println("Sum with three parameters: " + sum.add(10, 20, 30));
        System.out.println("Sum with two parameters: " + sum.add(10.5, 20.5));
    }
}
