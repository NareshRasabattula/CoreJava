package com.durga.consumer;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ConsumerPredicateExample {
    static Predicate<PersonOne> p1 = per -> per.getHeight() >= 140;

    static Predicate<PersonOne> p2 = per -> per.getGender().equals("Male");

    static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");

    static BiConsumer<String, List<String>> hobbiesConsumer = (name, hobbies) -> System.out
            .println(name + " " + hobbies);

    static Consumer<PersonOne> personConsumer = per -> {
        //if (p1.and(p2).test(per)) {
        if(p3.test(per.getHeight(), per.getGender())) {
            hobbiesConsumer.accept(per.getName(), per.getHobbies());
        }
    };

    public static void main(String[] args) {
        List<PersonOne> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);

    }
}
