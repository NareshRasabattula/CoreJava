package com.durga.Streams;

import com.durga.model.Person;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MappingStreams {

    public static void main(String[] args) {
        var list1 = IntStream
                .range(0, 10)
                .boxed()
                .map(n -> (double)n)
                .toList();

        System.out.println(list1);

        var list2 = IntStream
                .range(0, 10)
                .boxed()
                .map(n -> String.format("Option number: %d", n))
                .toList();

        System.out.println(list2);

        Map<String, Integer> peopleMap = Map.of("Pip", 23, "Estella", 23,
                "Miss Haversham", 56, "Magwitch", 60);

        peopleMap
                .entrySet()
                .stream()
                .map(e -> new Person(e.getKey(), e.getValue()))
                .forEach(System.out::println);
        System.out.println();

        peopleMap
                .keySet()
                .stream()
                .map(e -> new Person())
                .forEach(System.out::println);
    }
}
