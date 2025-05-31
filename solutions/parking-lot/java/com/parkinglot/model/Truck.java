package com.parkinglot.model;

public class Truck extends Vehicle {

    public Truck(String vehiclePlateNumber) {
        super(vehiclePlateNumber, VehicleType.TRUCK);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "vehiclePlateNumber='" + getVehiclePlateNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
    
}
