package com.durga.Streams;

import com.durga.model.Person;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class FlatMapExample {
    public static void main(String[] args) {

        Consumer<Object> print = System.out::print;
        Consumer<Object> println = System.out::println;

        String[][] strings = {
                {"cat", "dog"},
                {"mouse", "fox", "horse"},
        };

        // Arrays.stream
        // Stream.of

        Arrays
                .stream(strings)
                .flatMap(Arrays::stream)
                .forEach(println);

        System.out.println();

        String lines = """
				one, two, three
				four, five, six,
				seven, eight
				""";

        Stream
                .of(lines.split("\n"))
                .flatMap(s -> Stream.of(s.split(",")))
                .map(String::trim)
                .map(s -> "'" + s + "'")
                .forEach(println);

        System.out.println();

        Stream
                .of("Jill", "Joe", "Jack")
                .flatMap(s -> Stream.of(new Person(s), new Person(s)))
                .forEach(println);

        System.out.println();

        double[][] numbers = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

        Stream
                .of(numbers)
                .flatMapToDouble(DoubleStream::of)
                .forEach(System.out::println);
    }
}
