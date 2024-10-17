package com.durga.Streams;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ParallelVsLazyExample {
    private static void waitForSomething(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        IntStream
                .range(0, 5)
                .peek(System.out::print)
                .forEach(System.out::print);

        System.out.println();

        IntStream
                .range(0, 5)
                .parallel()
                .peek(System.out::print)
                .forEach(System.out::print);

        System.out.println();

        IntStream
                .range(0, 10)
                .parallel()
                .peek(ParallelVsLazyExample::waitForSomething)
                .forEach(System.out::print);

        System.out.println();

        List
                .of("one", "two", "three", "four")
                .parallelStream()
                .forEach(System.out::print);

    }
}
