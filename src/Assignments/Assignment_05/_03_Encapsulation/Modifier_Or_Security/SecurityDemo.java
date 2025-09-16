package Assignments.Assignment_05._03_Encapsulation.Modifier_Or_Security;

class SecurityDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Mehedi");
        p.setAge(25);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}