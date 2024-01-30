package com.example.parkinglot.controller;

import com.example.parkinglot.dtos.CreateParkingLotRequest;
import com.example.parkinglot.models.ParkingLot;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

// 1. Request Validation
// 2. Data transformation
// 3. Convert
@RestController  //Step1: For spring to know this is controller class
@RequestMapping("/api/v1/parking-lot") //Step2: Map all the requests for this url
@AllArgsConstructor
public class ParkingLotController {

    private ParkingLotService parkingLotService;


    // POST /api/v1/parking-lot
    @PostMapping
    public ParkingLot createParkingLot(@RequestBody CreateParkingLotRequest request) {
        validate(request);
        ParkingLot parkingLot = transform(request);
        parkingLotService.create(parkingLot);
        return parkingLot; // as of now, we will update it
    }

    // GET /api/v1/parking-lot/{id}
    @GetMapping("/{id}") // Step3 - Add method level mapping (it is a GET request)
    public ParkingLot getParkingLot(@PathVariable("id") Long id) { //STEP4: Add Path Variable: path variable tells spring that id parameter will be coming from url
        return (ParkingLot) ParkingLot.builder().build();
    }

    private void validate(CreateParkingLotRequest request) {
        if (request.getNumberOfFloors() < 0) {
            throw new RuntimeException("Invalid number of floors");
        }
    }

    private ParkingLot transform(CreateParkingLotRequest request) {
        return ParkingLot.builder().build();

    }
}
