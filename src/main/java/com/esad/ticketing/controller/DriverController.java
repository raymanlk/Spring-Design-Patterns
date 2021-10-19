package com.esad.ticketing.controller;

import com.esad.ticketing.dto.DriverAbsenceDto;
import com.esad.ticketing.dto.DriverDto;
import com.esad.ticketing.dto.PassengerDto;
import com.esad.ticketing.entity.Driver;
import com.esad.ticketing.entity.DriverAbsence;
import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.service.interfaces.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @PostMapping("/signup")
    public ResponseEntity<Driver> signUpDriver(@RequestBody DriverDto driverDto) {
        return driverService.signUpDriver(driverDto);
    }

    @PostMapping("/absence")
    public ResponseEntity<DriverAbsence> addAbsence(@RequestBody DriverAbsenceDto driverAbsenceDto) {
        return driverService.addAbsence(driverAbsenceDto);
    }

}
