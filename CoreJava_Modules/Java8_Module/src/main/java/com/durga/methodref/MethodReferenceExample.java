package com.durga.methodref;

import java.util.Comparator;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class MethodReferenceExample {
    // Classname :: methodName

    public static void main(String[] args) {
        System.out.println("Result 1 :"+MethodReferenceExample.compare(10, 20));
        Comparator<Integer> comp =  MethodReferenceExample::compare;
        System.out.println("Result 2:"+comp.compare(10, 20));
    }

    public static int compare(Integer x,Integer y) {
        return Integer.compare(x, y);
    }
}
