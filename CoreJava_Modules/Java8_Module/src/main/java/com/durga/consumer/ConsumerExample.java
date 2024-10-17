package com.durga.consumer;

import java.util.function.Consumer;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
        //con1.accept("java8");
        Consumer<String> con2 = (s) -> System.out.println(s.toLowerCase());
        //con2.accept("java8");
        con1.andThen(con2).accept("java8");
    }
}
