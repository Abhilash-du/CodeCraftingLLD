package com.example.parkinglot.controller;

import com.example.parkinglot.dtos.CreateParkingLotRequest;
import com.example.parkinglot.models.ParkingLot;

// 1. Request Validation
// 2. Data transformation
// 3. Convert
public class ParkingLotController {

    private ParkingLotService parkingLotService=new ParkingLotService();
    public ParkingLot createParkingLot(CreateParkingLotRequest request){
        validate(request);
        ParkingLot parkingLot=transform(request);
        parkingLotService.create(parkingLot);
        return  null; // as of now, we will update it
    }

    private void validate(CreateParkingLotRequest request) {
        if(request.getNumberOfFloors()<0){
            throw  new RuntimeException("Invalid number of floors");
        }
    }

    private ParkingLot transform(CreateParkingLotRequest request){
        return new ParkingLot();

    }
}
