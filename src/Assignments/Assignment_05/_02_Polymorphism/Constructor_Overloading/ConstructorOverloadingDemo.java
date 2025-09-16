package Assignments.Assignment_05._02_Polymorphism.Constructor_Overloading;

class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rahim");
        Student s2 = new Student("Karim", 22);

        s1.display();
        s2.display();
    }
}