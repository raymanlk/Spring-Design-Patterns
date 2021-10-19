package com.esad.ticketing.controller;


import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.service.interfaces.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/signup/{firstName}/{lastname}/{mobileNo}/{nic}")
    public ResponseEntity<Passenger> SignUpPassenger(@RequestBody Passenger passenger) {
        return passengerService.SignUpPassenger(passenger);
    }
    

}
