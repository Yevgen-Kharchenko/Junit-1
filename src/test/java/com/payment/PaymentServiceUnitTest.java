package com.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaymentServiceUnitTest {
    private PaymentService paymentService;

    @Before
    public void setUp() throws Exception {
        paymentService = new PaymentService();
    }

    @Test
    public void shouldReturnResultGetPaymentResult() {
        PaymentResult result = paymentService.getPaymentResult();
        assertTrue(PaymentResult.FAILURE == result || PaymentResult.SUCCESS == result);

    }
//   Цей тест не знаходить помилку (+1)

    @Test
    public void shouldReturnResultGetPaymentResulFailure() {
        boolean failure = false;
        for (int i = 0; i < 100; i++) {
            PaymentResult result = paymentService.getPaymentResult();
            if (PaymentResult.FAILURE == result) {
                failure = true;
            }
        }
        assertTrue(failure);
    }

// Цей тест валиться при (+1) і проходить при (+1.5)
    @Test
    public void shouldReturnResultGetPaymentResultSuccess() {

        boolean failure = false;
        for (int i = 0; i < 100; i++) {
            PaymentResult result = paymentService.getPaymentResult();
            if (PaymentResult.SUCCESS == result) {
                failure = true;
            }
        }
        assertTrue(failure);
    }
}



