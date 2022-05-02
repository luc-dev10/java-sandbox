package com.sandbox.stream;

import com.sandbox.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MainApp {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>(List.of(
                new Person("John", 23),
                new Person("Cena", 32),
                new Person("Jane", 20),
                new Person("Doe", 27)
        ));

        // sort by name
        personList.sort((s1, s2) -> s1.getName()
                                      .compareTo(s2.getName()));

        // display
        personList.forEach(person -> System.out.println(person.getName()));

        // ____________________________________

        // using stream
        personList.stream()
                  .map(Person::getName)
                  .filter(name -> name.startsWith("J"))
                  .sorted()
                  .forEach(System.out::println);

        // creating streams
        Stream<String> firstStream = Stream.of("Hello", "World");
        Stream<String> secondStream = Stream.of("Hello", "There");
        System.out.println(Stream.concat(firstStream, secondStream)
                                 .distinct()
                                 .count());

    }
}
