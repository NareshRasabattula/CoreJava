package com.durga.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;


    public Person(String s) {
        this.name = s;
    }
}
