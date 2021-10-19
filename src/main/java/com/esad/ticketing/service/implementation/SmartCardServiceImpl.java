package com.esad.ticketing.service.implementation;

import com.esad.ticketing.dto.SmartCardDto;
import com.esad.ticketing.entity.SmartCard;
import com.esad.ticketing.repository.SmartCardRepository;
import com.esad.ticketing.service.interfaces.SmartCardService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SmartCardServiceImpl implements SmartCardService {
    @Autowired
    private SmartCardRepository smartCardRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<SmartCard> create(SmartCardDto smartCardDto) {
        return new ResponseEntity<SmartCard>(smartCardRepository.save(modelMapper.map(smartCardDto, SmartCard.class)), HttpStatus.CREATED);
    }
}
