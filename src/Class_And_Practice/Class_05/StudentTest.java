package Class_And_Practice.Class_05;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("<----------alice---------->");
        Student_One alice = new Student_One();
        alice.displayStudentInfo();

        System.out.println("<----------bob---------->");
        Student_One bob = new Student_One();
        bob.displayStudentInfo();

        System.out.println("<----------charlie---------->");
        Student_One charlie = new Student_One("Charlie", 22, 3.66);
        charlie.displayStudentInfo();
        System.out.println(charlie.isEligibleForScholarship());

        System.out.println("<----------daniel---------->");
        Student_One daniel = new Student_One("Daniel", 21, 3.25);
        daniel.displayStudentInfo();
        System.out.println(daniel.isEligibleForScholarship());
    }
}
