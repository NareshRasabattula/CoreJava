package com.durga.consumer;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ConsumerPersonExample {
    static Consumer<PersonOne> c1 = (p) -> System.out.println(p);

    static Consumer<PersonOne> c2 = (p) -> System.out.println(p.getName().toUpperCase());

    static Consumer<PersonOne> c3 = (p) -> System.out.println(p.getHobbies());
    static List<PersonOne> personList = PersonRepository.getAllPersons();

    static void printNameandHobbies() {
        personList.forEach(c1.andThen(c2));
    }

    static void printWithCondition() {
        personList.forEach(p -> { // iterate student
            if(p.getGender().equals("Male") && p.getHeight() >=140) {
                c2.andThen(c3).accept(p);
            }
        });
    }

    public static void main(String[] args) {
        //List<Person> personList = PersonRepository.getAllPersons();
        //c1.accept(PersonRepository.getPerson());
        //c2.accept(PersonRepository.getPerson());
        //c3.accept(PersonRepository.getPerson());
        //c1.andThen(c2).andThen(c3).accept(PersonRepository.getPerson());
        //printNameandHobbies();
        printWithCondition();

    }
}
