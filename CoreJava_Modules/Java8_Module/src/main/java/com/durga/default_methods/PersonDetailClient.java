package com.durga.default_methods;

import com.durga.model.Person;
import com.durga.model.PersonOne;
import com.durga.utils.PersonRepository;

import java.util.List;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PersonDetailClient {
    static List<PersonOne> listOfPersons = PersonRepository.getAllPersons();


    public static void main(String[] args) {
        PersonDetails pd = new PersonDetailImpl();
        System.out.println("Total Salary :" + pd.calculateTotalSalary(listOfPersons));
        System.out.println("Total Kids Count :" + pd.totalKids(listOfPersons));
        PersonDetails.personNames(listOfPersons).forEach(System.out::println);
        PersonDetailImpl.personNames(listOfPersons).forEach(System.out::println);
    }
}
