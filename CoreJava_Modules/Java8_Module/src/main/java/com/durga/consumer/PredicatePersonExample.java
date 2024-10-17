package com.durga.consumer;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PredicatePersonExample {
    static Predicate<PersonOne> p1 = per -> per.getHeight() >= 140;

    static Predicate<PersonOne> p2 = per -> per.getGender().equals("Male");

    public static void main(String[] args) {
        List<PersonOne> personList = PersonRepository.getAllPersons();

        personList.stream()
                .filter(p1)
                .collect(Collectors.toList());

        personList.forEach(per -> {
            if(p1.and(p2).test(per)) {
                System.out.println(per);
            }
        });
    }
}
