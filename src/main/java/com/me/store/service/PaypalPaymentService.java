package com.me.store.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service("paypal")
@Slf4j
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        log.info("Payment Service: {}, Amount: {}", "PAYPAL", amount);
    }
}
