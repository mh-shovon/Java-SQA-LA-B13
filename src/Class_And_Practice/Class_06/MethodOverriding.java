package Class_And_Practice.Class_06;

public class MethodOverriding {
    public static void main(String[] args) {
        BracBank bb = new BracBank();
        double interestRate = bb.getInterestRate();
        System.out.println("Interest rate is: " + interestRate);

        System.out.println("-----------------------------------");

        BangladeshBank bdb = new BangladeshBank();
        double interestRate2 = bdb.getInterestRate();
        System.out.println("Interest rate is: " + interestRate2);

        System.out.println("-----------------------------------");

        CityBank cb = new CityBank();
        double interestRate3 = cb.getInterestRate();
        System.out.println("CityBank Interest rate is: " + interestRate3);

        System.out.println("-----------------------------------");

        DutchBanglaBank dbbl = new DutchBanglaBank();
        double interestRate4 = dbbl.getInterestRate();
        System.out.println("DutchBanglaBank Interest rate is: " + interestRate4);
    }
}
