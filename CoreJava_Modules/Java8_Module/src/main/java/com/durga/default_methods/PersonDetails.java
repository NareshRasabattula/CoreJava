package com.durga.default_methods;

import com.durga.model.Person;
import com.durga.model.PersonOne;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public interface PersonDetails {
    double calculateTotalSalary(List<PersonOne> personList);

    default int totalKids(List<PersonOne> personList) {
        return personList.stream().map(PersonOne::getKids).reduce(0, (x,y)-> x+y);
    }

    static List<String> personNames(List<PersonOne> personList){
        return personList.stream().map(PersonOne :: getName).collect(Collectors.toList());
    }
}
