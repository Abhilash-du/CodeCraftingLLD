package com.example.parkinglot.service;

import com.example.parkinglot.models.ParkingLot;
import com.example.parkinglot.models.ParkingSpot;
import com.example.parkinglot.repositories.ParkingLotRepository;

import java.util.List;

public class ParkingLotService {

    private ParkingLotRepository repository;
    private com.example.parkinglot.service.ParkingSpotService parkingSpotService;

    public ParkingLot create(ParkingLot lot){
        List<ParkingSpot> parkingSpotList;
    }
}
