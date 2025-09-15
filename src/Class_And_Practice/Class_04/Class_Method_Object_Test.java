package Class_And_Practice.Class_04;

class Class_Method_Object_Test {

    // Addition
    public int add(int a, int b) {
        return a + b;
    }

    // Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication
    public int multiply(int a, int b) {
        return a * b;
    }

    // Division
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed!");
            return 0;
        }
        return (double) a / b;
    }

    // Modulus (remainder)
    public int modulus(int a, int b) {
        return a % b;
    }

    // Main method to test
    public static void main(String[] args) {
        Class_Method_Object_Test calc = new Class_Method_Object_Test();

        int x = 20, y = 6;

        System.out.println("Addition: " + calc.add(x, y));
        System.out.println("Subtraction: " + calc.subtract(x, y));
        System.out.println("Multiplication: " + calc.multiply(x, y));
        System.out.println("Division: " + calc.divide(x, y));
        System.out.println("Modulus: " + calc.modulus(x, y));
    }
}
