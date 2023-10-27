package ua.edu.ucu.apps.flowerstore.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @GetMapping("/")
    String whatNext() {
        return "If you want to pay by credit card" + 
        " add card/ to your URL if by paypal paypal/";
    }
    @GetMapping("/paypal/")
    public String paymentPayPal() {
        PayPalPaymentStrategy method = new PayPalPaymentStrategy();
        double price = 1000;
        return method.pay(price);
    }

    @GetMapping("/card/")
    public String paymentCard() {
        CreditCardPaymentStrategy method = new CreditCardPaymentStrategy();
        double price = 1000;
        return method.pay(price);
    }
}
