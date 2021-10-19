package com.esad.ticketing.controller;

import com.esad.ticketing.dto.SmartCardDto;
import com.esad.ticketing.entity.Passenger;
import com.esad.ticketing.entity.SmartCard;
import com.esad.ticketing.service.interfaces.SmartCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/smartcard")
public class SmartCardController {

    @Autowired
    private SmartCardService smartCardService;

    @PostMapping("/create")
    public ResponseEntity<SmartCard> create(@RequestBody SmartCardDto smartCardDto) {
        return smartCardService.create(smartCardDto);
    }
}
