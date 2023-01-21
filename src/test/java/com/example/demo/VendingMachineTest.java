//package com.example.demo;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class VendingMachineTest {
////    Given: Add at least these items. Coke for 40. Lays for 10.
////    Refactor tests
//    VendingMachine vm = new VendingMachine();
//
//    @Test
//    public void getTotalValueAsZeroWhenNothingIsAdded() {
//        Double totalCost = vm.getTotalCost();
//        Double expectedTotalCost = 0D;
//        Assertions.assertEquals(expectedTotalCost, totalCost);
//    }
//
//    @Test
//    public void testGetTotalCost() {
//        vm.selectItem("Coke");
//        vm.selectItem("Lays");
//        Double totalCost = vm.getTotalCost();
//        Double expectedTotalCost = 50D;
//        Assertions.assertEquals(expectedTotalCost, totalCost);
//    }
//
//    @Test
//    public void testInvalidSelection() {
//        vm.selectItem("Invalid Item");
//        Double totalCost = vm.getTotalCost();
//        Assertions.assertEquals(0, totalCost);
//    }
//
//}
