package Class_And_Practice.Class_05;

public class Student_One {
    // Attribute (Fields)
    private String name;
    private int age;
    private double gpa;

    public Student_One() {
        // Default constructor
    }

    public Student_One(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Method to display the student information
    public void displayStudentInfo() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Student Grade : " + gpa);
    }

    public boolean isEligibleForScholarship() {
        return gpa >= 3.50;
    }
}
