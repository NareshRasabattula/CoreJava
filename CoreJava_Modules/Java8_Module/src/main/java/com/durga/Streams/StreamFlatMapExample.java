package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {
	
	static List<String> hobbies(List<PersonOne> personsList){
		return personsList.stream()
				.map(PersonOne:: getHobbies)
				.flatMap(List :: stream)
				.collect(Collectors.toList());
	}
	
	static List<String> distinctHobbies(List<PersonOne> personsList){
		return personsList.stream()
				.map(PersonOne :: getHobbies)
				.flatMap(List :: stream)
				.sorted()
				.distinct()
				.collect(Collectors.toList());
	}
	
	static long countOfHobbies(List<PersonOne> personsList) {
		return personsList.stream()
				.map(PersonOne :: getHobbies)
				.flatMap(List :: stream)
				.distinct()
				.count();
	}

	public static void main(String[] args) {
		List<Integer> oddNumber = Arrays.asList(1,3,5,7);
		List<Integer> evenNumber = Arrays.asList(2,4,6,8);
		
		List<List<Integer>> listofList = Arrays.asList(oddNumber,evenNumber);
		System.out.println("Before Flatten :"+listofList);
		
		List<Integer> flattenList = listofList.stream()
				.flatMap(list -> list.stream())
				.collect(Collectors.toList());
		System.out.println("After Flatten :"+flattenList);
		
		System.out.println("Hobbies Result with Duplicates :"+hobbies(PersonRepository.getAllPersons()));
		System.out.println("Hobbies Result without Duplicates :"+distinctHobbies(PersonRepository.getAllPersons()));
		System.out.println("Hobbies Count :"+countOfHobbies(PersonRepository.getAllPersons()));
	}

}
