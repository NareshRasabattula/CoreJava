package com.durga.default_methods;

import com.durga.model.Person;
import com.durga.model.PersonOne;

import java.util.Arrays;
import java.util.List;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PersonDetailImpl implements PersonDetails {
    @Override
    public double calculateTotalSalary(List<PersonOne> personList) {
        return personList.stream().map(PersonOne :: getSalary)
                .reduce(0d, (x,y)-> x+y);
    }

    public int totalKids(List<PersonOne> personList) {
        return (10+10);
    }

    static List<String> personNames(List<PersonOne> personList){
        return Arrays.asList("One","Two");
    }

}
