package Assignments.Assignment_05._02_Polymorphism.Method_Overloading;

class OverloadingDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add 2 int: " + calc.add(5, 10));
        System.out.println("Add 2 double: " + calc.add(2.5, 3.7));
        System.out.println("Add 3 int: " + calc.add(1, 2, 3));
    }
}