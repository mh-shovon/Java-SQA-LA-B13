package Assignments.Assignment_05._02_Polymorphism.Method_Overriding;

class OverridingDemo {
    public static void main(String[] args) {
        BangladeshBank bdb = new BangladeshBank();
        double interestRate2 = bdb.getInterestRate();
        System.out.println("Interest rate is: " + interestRate2);

        System.out.println("-----------------------------------");

        BracBank bracBank = new BracBank();
        double interestRate1 = bracBank.getInterestRate();
        System.out.println("Interest rate is: " + interestRate1);

        System.out.println("-----------------------------------");

        CityBank cb = new CityBank();
        double interestRate3 = cb.getInterestRate();
        System.out.println("CityBank Interest rate is: " + interestRate3);
    }
}