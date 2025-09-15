package Assignments.Assignment;

public class _03_Java_Arithmetic_Operator {
    public static void main(String[] args) {
        int a = 20;
        int b = 6;

        System.out.println("a = " + a + ", b = " + b);

        // Addition
        int sum = a + b;
        System.out.println("Addition (a + b) = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println("Subtraction (a - b) = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println("Multiplication (a * b) = " + product);

        // Division
        int quotient = a / b; // Integer division
        System.out.println("Division (a / b) = " + quotient);

        // Modulus (remainder)
        int remainder = a % b;
        System.out.println("Modulus (a % b) = " + remainder);
    }
}
