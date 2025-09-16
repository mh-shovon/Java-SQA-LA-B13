package Assignments.Assignment_05._03_Encapsulation.Wrapper;

class Account {
    private double balance;  // data hide

    // Write method (Setter)
    public void setBalance(double amount) {
        if (amount > 0) {
            balance = amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Read method (Getter)
    public double getBalance() {
        return balance;
    }
}