package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpleStreamExample {

	public static void main(String[] args) {
		/*Stream<Integer> s1 = Stream.of(1,2,3,4,5,6);
		s1.forEach(p-> System.out.println(p));
		System.out.println("=================");
		Stream<Integer> s2 = Stream.of(new Integer[] {1,2,3,4,5,6,}); 
		s2.forEach(p-> System.out.println(p));*/
		
		Predicate<PersonOne> p1 = (per) -> per.getHeight() >=140 ;
		Predicate<PersonOne> p2 = (per) -> per.getGender().equals("Male");
		
		Map<String,List<String>> personMap = PersonRepository
				.getAllPersons() // iterate all persons 
				.stream() // Stream of Persons
				.filter(p1) // Stream of Persons 
				.filter(p2) // Stream of Persons 
				.collect(Collectors
						.toMap(PersonOne :: getName, PersonOne :: getHobbies));
		System.out.println("Person Map :"+personMap);
		
		List<String> personHobbies = PersonRepository
				.getAllPersons() // List of Persons
				.stream() // Stream of Persons
				.map(PersonOne :: getHobbies) // Stream<List<String>>
				.flatMap(List::stream) // Stream<String>
				.distinct()
				.collect(Collectors.toList());// collection to be returned
		
		System.out.println("Person Hobbies List :"+personHobbies);
	}

}
