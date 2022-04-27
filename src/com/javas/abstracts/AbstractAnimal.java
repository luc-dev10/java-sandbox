package com.javas.abstracts;

public abstract class AbstractAnimal {

    // properties can be defined private and non-static
    int age;
    String name;

    // getters and setters are possible
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method so base classes can implement it
    public abstract void walk();

}
