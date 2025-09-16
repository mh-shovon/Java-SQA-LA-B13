package Assignments.Assignment_05._03_Encapsulation.Modifier_Or_Security;

class Person {
    private String name;  // only accessible inside class
    private int age;

    public void setName(String n) {  // write
        name = n;
    }

    public void setAge(int a) {  // write
        if (a > 0) {
            age = a;
        } else {
            System.out.println("Invalid age");
        }
    }

    public String getName() {  // read
        return name;
    }

    public int getAge() {  // read
        return age;
    }
}