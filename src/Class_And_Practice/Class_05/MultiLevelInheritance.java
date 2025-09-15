package Class_And_Practice.Class_05;

public class MultiLevelInheritance {
    public static void main(String[] args) {
        // GraduateStudent Class inherits properties and methods from Student Class and Person Class

        GraduateStudent graduateStudent1 = new GraduateStudent();
        graduateStudent1.name = "John";
        graduateStudent1.rollNumber = 201;
        graduateStudent1.researchTopic = "Quantum Computing";
        graduateStudent1.displayPersonInfo();
        graduateStudent1.displayStudentInfo();
        graduateStudent1.displayResearchInfo();

        GraduateStudent graduateStudent2 = new GraduateStudent();
        graduateStudent2.name = "Cena";
        graduateStudent2.rollNumber = 202;
        graduateStudent2.researchTopic = "Quantum Computing";
        graduateStudent2.displayPersonInfo();
        graduateStudent2.displayStudentInfo();
        graduateStudent2.displayResearchInfo();
    }
}
