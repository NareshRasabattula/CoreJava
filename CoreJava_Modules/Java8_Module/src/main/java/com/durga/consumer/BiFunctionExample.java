package com.durga.consumer;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class BiFunctionExample {
    static BiFunction<String, String, String> bf1 = (a,b) -> (a+" "+b);

    static Predicate<PersonOne> p1 = per -> per.getHeight() >= 140;

    static Predicate<PersonOne> p2 = per -> per.getGender().equals("Male");

    static BiFunction<List<PersonOne>, Predicate<PersonOne>, Map<String,Double>> bf2 = (listOfPersons, predicate) -> {
        Map<String,Double> map = new HashMap<String,Double>();
        listOfPersons.forEach(per -> {
            if(p1.and(predicate).test(per))
                map.put(per.getName(), per.getSalary());
        });
        return map;
    };

    public static void main(String[] args) {
        //System.out.println("Result :"+bf1.apply("java", "features"));
        List<PersonOne> personList = PersonRepository.getAllPersons();
        Map<String,Double> map = bf2.apply(personList,p2);
        System.out.println("Result :"+map);
    }
}
