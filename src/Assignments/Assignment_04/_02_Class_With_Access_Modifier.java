package Assignments.Assignment_04;

public class _02_Class_With_Access_Modifier {
    public String name = "Shovon";   // Public → accessible anywhere
    protected int age = 28;          // Protected → same package + subclass
    String city = "Dhaka";           // Default → same package only
    private String jobId  = "J0130"; // Private → only inside this class

    public static void main(String[] args) {
        _02_Class_With_Access_Modifier obj1 = new _02_Class_With_Access_Modifier();
        TestPrivateAccess obj2 = new TestPrivateAccess();

        // All variables accessible inside the same class
        System.out.println("Name (public): " + obj1.name);
        System.out.println("Age (protected): " + obj1.age);
        System.out.println("City (default): " + obj1.city);
        System.out.println("Salary (private): " + obj1.jobId); // Works fine because it is in the same class

        /*
        System.out.println("Employee ID is: " + obj2.accountNumber); // employeeId is not accessible because it is a private variable from other class.
         */
    }
}

