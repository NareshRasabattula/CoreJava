package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMinMaxByExample {
	
	static Optional<PersonOne> getTallestPerson() {
		return PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.maxBy(Comparator.comparing(PersonOne :: getHeight)));
	}
	
	static Optional<PersonOne> getShortestPerson() {
		return PersonRepository.getAllPersons()
		.stream()
		.collect(Collectors.minBy(Comparator.comparing(PersonOne :: getHeight)));
	}
	static List<PersonOne> filterMultiplePersons(){
		List<PersonOne> personList = new ArrayList<PersonOne>();
		Optional<PersonOne> maxHeight = getTallestPerson();
		PersonOne per = maxHeight.isPresent() ? maxHeight.get() : null ;
		if(null != per) {
			personList = PersonRepository.getAllPersons()
			.stream()
			.filter(person -> person.getHeight()==per.getHeight())
			.collect(Collectors.toList());
		}
		return personList;
	}
	
	public static void main(String[] args) {
		System.out.println("Tallest Person :"+getTallestPerson().get());
		System.out.println("Shortest Person :"+getShortestPerson().get());
		System.out.println("Tallest Group :"+filterMultiplePersons());
	}

}
