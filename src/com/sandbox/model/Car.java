package com.sandbox.model;

public class Car extends Vehicle {

    private String dashboard;
    private int windowCount;

    public Car(int wheelNumber, int wheelSize, String make, String model, int releaseYear, String dashboard, int windowCount) {
        super(wheelNumber, wheelSize, make, model, releaseYear);
        this.dashboard = dashboard;
        this.windowCount = windowCount;
    }

    public String getDashboard() {
        return dashboard;
    }

    public void setDashboard(String dashboard) {
        this.dashboard = dashboard;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void setWindowCount(int windowCount) {
        this.windowCount = windowCount;
    }

}