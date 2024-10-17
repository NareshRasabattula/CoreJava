package com.durga.Streams;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class CreatingStreams {
    public static void main(String[] args) {
        var set1 = Set.of(1, 2, 3, 4);

        var stream1 = set1.stream();
        stream1.forEach(System.out::println);

        //Arrays.asList("one", "two", "three", "four").stream().forEach(System.out::println);
        Stream.of("one", "two", "three", "four").forEach(System.out::println);

        Stream.Builder<Double> streamBuilder = Stream.builder();

        streamBuilder.add(1.2);
        streamBuilder.add(2.3).add(3.4).add(7.1);
        Stream<Double> stream2 = streamBuilder.build();

        stream2.forEach(System.out::println);

        IntStream.range(0, 10).forEach(System.out::println);
        System.out.println();
        IntStream.iterate(2, a -> a < 100, a -> a + 2).forEach(System.out::println);
        System.out.println();
        IntStream.iterate(2, a -> a < 30, a -> a + 2).forEach(System.out::println);

        System.out.println();
        System.out.println();
        Stream.iterate("a", a -> a.length() < 20, a -> a + "a").forEach(System.out::println);

        System.out.println();
        Random random = new Random();
        Stream.generate(random::nextDouble).takeWhile(a -> a > 0.01).forEach(System.out::println);
    }
}
