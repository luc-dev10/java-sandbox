package com.sandbox.lambda;

import java.util.ArrayList;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {

        // using lambda expression for thread
        new Thread(() -> System.out.println("Thread is running")).start();

        // lambda with code block
        new Thread(() -> {
            System.out.println("First Statement - block");
            System.out.println("Second Statement - block");
        }).start();

        // collections taking an anonymous comparator
        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Animal(10, "Monkey"));
        animalArrayList.add(new Animal(11, "Cat"));
        animalArrayList.add(new Animal(9, "Rat"));
        animalArrayList.add(new Animal(2, "Mole"));

        // sort by name
        animalArrayList.sort(new Comparator<Animal>() {
            @Override
            public int compare(Animal firstAnimal, Animal secondAnimal) {
                if (firstAnimal.getName()
                               .toLowerCase()
                               .charAt(0) > secondAnimal.getName()
                                                        .toLowerCase()
                                                        .charAt(0))
                    return 1;
                else if (firstAnimal.getName()
                                    .toLowerCase()
                                    .charAt(0) < secondAnimal.getName()
                                                             .toLowerCase()
                                                             .charAt(0))
                    return -1;

                return 0;
            }
        });

        // display
        animalArrayList.forEach(animal -> System.out.printf("Id: %d, Name: %s\n", animal.getId(), animal.getName()));
    }

}
