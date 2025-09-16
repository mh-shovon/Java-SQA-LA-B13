package Assignments.Assignment;

public class _02_Java_Elements {
    int rollNumber = 30; //Instance Variable
    String name = "ABCD"; //Instance Variable
    static String schoolName = "ABCD School"; // Static Variable

    // Constructor ->It needs to initialize the object, if no constructor then java call the default constructor
    public _02_Java_Elements() { // Constructor

    }

    // Method-1(Instance Method)
    public void displayInfo() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name        : " + name);
        System.out.println("School      : " + schoolName);
    }


    // Method-2(Static Method (it belongs to the class, not object))
    public static void showSchool() {
        System.out.println("All students belong to: " + schoolName);
    }

    // Main method (execution starts here)
    public static void main(String[] args) {
        // Creating Object
        _02_Java_Elements obj = new _02_Java_Elements();
        obj.displayInfo();

        _02_Java_Elements.showSchool(); // Calling the static method
    }
}
