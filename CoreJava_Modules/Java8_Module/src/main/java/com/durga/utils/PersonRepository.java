package com.durga.utils;

import com.durga.model.Address;
import com.durga.model.Person;
import com.durga.model.PersonOne;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author Durganaresh - 10/17/2024
 * Hard work definitely pays off.
 * There is no substitute of hardworking.
 * There is no shortcut to success.
 */
public class PersonRepository {
    public static List<PersonOne> getAllPersons() {
        PersonOne p1 = new PersonOne("John", 165, 2000.00, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        PersonOne p2 = new PersonOne("Angel", 158, 5000, "Female", 2, Arrays.asList("Driving", "Music", "Football"));
        PersonOne p3 = new PersonOne("Dean", 140, 5700, "Male", 2, Arrays.asList("Cricket", "Driving", "Tennis"));
        PersonOne p4 = new PersonOne("Nancy", 130, 4900, "Female", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        PersonOne p5 = new PersonOne("Harper", 125, 9000, "Female", 2, Arrays.asList("Football", "Swimming", "Tennis"));
        PersonOne p6 = new PersonOne("Alan", 110, 9500, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        PersonOne p7 = new PersonOne("Campell", 165, 1548, "Male", 1, Arrays.asList("Swimming", "Tennis"));

        return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
    }

    public static PersonOne getPerson() {
        return new PersonOne("John", 165, 2000, "Male", 2, Arrays.asList("Cricket", "Swimming", "Tennis"));
    }

    public static Optional<PersonOne> getPersonOptional() {
        PersonOne per = getPerson();
        per.setAddress(Optional.of(new Address("7 th Block", "Ashburn", "Virginia", "USA", 20047)));
        return Optional.of(per);
    }
}
