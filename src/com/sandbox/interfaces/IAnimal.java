package com.sandbox.interfaces;

public interface IAnimal {

    // all variables are final/static/public
    int VALUE = 10;

    /*  default methods can be defined in interfaces
     *  introduced to leverage lambda expressions
     * */
    default int getLungs() {
        return getValue();
    }

    // private variables can be defined in interfaces
    private int getValue() {
        return IAnimal.VALUE;
    }

}
