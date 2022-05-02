package com.sandbox.stream;

import java.util.ArrayList;
import java.util.List;

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

    }
}
