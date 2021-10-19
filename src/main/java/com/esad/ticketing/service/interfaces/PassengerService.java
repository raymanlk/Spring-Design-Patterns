package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.dto.PassengerDto;
import com.esad.ticketing.entity.Passenger;
import org.springframework.http.ResponseEntity;

public interface PassengerService {
    public ResponseEntity<Passenger> signUpPassenger(PassengerDto passengerDto);
}
