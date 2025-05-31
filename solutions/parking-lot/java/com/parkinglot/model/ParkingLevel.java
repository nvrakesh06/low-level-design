package com.parkinglot.model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ParkingLevel {
    public final int levelNumber;
    public final List<ParkingSpot> spots;

    public ParkingLevel(int levelNumber, List<ParkingSpot> spots) {
        this.levelNumber = levelNumber;
        this.spots = spots;
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.assignVehicle(vehicle)) {
                return new Ticket(this, spot, vehicle);
            }
        }
        return null;
    }

    public synchronized void unparkVehicle(Ticket ticket) {
        ParkingSpot spot = ticket.getParkingSpot();
        Vehicle vehicle = spot.removeVehicle();
        if (vehicle != null && vehicle.equals(ticket.getVehicle())) {
            System.out.println("Vehicle " + vehicle.getVehiclePlateNumber() + " has been unparked from level " + levelNumber);
        } else {
            System.out.println("Failed to unpark vehicle from level " + levelNumber);
        }
    }

    public Map<VehicleType, List<ParkingSpot>> getAvailableSpots() {
        return spots.stream()
                .filter(ParkingSpot::isAvailable)
                .collect(Collectors.groupingBy(ParkingSpot::getVehicleType));
    }

    public int getLevelNumber() {
        return levelNumber;
    }
}
