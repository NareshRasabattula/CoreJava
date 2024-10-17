package com.durga.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@Setter
public class Trade {
    public enum Type { BUY, SELL }

    private Type type;

    private Stock stock;

    private int quantity;

    private double price;

    public double getValue() {
        return quantity * price;
    }
}
