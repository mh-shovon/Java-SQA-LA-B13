package Assignments.Assignment_04;

public class _03_Class_Method_Object {
    static class Car {
        // Variables (properties)
        String brand;
        String color;
        int year;

        // Method → set car details
        void setDetails(String b, String c, int y) {
            brand = b;
            color = c;
            year = y;
        }

        // Method → display car details
        void displayDetails() {
            System.out.println("Car Brand: " + brand);
            System.out.println("Car Color: " + color);
            System.out.println("Car Year: " + year);
            System.out.println("--------------------------");
        }

        public static void main(String[] args) {
            // Creating Object
            Car myCar = new Car();

            // Calling Methods
            myCar.setDetails("Toyota", "Red", 2022);
            myCar.displayDetails();

            // Creating Object
            Car anotherCar = new Car();

            // Calling Methods
            anotherCar.setDetails("BMW", "Black", 2024);
            anotherCar.displayDetails();
        }
    }
}