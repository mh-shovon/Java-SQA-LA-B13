package Class_And_Practice.Class_06;

public class Encapsulation {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2020);

        // Access using getters
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());

        // Update using setters
        car1.setBrand("Honda");
        car1.setModel("Civic");
        car1.setYear(2022);

        System.out.println("Updated Brand: " + car1.getBrand());
        System.out.println("Updated Model: " + car1.getModel());
        System.out.println("Updated Year: " + car1.getYear());
    }
}
