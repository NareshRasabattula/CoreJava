package com.durga.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@Setter
public class Order {
    private String customer;

    private List<Trade> trades = new ArrayList<>();

    public double getValue() {
        return trades.stream().mapToDouble( Trade::getValue ).sum();
    }

    public void addTrade( Trade trade ) {
        trades.add( trade );
    }
}
