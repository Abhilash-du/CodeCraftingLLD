package com.example.parkinglot.dtos;

import lombok.Getter;

@Getter
public class CreateParkingLotRequest {
    private String name;
    private String address;
    private Integer numberOfFloors;
    private  Integer numberOfSpotsPerFloor;
    private Integer numberOfEntryGates;
    private Integer numberOfExitGates;

}

// {1: 5, 2: 3, 4: 10}