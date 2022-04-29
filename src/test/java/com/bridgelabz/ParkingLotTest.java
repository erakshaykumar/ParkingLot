/**
 * @purpose : Parking Lot System
 * @author : Akshay kumar
 */
package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    ParkingLot parkingLot = null;
    Object vehicle = null;
    Object vehicle2 = null;

    @BeforeEach
    public void setUp() {
        parkingLot = new ParkingLot();
        vehicle = new Object();
        vehicle2 = new Object();
    }

    /**
     * UC1-Vehicle When Parked Return True
     *
     * @param : Vehicle
     */

    @Test
    public void givenVehicle_WhenPark_ShouldReturnTrue() {
        boolean parkingStatus = parkingLot.parkVehicle(vehicle);
        Assertions.assertTrue(parkingStatus);
    }

    /**
     * UC1-Vehicle When Already Parked Return False
     *
     * @param : Vehicle
     */
    @Test
    public void givenVehicle_WhenAlreadyParked_ShouldReturnFalse() {
        parkingLot.parkVehicle(vehicle);
        boolean parkingStatus = parkingLot.parkVehicle(vehicle);
        Assertions.assertFalse(parkingStatus);
    }

    /**
     * UC2-Vehicle When UnParked Return True
     *
     * @param : Vehicle
     */
    @Test
    public void givenVehicleIfParked_WhenUnParked_ShouldReturnTrue() {
        parkingLot.parkVehicle(vehicle);
        boolean parkingStatus = parkingLot.unParkVehicle(vehicle);
        Assertions.assertTrue(parkingStatus);
    }

    /**
     * UC2-Vehicle When UnParked Return False
     *
     * @param : Vehicle
     */
    @Test
    public void givenVehicleIfParked_AndGivenDifferentVehicleToUnPark_ShouldReturnFalse() {
        parkingLot.parkVehicle(vehicle);
        boolean parkingStatus = parkingLot.unParkVehicle(vehicle2);
        Assertions.assertFalse(parkingStatus);
    }
}
