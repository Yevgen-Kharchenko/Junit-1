package com.payment;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceServiceUnitTest {
    private PriceService priceService;

    @Before
    public void setUp() throws Exception {
        priceService = new PriceService();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldExceptionValidatePriceIfZero() {
        priceService.validatePrice(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldExceptionValidatePriceIfNegative() {
        priceService.validatePrice(-10);
    }

    @Test()
    public void shouldExceptionValidatePriceIfPositive() {
        priceService.validatePrice(10);

    }
}
