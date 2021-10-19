package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.dto.DriverAbsenceDto;
import com.esad.ticketing.dto.DriverDto;
import com.esad.ticketing.dto.PassengerDto;
import com.esad.ticketing.entity.Driver;
import com.esad.ticketing.entity.DriverAbsence;
import com.esad.ticketing.entity.Passenger;
import org.springframework.http.ResponseEntity;

public interface DriverService {
    public ResponseEntity<Driver> signUpDriver(DriverDto driverDto);

    public ResponseEntity<DriverAbsence> addAbsence(DriverAbsenceDto driverAbsenceDto);

}
