package Class_And_Practice.Class_06;

public class Calculator {
    // Method 1: No parameter
    int add() {
        int a = 10;
        int b = 20;
        a = a + b;
        return a;  // default result
    }

    // Method 2: One parameter
    int add(int a) {
        return a;
    }

    // Method 3: Two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method 4: Three parameters
    int add(int a, int b, int c) {
        //return a + b + c;
        return this.add(a+b) + c;
    }

    double add(int a, int b, int c, int d) {
        return this.add(a+b+c+d);
    }
}
