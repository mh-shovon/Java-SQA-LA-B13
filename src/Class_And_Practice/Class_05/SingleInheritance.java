package Class_And_Practice.Class_05;

public class SingleInheritance {
    public static void main(String[] args) {
        // Student Class inherits properties nad methods from Person class

        Student student1 = new Student();
        student1.name = "John";
        student1.rollNumber = 100;
        student1.displayPersonInfo();
        student1.displayStudentInfo();

        Student student2 = new Student();
        student2.name = "Weck";
        student2.rollNumber = 101;
        student2.displayPersonInfo();
        student2.displayStudentInfo();
    }
}
