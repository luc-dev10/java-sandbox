package com.sandbox.model;

public abstract class Vehicle {

    private int wheelNumber;
    private int wheelSize;
    private String make;
    private String model;
    private int releaseYear;

    public Vehicle(int wheelNumber, int wheelSize, String make, String model, int releaseYear) {
        this.wheelNumber = wheelNumber;
        this.wheelSize = wheelSize;
        this.make = make;
        this.model = model;
        this.releaseYear = releaseYear;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
