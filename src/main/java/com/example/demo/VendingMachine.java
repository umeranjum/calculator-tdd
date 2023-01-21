package com.example.demo;

import java.util.HashMap;

public class VendingMachine {
    //HashMap example
    private HashMap<String, Double> items;
    private double totalCost;

    public VendingMachine() {
        items = new HashMap<>();
        items.put("Lays", 10D);
        totalCost = 0.0;
    }

}
