package com.durga.consumer;

import java.util.function.Function;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FunctionExample {
    static Function<String, String> f1 = String::toUpperCase;
    static Function<String, String> f2 = name -> name.toUpperCase().concat(" features");

    public static void main(String[] args) {
        //System.out.println("Result 1:"+f1.apply("java"));
        //System.out.println("Result 2:"+f2.apply("java"));
        System.out.println("And Then Result :"+ f1.andThen(f2).apply("java"));
        System.out.println("Compose Result :"+f1.compose(f2).apply("java"));
    }
}
