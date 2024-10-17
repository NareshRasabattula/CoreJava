package com.durga.Streams;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.*;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CollectorStreamOperations {
    /*
     *
     * counting
     * filtering
     * flatMapping
     * joining
     * mapping
     *
     * averagingDouble
     * averagingInt
     * averagingLong
     *
     * summarizingDouble
     * summarizingInt
     * summarizingLong
     *
     * summingDouble
     * summingInt
     * summingLong
     *
     * reducing
     *
     */
    record Person(String name, int age) {}

    public static void main(String[] args) {

        var people = List.of(
                new Person("Bob", 25),
                new Person("Sue", 32),
                new Person("Rog", 25),
                new Person("Pete", 40),
                new Person("Raj", 32)
        );

        var result1 = people
                .stream()
                .count();
        System.out.println(result1);

        var result2 = people
                .stream()
                .collect(counting());
        System.out.println(result2);

        var result3 = people
                .stream()
                .collect(filtering(p -> p.age() < 40, toList()));
        System.out.println(result3);

        var result4 = people
                .stream()
                .collect(mapping(Person::name, toList()));
        System.out.println(result4);

        Function<Person, String> func = Person::name;
        System.out.println(func.apply(people.get(0)));

        var result5 = people
                .stream()
                .collect(flatMapping(p -> List.of(p.name(), p.age()).stream(), toList()));
        System.out.println(result5);

        var result6 = people
                .stream()
                .map(Person::name)
                .collect(joining(","));
        System.out.println(result6);

        var result7 = people
                .stream()
                .map(Person::name)
                .collect(reducing("", (a, b)->a+b));
        System.out.println(result7);

        var result8 = people
                .stream()
                .collect(averagingInt(Person::age));
        System.out.println(result8);

        var result9 = people
                .stream()
                .collect(summingInt(Person::age));
        System.out.println(result9);

        var result10 = people
                .stream()
                .collect(summarizingInt(Person::age));
        System.out.println(result10);

    }
}
