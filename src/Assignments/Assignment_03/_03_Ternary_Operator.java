package Assignments.Assignment_03;

public class _03_Ternary_Operator {
    public static void main(String[] args) {
        int a = 15, b = 25;

        // Find minimum using ternary operator
        int min = (a < b) ? a : b;
        System.out.println("Minimum = " + min);

        // Find maximum using ternary operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
    }
}
