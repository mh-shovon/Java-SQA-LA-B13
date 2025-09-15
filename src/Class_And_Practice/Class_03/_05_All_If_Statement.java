package Class_And_Practice.Class_03;

public class _05_All_If_Statement {
    public static void main(String[] args) {

        int number = 15;

        // 1. Simple if
        if (number > 10) {
            System.out.println("Simple if: number is greater than 10");
        }

        // 2. if-else
        if (number % 2 == 0) {
            System.out.println("if-else: number is even");
        } else {
            System.out.println("if-else: number is odd");
        }

        // 3. if-else if ladder
        if (number < 0) {
            System.out.println("if-else if ladder: number is negative");
        } else if (number == 0) {
            System.out.println("if-else if ladder: number is zero");
        } else if (number > 0 && number <= 10) {
            System.out.println("if-else if ladder: number is between 1 and 10");
        } else {
            System.out.println("if-else if ladder: number is greater than 10");
        }

        // 4. Nested if
        if (number > 0) {
            if (number < 20) {
                System.out.println("Nested if: number is positive and less than 20");
            }
        }
    }
}
