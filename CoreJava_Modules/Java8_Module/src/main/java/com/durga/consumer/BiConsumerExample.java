package com.durga.consumer;

import java.util.function.BiConsumer;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class BiConsumerExample {
    public static void main(String[] args) {
		/* BiConsumer<Integer, Integer> con1 = (a,b) -> System.out.println("Add :"+(a+b));
		con1.accept(10, 20);

		List<Integer> list1 = Arrays.asList(new Integer(10),new Integer(10),new Integer(10));
		List<Integer> list2 = Arrays.asList(new Integer(10),new Integer(10));

		BiConsumer<List<Integer>,List<Integer>> con2 = (l1,l2) -> {
			if(l1.size() == l2.size()) System.out.println("True");
			else System.out.println("False");
		};

		con2.accept(list1, list2);*/

        BiConsumer<Integer, Integer> addConsumer = (a, b) -> System.out.println("Add :"+(a+b));
        BiConsumer<Integer, Integer> subConsumer = (a,b) -> System.out.println("Subs :"+(a-b));
        BiConsumer<Integer, Integer> mulConsumer = (a,b) -> System.out.println("Mul :"+(a*b));
        //addConsumer.accept(10, 20);
        //subConsumer.accept(10, 20);
        //mulConsumer.accept(10, 20);
        addConsumer.andThen(subConsumer).andThen(mulConsumer).accept(10, 20);

    }
}
