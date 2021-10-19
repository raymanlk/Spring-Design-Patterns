package com.esad.ticketing.controller;


import com.esad.ticketing.dto.PassengerDto;
import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.service.interfaces.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passenger")
public class PassengerController {

    @Autowired
    private PassengerService passengerService;

    @PostMapping("/signup")
    public ResponseEntity<Passenger> SignUpPassenger(@RequestBody PassengerDto passengerDto) {
        return passengerService.signUpPassenger(passengerDto);
    }
    

}
