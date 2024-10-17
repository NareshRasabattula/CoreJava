package com.durga.consumer;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FunctionPersonExample {
    static Function<String, Integer> f1 = name -> name.length();
    static Predicate<PersonOne> p1 = per -> per.getHeight() >= 140;

    static Predicate<PersonOne> p2 = per -> per.getGender().equals("Male");

    static Function<List<PersonOne>, Map<String,Double>> f2 = personList -> {
        Map<String,Double> map = new HashMap<String,Double>();
        personList.forEach(per -> {
            if(p1.and(p2).test(per))
                map.put(per.getName(), per.getSalary());
        });
        return map;
    };

    public static void main(String[] args) {
        //System.out.println(f1.apply("java features"));
        List<PersonOne> personList = PersonRepository.getAllPersons();
        Map<String,Double> map = f2.apply(personList);
        System.out.println("Result :"+map);
    }
}
