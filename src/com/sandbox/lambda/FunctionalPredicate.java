package com.sandbox.lambda;

import com.sandbox.model.Chair;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalPredicate {
    public static void main(String[] args) {

        ArrayList<Chair> chairs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Chair chair = new Chair(i);
            chair.setId(i);
            chair.setName((char) ('A' + i));
            chairs.add(chair);
        }
        // using test on foreach
        Predicate<Chair> chairOver10Legs = chair -> chair.getLeg() >= 4;
        for (Chair chair : chairs)
            if (chairOver10Legs.test(chair))
                System.out.println(chair.getLeg());

        // chaining predicates
        Predicate<Chair> chairOver4Legs = chair -> chair.getLeg() % 4 == 0;
        Predicate<Chair> chairOver2Legs = chair -> chair.getLeg() % 2 == 0;
        for (Chair chair : chairs)
            if (chairOver4Legs.and(chairOver2Legs)
                              .test(chair))
                System.out.println(chair.getLeg());

        // function
        Function<Chair, String> getDescription = (Chair chair) -> {
            return String.format("ID: %d | Name: %c", chair.getId(), chair.getName());
        };
        for (Chair chair : chairs)
            System.out.println(getDescription.apply(chair));

        // chain functions
        Function<Chair, String> getId = (Chair chair) -> {
            return String.format("ID: %d", chair.getId());
        };
        Function<String, String> addStars = (String value) -> {
            return value.concat(" *******");
        };

        Function<Chair, String> chainedFunction = getId.andThen(addStars);
        System.out.println(chainedFunction.apply(chairs.get(0)));

        // bi function
        BiFunction<String, Chair, String> concatName = (String id, Chair chair) -> {
            return id.concat(String.format(" - %c", chair.getName()));
        };

        System.out.println(concatName.apply(getId.apply(chairs.get(0)), chairs.get(0)));

    }

}
