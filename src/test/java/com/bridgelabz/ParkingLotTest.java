package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParkingLotTest {
    @Test
    public void givenVehicle_WhenPark_ShouldReturnTrue() {
        ParkingLot parkingLot = new ParkingLot();
        boolean parkingStatus = parkingLot.parkVehicle(new Object());
        Assertions.assertTrue(parkingStatus);
    }
}