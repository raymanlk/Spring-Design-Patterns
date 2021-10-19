package com.esad.ticketing.service.implementation;

import com.esad.ticketing.entity.Account;
import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.repository.AccountRepository;

import com.esad.ticketing.repository.PassengerRepository;
import com.esad.ticketing.service.interfaces.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService {

    @Autowired
    private PassengerRepository passengerRepository;


    @Override
    public ResponseEntity<Passenger> SignUpPassenger(Passenger passenger) {


        return new ResponseEntity<>(passengerRepository.save(passenger),HttpStatus.CREATED);
    }
}