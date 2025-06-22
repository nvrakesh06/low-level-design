package com.parkinglot.model;

public class ParkingSpot {
    private final int spotId;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;
    private boolean isAvailable;

    public ParkingSpot(int spotId, VehicleType vehicleType) {
        this.spotId = spotId;
        this.vehicleType = vehicleType;
        this.isAvailable = true;
    }

    public synchronized boolean assignVehicle(Vehicle vehicle) {
        if (isAvailable && vehicle.getVehicleType() == vehicleType) {
            this.parkedVehicle = vehicle;
            this.isAvailable = false;
            return true;
        }
        return false;
    }

    public synchronized Vehicle removeVehicle() {
        if (!isAvailable) {
            Vehicle vehicle = this.parkedVehicle;
            this.parkedVehicle = null;
            this.isAvailable = true;
            return vehicle;
        }
        return null;
    }

    public int getSpotId() {
        return spotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }
}
