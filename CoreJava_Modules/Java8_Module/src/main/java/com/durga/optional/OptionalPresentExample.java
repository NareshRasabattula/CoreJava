package com.durga.optional;

import java.util.Optional;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class OptionalPresentExample {
    public static void main(String[] args) {
        Optional<String> ofNullable = Optional.ofNullable("JAVA8");
        System.out.println(ofNullable.isPresent() ? ofNullable.get() : Optional.empty());
        ofNullable.ifPresent(s-> System.out.println(s));
    }
}
