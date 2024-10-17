package com.durga.Streams;

import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.Optional;

public class StreamReduceExample1 {

	public static void main(String[] args) {
		combineNames();
		Optional<PersonOne> tallestPerson = getTallestPerson();
		System.out.println("Tallest Person is :"+tallestPerson.get());
	}

	private static void combineNames() {
		String names = PersonRepository.getAllPersons()
		.stream()
		.map(PersonOne :: getName)
		.reduce("", (a,b) -> a.concat(b));
		System.out.println("Names are :"+names);
	}
	
	static Optional<PersonOne> getTallestPerson() {
		return PersonRepository.getAllPersons()
		.stream()
		.reduce((x,y) -> x.getHeight() > y.getHeight() ? x : y);
	}

}
