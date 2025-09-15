package Class_And_Practice.Class_06;

public abstract class CalculatorAbstraction {
    // Method 1: No parameter
    public abstract int add();

    // Method 2: One parameter
    public int add(int a) {
        return a;
    }

    // Method 3: Two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method 4: Three parameters
    public abstract int add(int a, int b, int c);

    public double add(double a, double b) {
        return a + b;
    }
}
