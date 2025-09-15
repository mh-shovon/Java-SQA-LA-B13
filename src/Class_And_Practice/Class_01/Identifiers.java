package Class_And_Practice.Class_01;
public class Identifiers {
    public static void main(String[] args) {
        //Rule-1 :: Identifiers can only contain alphanumeric characters [a-z] [A-Z] [0-9] , dollar sign ($) and underscore ( _ ). No other character is allowed.
            int age = 25;          // letters only
            int Age123 = 30;       // letters + digits
            int _count = 5;        // starts with underscore
            int $price = 100;      // starts with dollar sign
            int student_id = 2025; // underscore in between

        //Rule-2 :: Identifiers cannot start with a numeric value [0-9]. The starting character should be alphabet [A-Z] [a-z], dollar ($) or underscore ( _ ).
        /*
            int 1number = 10;   //starts with numeric value
            String 99name = "Shovon"; //starts with numeric value
        */

        //Rule-3 :: Identifiers should not contain spaces in their name.
        /*
            int student id = 10;   // space in between student and id
            float account balance = 200.50f;   // space in between account and balance
            String first name = "Mehedi";   // space in between first and name
        */

        // Rule-4 :: Java Identifiers are Case Sensitive. Eg: ‘Vendetta’ and ‘vendetta’ are considered two different identifiers.
            int Number = 100; // Output: 100
            int number = 200; // Output: 100
            int NUMBER = 300; // Output: 100

        // Rule-5 :: Reserve Keywords cannot be used as Identifiers. Java defines a total of 53 reserved keywords that are predefined. Eg: int, float, public, static, etc.
        /*
            int public = 5;   // Error- Because public is a keyword
            int class = 100; // Error- Because class is a keyword
        */

        System.out.println("Valid Identifiers ------------------>");
        System.out.println("age: " + age);
        System.out.println("Age123: " + Age123);
        System.out.println("_count: " + _count);
        System.out.println("$price: " + $price);
        System.out.println("student_id: " + student_id);
        System.out.println("Number: " + Number);
        System.out.println("number: " + number);
        System.out.println("NUMBER: " + NUMBER);
    }
}
