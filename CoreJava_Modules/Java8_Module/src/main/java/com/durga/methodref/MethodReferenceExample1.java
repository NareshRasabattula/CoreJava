package com.durga.methodref;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MethodReferenceExample1 {
    static Function<String, String> f1 = name -> name.toUpperCase();
    static Function<String, String> f2 = String :: toUpperCase;

    static Predicate<PersonOne> p1 = per -> per.getHeight() >=140;
    static Predicate<PersonOne> p2 = MethodReferenceExample1 :: heightCheck;
    static BiPredicate<PersonOne,Integer> p3 = MethodReferenceExample1 :: heightCheckWithParam;
    static Function<String,String> f3 = MethodReferenceExample1 :: sayMyName ;

    public static void main(String[] args) {
        //System.out.println("Lambda Expression Result :"+f1.apply("java8"));
        //System.out.println("Method Reference Result :"+f2.apply("java8"));
        System.out.println("Predicate 1 Result :"+p1.test(PersonRepository.getPerson()));
        System.out.println("Predicate 2 Result :"+p2.test(PersonRepository.getPerson()));
        System.out.println("Predicate 3 Result :"+p3.test(PersonRepository.getPerson(),145));
        System.out.println("Function Test :"+f3.apply("java8"));
    }

    static boolean heightCheck(PersonOne per) {
        return per.getHeight() >= 140;
    }

    static boolean heightCheckWithParam(PersonOne per, Integer height) {
        return per.getHeight() >= height;
    }

    static String sayMyName(String name){
        return "Hello Mr."+name;
    }
}
