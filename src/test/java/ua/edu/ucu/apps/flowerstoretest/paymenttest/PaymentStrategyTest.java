package ua.edu.ucu.apps.flowerstoretest.paymenttest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.edu.ucu.apps.flowerstore.payment.CreditCardPaymentStrategy;
import ua.edu.ucu.apps.flowerstore.payment.PayPalPaymentStrategy;

public class PaymentStrategyTest {
    private PayPalPaymentStrategy payPalPayment;
    private CreditCardPaymentStrategy cardPayment;
    @BeforeEach
    public void init() {
        payPalPayment = new PayPalPaymentStrategy();
        cardPayment = new CreditCardPaymentStrategy();
    }

    @Test
    public void testPayment() {
        double price = 1000;
        String payment = payPalPayment.pay(price);
        String testEquals = "Paying 1000.0 tugrykiv by credit card";
        Assertions.assertEquals("Paying 1000.0 tugrykiv by paypal", payment);
        Assertions.assertEquals(testEquals, cardPayment.pay(price));
        
    }
}
