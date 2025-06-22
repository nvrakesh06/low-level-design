package com.parkinglot.model;

public abstract class Vehicle {
    private final String vehiclePlateNumber;
    private final VehicleType vehicleType;
    
    protected Vehicle(String vehiclePlateNumber, VehicleType vehicleType) {
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlateNumber() {
        return vehiclePlateNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract String toString();
}