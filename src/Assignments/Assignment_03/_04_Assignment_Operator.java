package Assignments.Assignment_03;

public class _04_Assignment_Operator {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Initial x = " + x);

        x += 5; // x = x + 5
        System.out.println("After x += 5 : " + x);

        x -= 3; // x = x - 3
        System.out.println("After x -= 3 : " + x);

        x *= 2; // x = x * 2
        System.out.println("After x *= 2 : " + x);

        x /= 4; // x = x / 4
        System.out.println("After x /= 4 : " + x);

        x %= 3; // x = x % 3
        System.out.println("After x %= 3 : " + x);
    }
}
