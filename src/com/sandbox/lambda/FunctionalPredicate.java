package com.sandbox.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionalPredicate {
    public static void main(String[] args) {

        ArrayList<Chair> chairs = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            chairs.add(new Chair(i));

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

    }
}
