package com.durga.consumer;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.function.Supplier;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class SupplierExample {
    static Supplier<PersonOne> s1 = () -> PersonRepository.getPerson();
    static Supplier<List<PersonOne>> s2 = () -> PersonRepository.getAllPersons();

    public static void main(String[] args) {
        //System.out.println("Result :"+s1.get());
        System.out.println("Result :"+s2.get());
    }
}
