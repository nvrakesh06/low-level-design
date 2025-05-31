package com.parkinglot.model;

public class Motorcycle extends Vehicle {

    public Motorcycle(String vehiclePlateNumber) {
        super(vehiclePlateNumber, VehicleType.MOTORCYCLE);
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "vehiclePlateNumber='" + getVehiclePlateNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
    
}
