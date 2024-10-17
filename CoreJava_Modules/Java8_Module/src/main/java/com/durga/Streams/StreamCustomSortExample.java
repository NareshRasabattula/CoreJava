package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Comparator;

public class StreamCustomSortExample {

	public static void main(String[] args) {
		System.out.println("Sort By Name");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(PersonOne:: getName))
		.forEach(System.out::println);
		
		System.out.println("Sort By Height");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(PersonOne :: getHeight))
		.forEach(System.out::println); 
		
		System.out.println("Reverse Sort By Name");
		PersonRepository.getAllPersons().stream()
		.sorted(Comparator.comparing(PersonOne :: getName).reversed())
		.forEach(System.out::println);
	}

}
