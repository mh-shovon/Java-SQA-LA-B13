package Assignments.Assignment;

public class _04_Java_Unary_Operator {
    public static void main(String[] args) {
        int a = 10;

        System.out.println("Initial value of a: " + a);

        // Pre-increment (++a)
        System.out.println("Pre-increment (++a): " + (++a)); // a becomes 11, then printed

        // Post-increment (a++)
        System.out.println("Post-increment (a++): " + (a++)); // prints 11, then a becomes 12
        System.out.println("Value of a after Post-increment: " + a);

        // Pre-decrement (--a)
        System.out.println("Pre-decrement (--a): " + (--a)); // a becomes 11, then printed

        // Post-decrement (a--)
        System.out.println("Post-decrement (a--): " + (a--)); // prints 11, then a becomes 10
        System.out.println("Value of a after Post-decrement: " + a);
    }
}
