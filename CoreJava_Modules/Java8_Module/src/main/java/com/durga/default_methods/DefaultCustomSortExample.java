package com.durga.default_methods;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Comparator;
import java.util.List;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class DefaultCustomSortExample {
    static Comparator<PersonOne> c1 = Comparator.comparing(PersonOne :: getName);
    static Comparator<PersonOne> c2 = Comparator.comparingDouble(PersonOne :: getHeight);


    public static void main(String[] args) {
        List<PersonOne> listOfPersons = PersonRepository.getAllPersons();
        //sortByName(listOfPersons);
        //sortByHeight(listOfPersons);
        //sortByHeightandName(listOfPersons);
        //sortByNameWithNull(listOfPersons);
        sortByNameWithNullLast(listOfPersons);
    }

    static void sortByName(List<PersonOne> listOfPersons) {
        listOfPersons.sort(c1);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByHeight(List<PersonOne> listOfPersons) {
        listOfPersons.sort(c2);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByHeightandName(List<PersonOne> listOfPersons) {
        listOfPersons.sort(c1.thenComparing(c2));
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByNameWithNull(List<PersonOne> listOfPersons) {
        Comparator<PersonOne> nullComp = Comparator.nullsFirst(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));
    }

    static void sortByNameWithNullLast(List<PersonOne> listOfPersons) {
        Comparator<PersonOne> nullComp = Comparator.nullsLast(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));
    }
}
