//package com.example.demo;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BankAccountTest {
//    @Test
//    public void testDeposit() {
//        BankAccount account = new BankAccount();
//        account.deposit(100);
//        assertEquals(100, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testWithdraw() {
//        BankAccount account = new BankAccount();
//        account.deposit(100);
//        account.withdraw(50);
//        assertEquals(50, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testWithdrawInsufficientFunds() {
//        BankAccount account = new BankAccount();
//        account.deposit(50);
//        account.withdraw(100);
//        assertEquals(50, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testNegativeDeposit() {
//        BankAccount account = new BankAccount();
//        account.deposit(-100);
//        assertEquals(0, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testNegativeWithdraw() {
//        BankAccount account = new BankAccount();
//        account.deposit(100);
//        account.withdraw(-50);
//        assertEquals(100, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testOverflowDeposit() {
//        BankAccount account = new BankAccount();
//        account.deposit(Double.MAX_VALUE);
//        assertEquals(Double.MAX_VALUE, account.getBalance(), 0);
//    }
//
//    @Test
//    public void testOverflowWithdraw() {
//        BankAccount account = new BankAccount();
//        account.deposit(Double.MAX_VALUE);
//        account.withdraw(Double.MAX_VALUE);
//        assertEquals(0, account.getBalance(), 0);
//    }
//
//}
