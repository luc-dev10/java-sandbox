package com.sandbox.lambda;

public class Motorcycle extends Vehicle {

    private int footRestCount;
    public String driveChain;

    public Motorcycle(int wheelNumber, int wheelSize, String make, String model, int releaseYear, int footRestCount, String driveChain) {
        super(wheelNumber, wheelSize, make, model, releaseYear);
        this.footRestCount = footRestCount;
        this.driveChain = driveChain;
    }

    public int getFootRestCount() {
        return footRestCount;
    }

    public void setFootRestCount(int footRestNumber) {
        this.footRestCount = footRestNumber;
    }

    public String getDriveChain() {
        return driveChain;
    }

    public void setDriveChain(String driveChain) {
        this.driveChain = driveChain;
    }
}
