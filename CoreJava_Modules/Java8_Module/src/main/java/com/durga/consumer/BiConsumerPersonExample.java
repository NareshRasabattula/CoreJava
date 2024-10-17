package com.durga.consumer;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class BiConsumerPersonExample {
    static void printPersonDetails() {
        BiConsumer<String, List<String>> personConsumer = (name, hobbies) -> System.out.println(name +" "+hobbies);
        BiConsumer<String, Double> salaryConsumer = (name, salary) -> System.out.println(name +" "+salary);

        List<PersonOne> personList = PersonRepository.getAllPersons();

        //personList.forEach(per -> personConsumer.accept(per.getName(), per.getHobbies()));
        personList.forEach(per -> {
            personConsumer.accept(per.getName(), per.getHobbies());
            salaryConsumer.accept(per.getName(),per.getSalary());
        });
    }

    public static void main(String[] args) {
        printPersonDetails();
    }
}
