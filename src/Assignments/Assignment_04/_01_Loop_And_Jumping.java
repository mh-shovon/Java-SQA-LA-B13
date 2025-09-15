package Assignments.Assignment_04;

public class _01_Loop_And_Jumping {
        public static void main(String[] args) {

            // For Loop Example
            System.out.println("<-----For Loop Example ----->");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Number: " + i);
            }

            // While Loop Example
            System.out.println("\n<----- While Loop Example ----->");
            int j = 1;
            while (j <= 5) {
                System.out.println("Value: " + j);
                j++;
            }

            // Do-While Loop Example
            System.out.println("\n<----- Do-While Loop Example ----->");
            int k = 1;
            do {
                System.out.println("Count: " + k);
                k++;
            } while (k <= 5);

            // Break Example
            System.out.println("\n<----- Break Example ----->");
            for (int x = 1; x <= 10; x++) {
                if (x == 5) {
                    System.out.println("Breaking at x = " + x);
                    break;
                }
                System.out.println("x = " + x);
            }

            // Continue Example
            System.out.println("\n<----- Continue Example ----->");
            for (int y = 1; y <= 10; y++) {
                if (y % 2 == 0) {
                    continue;
                }
                System.out.println("Odd number: " + y);
            }
        }
}
