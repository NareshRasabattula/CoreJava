package com.durga.parallel_streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class ParallelStreamUseCase {
    public static void main(String[] args) {
        System.out.println(getHobbiesBySeq());
        System.out.println(getHobbiesByParallel());
    }

    static List<String> getHobbiesBySeq(){
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .stream()
                .map(PersonOne:: getHobbies)
                .flatMap(List :: stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential Duration :"+(end-start));
        return hobbies;
    }

    static List<String> getHobbiesByParallel(){
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .parallelStream()
                .map(PersonOne :: getHobbies)
                .flatMap(List :: stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel Duration :"+(end-start));
        return hobbies;
    }
}
