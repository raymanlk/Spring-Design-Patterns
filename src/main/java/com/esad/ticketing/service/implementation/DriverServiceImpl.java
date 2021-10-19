package com.esad.ticketing.service.implementation;

import com.esad.ticketing.dto.DriverAbsenceDto;
import com.esad.ticketing.dto.DriverDto;
import com.esad.ticketing.entity.Driver;
import com.esad.ticketing.entity.DriverAbsence;
import com.esad.ticketing.repository.DriverAbsenceRepository;
import com.esad.ticketing.repository.DriverRepository;
import com.esad.ticketing.service.interfaces.DriverService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private DriverAbsenceRepository driverAbsenceRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<Driver> signUpDriver(DriverDto driverDto) {
        return new ResponseEntity<>(modelMapper.map(driverDto, Driver.class), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<DriverAbsence> addAbsence(DriverAbsenceDto driverAbsenceDto) {
        return new ResponseEntity<>(driverAbsenceRepository.save(modelMapper.map(driverAbsenceDto, DriverAbsence.class)), HttpStatus.CREATED);
    }
}
