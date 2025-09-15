package Assignments.Assignment_05._02_Polymorphism.Constructor_Overloading;

class Student {
    String name;
    int age;

    // Constructor 1
    Student(String n) {
        name = n;
        age = 0;
    }

    // Constructor 2
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}