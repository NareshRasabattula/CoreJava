package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.function.Predicate;

public class StreamMapFilterReduceExample {
	
	static Predicate<PersonOne> p1 = (per) -> per.getHeight() >=140 ;
	static Predicate<PersonOne> p2 = (per) -> per.getGender().equals("Male");

	public static void main(String[] args) {
		int kidsCount = PersonRepository.getAllPersons()
		.stream()
		.filter(p1.and(p2))
		.map(PersonOne :: getKids)
		//.reduce(0,Integer :: sum);
		.reduce(0, (x,y) -> (x+y));
		System.out.println("Number of Kids :"+kidsCount);
	}

}
