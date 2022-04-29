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
        ArrayList<Vehicle> motorcycles = new ArrayList<>();
        motorcycles.add(new Motorcycle(2, 15, "Toyota", "Navi", 2018, 2, "Metal"));
        motorcycles.add(new Motorcycle(2, 15, "Ducati", "Panigale", 2022, 2, "Metal"));
        motorcycles.add(new Motorcycle(2, 15, "Honda", "Monkey", 2019, 2, "Metal"));

        // sort by release year
        motorcycles.sort(new Comparator<>() {
            @Override
            public int compare(Vehicle firstVehicle, Vehicle secondVehicle) {
                if (firstVehicle.getReleaseYear() > secondVehicle.getReleaseYear())
                    return 1;
                else if (firstVehicle.getReleaseYear() < secondVehicle.getReleaseYear())
                    return -1;
                return 0;
            }
        });

        // display
        motorcycles.forEach(motorcycle -> System.out.printf("Make: %s, Model: %s Year: %d\n", motorcycle.getMake(), motorcycle.getModel(), motorcycle.getReleaseYear()));

        // ______________________________

        // using lambda expression as parameter
        motorcycles.sort((firstVehicle, secondVehicle) -> firstVehicle.getMake()
                                                                      .compareTo(secondVehicle.getMake()));
        // display
        printVehicle(motorcycles);

        // ______________________________

    }

    public static void printVehicle(ArrayList<Vehicle> vehicles) {
        vehicles.forEach(vehicle -> System.out.printf("Make: %s, Model: %s Year: %d\n", vehicle.getMake(), vehicle.getModel(), vehicle.getReleaseYear()));
    }

}
