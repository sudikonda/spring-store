package com.me.store.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StripePaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        log.info("Payment Service: {}, Amount: {}", "STRIPE", amount);
    }
}
