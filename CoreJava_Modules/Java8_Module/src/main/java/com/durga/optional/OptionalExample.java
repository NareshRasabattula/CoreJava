package com.durga.optional;

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
public class OptionalExample {
    public static void main(String[] args) {
        //System.out.println("Result :"+myName("John"));
        Optional<String> name = Optional.ofNullable(myName("John"));
        //String name1 = Optional.ofNullable(myName("John")).get();
        //System.out.println(name.isPresent() ? name.get():"No Data Found");
        //System.out.println("Person Name :"+personName(new Person()));
        Optional<String> personName = personNameWithOptional(PersonRepository.getPersonOptional());
        System.out.println("The Optional Person Name is :"+personName.get());

    }

    static String myName(String name) {
        return name;
    }

    static String personName(Person per) {
        if(per!=null)
            return per.getName();
        else
            return "No Data Found";
    }

    static Optional<String> personNameWithOptional(Optional<PersonOne> per){
        if(per.isPresent())
            return per.map(PersonOne :: getName);
        else
            return Optional.empty();
    }
}
