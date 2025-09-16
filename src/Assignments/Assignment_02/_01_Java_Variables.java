package Assignments.Assignment;

public class _01_Java_Variables {
    // Instance variables (each object gets its own copy)
    int rollNumber = 1;
    String name = "Shovon";

    // Static Variable
    static double monthlyIncome = 500;

    // Method-1
    public void method1() {
        int localVariable = 5; // Local Variable
        System.out.println("Local Variable: " + localVariable);
        System.out.println("Get the access of instance variable rollNumber inside the method: " + rollNumber);
        System.out.println("Get the access of instance variable name inside the method: " + name);
    }

    // Method-2
    public static void method2() {
        double localStaticVariable = 10; // Local Static Variable
        System.out.println("Local Static Variable: " + localStaticVariable);
        /* Inside a static method, you can directly access only static variables. To access instance variables, you must either:
                -> create an object and access them via that object, or
                -> declare them as static so they belong to the class instead of an object.
         */

        // System.out.println("Get the access of instance variable inside the method: " + rollNumber); // Error
        //System.out.println("Get the access of instance variable inside the method: " + name); // Error
        System.out.println("Get the access of static variable inside the method: " + monthlyIncome); //We can access this because it is a static variable
    }

    public static void main(String[] args) {
        _01_Java_Variables obj = new _01_Java_Variables();
        obj.method1(); // Call non-static method using object
        _01_Java_Variables.method2(); // Call static method using class name
    }
}
