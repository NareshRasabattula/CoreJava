package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Optional;
import java.util.function.Predicate;

public class StreamFindAnyFirstExample {
	static Predicate<String> p1 = num -> num.length() > 7;
	static Predicate<PersonOne> p2 = per -> per.getHeight() >= 200;
	static Predicate<PersonOne> p3 = per -> per.getGender().equals("Male");

	public static void main(String[] args) {
		Optional<PersonOne> findAny = findAny();
		if(findAny.isPresent())
			System.out.println("Find Any Result :"+findAny.get());
		else
			System.out.println("No Record Found");
		Optional<PersonOne> findFirst = findFirst();
		if(findFirst.isPresent())
			System.out.println("Find First Result :"+findFirst().get());
		else
			System.out.println("No Record Found");
	}
	
	static Optional<PersonOne> findAny() {
		return PersonRepository.getAllPersons()
		.stream()
		.filter(p2)
		.findAny();		
	}
	
	static Optional<PersonOne> findFirst() {
		return PersonRepository.getAllPersons()
		.stream()
		.filter(p3)
		.findAny();		
	}

}
