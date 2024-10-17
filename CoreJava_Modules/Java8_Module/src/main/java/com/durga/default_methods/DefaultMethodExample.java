package com.durga.default_methods;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class DefaultMethodExample {
    public static void main(String[] args) {
        List<String> nameList = PersonRepository.getAllPersons()
                .stream()
                .map(PersonOne:: getName)
                .collect(Collectors.toList());
        System.out.println("Before Sort");
        nameList.forEach(name -> System.out.println(name));
        Collections.sort(nameList);
        System.out.println("After Sort");
        nameList.forEach(name -> System.out.println(name));
        System.out.println("Natural Order");
        nameList.sort(Comparator.naturalOrder());
        nameList.forEach(name -> System.out.println(name));
        System.out.println("Reverse Order");
        nameList.sort(Comparator.reverseOrder());
        nameList.forEach(name -> System.out.println(name));
    }
}
