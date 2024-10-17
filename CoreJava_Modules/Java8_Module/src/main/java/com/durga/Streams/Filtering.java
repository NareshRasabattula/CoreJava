package com.durga.Streams;

import com.durga.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class Filtering {
    public static boolean filterPeople(Person p) {
        return p.getName().length() < 5 && p.getAge() > 30;
    }

    public static void main(String[] args) {
        IntStream.range(0, 20)
                .filter(a -> a % 2 == 0)
                .forEach(System.out::println);

        var list1 = List.of("hello", "to", "you", "how", "are", "you", "today");

        list1.stream().filter(s -> s.length() == 3).forEach(System.out::println);

        List<Person> people = new ArrayList<>();
        people.add(new Person("Bob", 32));
        people.add(new Person("Sue", 63));
        people.add(new Person("Claire", 19));
        people.add(new Person("Rog", 28));

        people.stream().filter(p -> p.getAge() < 32).forEach(System.out::println);
        System.out.println();

        people.stream()
                .filter(p -> p.getAge() > 19)
                .filter(p -> p.getAge() < 60)
                .forEach(System.out::println);

        System.out.println();

        List<Person> people2 = new ArrayList<>(people.stream()
                .filter(Filtering::filterPeople)
                .toList());

        people2.add(new Person("Gary", 26));

        System.out.println(people2);

        System.out.println();
        Map<String, Integer> map1 = Map.of("Simon", 25, "Gary", 30, "Raj", 24);

        map1.forEach((key, value) -> System.out.println(key + ", " + value));
        System.out.println();
        map1.entrySet().forEach(System.out::println);
    }
}
