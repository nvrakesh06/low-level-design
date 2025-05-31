package com.parkinglot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.parkinglot.model.*;

public class ParkingLot {
    private static volatile ParkingLot instance;
    private final List<ParkingLevel> parkingLevels;
    private final List<EntryPoint> entryPoints;
    private final List<ExitPoint> exitPoints;

    private ParkingLot() {
        this.parkingLevels = new ArrayList<>();
        this.entryPoints = new ArrayList<>();
        this.exitPoints = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) {
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }

    public void addParkingLevel(ParkingLevel level) {
        parkingLevels.add(level);
    }

    public void addEntryPoint(EntryPoint entryPoint) {
        entryPoints.add(entryPoint);
    }

    public void addExitPoint(ExitPoint exitPoint) {
        exitPoints.add(exitPoint);
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : parkingLevels) {
            Ticket ticket = level.parkVehicle(vehicle);
            if (ticket != null) {
                System.out.println("Vehicle " + vehicle.getVehiclePlateNumber() + " parked at level " + level.getLevelNumber());
                return ticket;
            }
        }
        System.out.println("No available parking spots for vehicle " + vehicle.getVehiclePlateNumber());
        return null;
    }

    public void unparkVehicle(Ticket ticket) {
        ParkingLevel level = ticket.getParkingLevel();
        level.unparkVehicle(ticket);
    }

    public Map<ParkingLevel, Map<VehicleType, List<ParkingSpot>>> getAvailableSpots() {
        return parkingLevels.stream()
                .collect(Collectors.toMap(
                        level -> level,
                        ParkingLevel::getAvailableSpots
                ));
    }
}
