package com.parkinglot;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.parkinglot.model.*;
import com.parkinglot.service.ParkingLot;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addEntryPoint(new EntryPoint("1"));
        parkingLot.addExitPoint(new ExitPoint("1"));

        List<ParkingSpot> level1Spots = new ArrayList<>();
        level1Spots.add(new ParkingSpot(1, VehicleType.CAR));
        level1Spots.add(new ParkingSpot(2, VehicleType.MOTORCYCLE));
        level1Spots.add(new ParkingSpot(3, VehicleType.TRUCK));

        Vehicle car1 = new Car("CAR123");
        Vehicle motorcycle1 = new Motorcycle("MOTO456");
        Vehicle truck1 = new Truck("TRUCK789");

        Ticket carTicket = parkingLot.parkVehicle(car1);
        Ticket motorcycleTicket = parkingLot.parkVehicle(motorcycle1);
        Ticket truckTicket = parkingLot.parkVehicle(truck1);

        if (carTicket != null) System.out.println("Car parked at spot: " + carTicket.getParkingSpot().getSpotId());
        if (motorcycleTicket != null) System.out.println("Bike parked at spot: " + motorcycleTicket.getParkingSpot().getSpotId());
        if (truckTicket != null) System.out.println("Truck parked at spot: " + truckTicket.getParkingSpot().getSpotId());

        parkingLot.unparkVehicle(carTicket);
        System.out.println("Car unparked from spot: " + carTicket.getParkingSpot().getSpotId());

        System.out.println("Availability after unparking car:");
        Map<ParkingLevel, Map<VehicleType, List<ParkingSpot>>> availability = parkingLot.getAvailableSpots();
        for (Map.Entry<ParkingLevel, Map<VehicleType, List<ParkingSpot>>> entry : availability.entrySet()) {
            System.out.println("Level " + entry.getKey().getLevelNumber() + ": " + entry.getValue().toString());
        }
    }
}
