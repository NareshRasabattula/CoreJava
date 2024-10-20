package com.durga.programs;

import com.durga.model.Order;
import com.durga.model.Stock;
import com.durga.model.Trade;

import java.util.stream.Stream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class NestedFunctionOrderBuilder {
    public static Order order(String customer, Trade... trades) {
        Order order = new Order();
        order.setCustomer( customer );
        Stream.of(trades).forEach( order::addTrade );
        return order;
    }

    public static Trade buy(int quantity, Stock stock, double price) {
        return buildTrade( stock, price, Trade.Type.BUY );
    }

    public static Trade sell(int quantity, Stock stock, double price) {
        return buildTrade( stock, price, Trade.Type.SELL );
    }

    private static Trade buildTrade( Stock stock, double price, Trade.Type buy ) {
        Trade trade = new Trade();
        trade.setType( buy );
        trade.setStock( stock );
        trade.setPrice( price );
        return trade;
    }

    public static double at(double price) {
        return price;
    }

    public static Stock stock(String symbol, String market) {
        Stock stock = new Stock();
        stock.setSymbol( symbol );
        stock.setMarket( market );
        return stock;
    }

    public static String on(String market) {
        return market;
    }
}
