
interface PaymentProcessor {
    void processPayment(double amount);
}


class PayPal {
    public void sendMoney(double amount) {
        System.out.println("Paid ₹" + amount + " using PayPal.");
    }
}


class Stripe {
    public void makePayment(double amount) {
        System.out.println("Paid ₹" + amount + " using Stripe.");
    }
}

class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendMoney(amount);
    }
}

class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        stripe.makePayment(amount);
    }
}

public class AdapterPatternExample {
    public static void main(String[] args) {
        // Using PayPal via Adapter
        PaymentProcessor paypalProcessor = new PayPalAdapter(new PayPal());
        paypalProcessor.processPayment(1500.00);

        // Using Stripe via Adapter
        PaymentProcessor stripeProcessor = new StripeAdapter(new Stripe());
        stripeProcessor.processPayment(2200.50);
    }
}
