//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class MortgageCalculatorTest {
//    private static final float DELTA = 1e-6f;
//    private MortgageCalculator calculator = new MortgageCalculator();
//
//    @Test
//    public void testCalculateMortgage() {
//        float principal = 100000;
//        float interestRate = 3.92f;
//        int period = 30;
//
//        float expectedMortgage = 472.8128f;
//        float actualMortgage = calculator.calculateMortgage(principal, interestRate, period);
//        assertEquals(expectedMortgage, actualMortgage, DELTA);
//    }
//}