package com.durga.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PersonOne {
    private String name;
    private int height;
    private double salary;
    private String gender;
    private int kids;
    List<String> hobbies = new ArrayList<>();
    Optional<Address> address;


    public <T> PersonOne(String name, int height, double salary,
                         String gender, int kids, List<T> hobbies) {
        this.name = name;
        this.height = height;
        this.salary = salary;
        this.gender = gender;
        this.kids = kids;
        this.hobbies = (List<String>) hobbies;
    }
}
