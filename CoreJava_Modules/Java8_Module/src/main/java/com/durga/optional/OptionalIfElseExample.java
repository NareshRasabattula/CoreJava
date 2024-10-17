package com.durga.optional;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;
import java.util.Optional;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class OptionalIfElseExample {
    public static void main(String[] args) {
        //	orElse();
        //orElseGet();
        orElseThrow();
    }

    static void orElse() {
        Optional<PersonOne> person = PersonRepository.getPersonOptional();
        //String name = person.isPresent() ? person.get().getName() : "Data Not Found";
        String name = person.map(PersonOne :: getName).orElse("Data Not Found");
        System.out.println("OrElse Person Name :"+name);
    }

    static void orElseGet() {
        Optional<PersonOne> person = PersonRepository.getPersonOptional();
        String name = person.map(PersonOne :: getName).orElseGet(()-> {
            // to send a notification mail
            // Initiate any script
            return "Data Not Found";
        });
        System.out.println("OrElseGet Person Name :"+name);
    }

    static void orElseThrow() {
        Optional<PersonOne> person = PersonRepository.getPersonOptional();
        //String name = person.isPresent() ? person.get().getName() : "Data Not Found";
        String name = person.map(PersonOne :: getName).orElseThrow(()-> new RuntimeException("Name Not Found"));
        System.out.println("OrElse Person Name :"+name);
    }
}
