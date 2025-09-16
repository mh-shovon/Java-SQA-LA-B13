package Assignments.Assignment_05._03_Encapsulation.Wrapper;

class EncapsulationDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(5000);  // Writing data securely
        System.out.println("Balance: " + acc.getBalance()); // Reading data
    }
}