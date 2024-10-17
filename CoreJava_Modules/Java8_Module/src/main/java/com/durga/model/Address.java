package com.durga.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Address {
    String block, city, state, country;
    int pincode;
}
