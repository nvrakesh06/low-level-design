package com.parkinglot.model;

import java.util.Date;

public class Ticket {
    private static int idCounter = 0;
    private final int ticketId;
    private final ParkingLevel parkingLevel;
    private final ParkingSpot parkingSpot;
    private final Vehicle vehicle;
    private final Date entryTime;

    public Ticket(ParkingLevel parkingLevel, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.ticketId = ++idCounter;
        this.parkingLevel = parkingLevel;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
        this.entryTime = new Date();
    }

    public int getTicketId() {
        return ticketId;
    }

    public ParkingLevel getParkingLevel() {
        return parkingLevel;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }
}
