/**
 * @purpose : Parking Lot System
 * @author : Akshay kumar
 */
package com.bridgelabz;

public class ParkingLot {
    Object vehicle = null;

    /**
     * UC1-Park Vehicle Logic
     *
     * @param: Vehicle
     * @return: true/false
     */
    public boolean parkVehicle(Object vehicle) {
        if (this.vehicle != null)
            return false;
        this.vehicle = vehicle;
        return true;
    }

    /**
     * UC2-UnPark Vehicle Logic
     *
     * @param: Vehicle
     * @return: true/false
     */
    public boolean unParkVehicle(Object vehicle) {
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }

}
