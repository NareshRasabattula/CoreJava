package com.durga.terminal_streams;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import static java.util.stream.Collectors.partitioningBy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartitioningExample {
	
	static Predicate<PersonOne> p1 = per -> per.getHeight() >= 140;
	
	static void byHeight() {
		Map<Boolean,List<PersonOne>> map = PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1));
		System.out.println("Person Map 1:"+map);
	}
	
	static void byHeightWith2Param() {
		Map<Boolean,Set<PersonOne>> map =PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1,Collectors.toSet()));
		System.out.println("Person Map 2:"+map);
	}
	
	static void byHeightWithMap() {
		Map<Boolean,Map<String,List<String>>> map =PersonRepository.getAllPersons()
		.stream()
		.collect(partitioningBy(p1,Collectors.toMap(PersonOne :: getName, PersonOne ::getHobbies)));
		System.out.println("Person Map 3:"+map);
	}

	public static void main(String[] args) {
		//byHeight();
		//byHeightWith2Param();
		byHeightWithMap();
	}

}
