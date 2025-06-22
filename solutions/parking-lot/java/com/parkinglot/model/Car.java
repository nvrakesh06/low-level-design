package com.parkinglot.model;

public class Car extends Vehicle {

    public Car(String vehiclePlateNumber) {
        super(vehiclePlateNumber, VehicleType.CAR);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vehiclePlateNumber='" + getVehiclePlateNumber() + '\'' +
                ", vehicleType=" + getVehicleType() +
                '}';
    }
    
}
