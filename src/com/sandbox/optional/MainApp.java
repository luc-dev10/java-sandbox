package com.sandbox.optional;

import com.sandbox.model.Person;

import java.util.Optional;

public class MainApp {
    public static void main(String[] args) throws IllegalAccessException {

        Person person = null;
        // throws exception - null.getName();
        // person.getName();

        Optional<Person> personOptional = Optional.of(new Person("John", 10));
        if (personOptional.isEmpty())
            System.out.println("Person Empty");
        if (personOptional.isPresent())
            System.out.println("Person not Empty");

        // different notation
        personOptional.ifPresent(p -> {
            System.out.println("Person not empty");
        });

        Person invisiblePerson = personOptional.orElse(new Person("Invisible Man", 170));

        // extra computation
        person = personOptional.orElseGet(() -> {
            // fetch person from DB
            System.out.println("DB Fetch...");
            return new Person("ADMIN", 1000);
        });

        // throw exception is possible
        person = personOptional.orElseThrow(IllegalAccessException::new);
    }
}
