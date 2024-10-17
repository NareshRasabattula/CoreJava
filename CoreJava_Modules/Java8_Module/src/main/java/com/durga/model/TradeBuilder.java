package com.durga.model;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class TradeBuilder {
    private Trade trade = new Trade();

    public TradeBuilder quantity(int quantity) {
        trade.setQuantity( quantity );
        return this;
    }

    public TradeBuilder at(double price) {
        trade.setPrice( price );
        return this;
    }

    public StockBuilder stock(String symbol) {
        return new StockBuilder(this, trade, symbol);
    }
}
