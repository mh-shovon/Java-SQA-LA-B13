package Class_And_Practice.Class_07;

public class InterfaceTest {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        creditCardPayment.pay(100.0);
        creditCardPayment.refund(50.0);

        Payment payment = new CreditCardPayment();
        payment.pay(1000.0);
        payment.refund(250.0);
    }
}
