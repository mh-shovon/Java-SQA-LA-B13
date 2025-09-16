package Assignments.Assignment_03;

public class _02_Logical_Operator {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        System.out.println("(a < b && b < c) : " + (a < b && b < c)); // true
        System.out.println("(a > b || b < c) : " + (a > b || b < c)); // true
        System.out.println("!(a > b) : " + !(a > b));                 // true
    }
}
