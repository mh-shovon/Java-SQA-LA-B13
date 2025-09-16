package Class_And_Practice.Class_07;

public class AbstractClassTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.brakeCar();
        myCar.stop();

        Vehicle myVehicle = new Car();
        myVehicle.start();
        // myVehicle.brakeCar(); //Compile time error.
        myVehicle.stop();
    }
}
