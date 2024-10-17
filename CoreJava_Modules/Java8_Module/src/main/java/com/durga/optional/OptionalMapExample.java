package com.durga.optional;

import com.durga.model.Address;
import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Optional;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class OptionalMapExample {
    public static void main(String[] args) {
        //optionalMapExample();
        //optionalFlatMapExample();
        optionalMapFilterExample();
    }

    static void optionalMapExample() {
        Optional<PersonOne> per = PersonRepository.getPersonOptional();
        per.ifPresent(person -> {
            String name = per.map(PersonOne :: getName).orElse("No Data Found");
            System.out.println("Name :"+name);
        } );
    }

    static void optionalFlatMapExample() {
        Optional<PersonOne> per = PersonRepository.getPersonOptional();
        if(per.isPresent()) {
            Optional<Address> add = per.flatMap(PersonOne :: getAddress);
            System.out.println("Address :"+add.get());
        }
    }

    static void optionalMapFilterExample() {
        Optional<PersonOne> per = PersonRepository.getPersonOptional().filter(person -> person.getHeight() >=140);
        per.ifPresent(person -> System.out.println(person.getAddress().get()));
    }
}
