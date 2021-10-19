package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.dto.SmartCardDto;
import com.esad.ticketing.entity.SmartCard;
import org.springframework.http.ResponseEntity;

public interface SmartCardService {
    public ResponseEntity<SmartCard> create(SmartCardDto smartCard);
}
