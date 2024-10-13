public class PaymentProcessor {
    public void processPayment() {

        try {
            System.out.println("Processing Payment...");
            System.out.println("Payment processed");
        } catch (Exception e) {
            System.out.println("Payment processing failed");
        }
    }
}
