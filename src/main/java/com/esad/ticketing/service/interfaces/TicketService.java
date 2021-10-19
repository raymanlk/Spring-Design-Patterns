package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.entity.Ticket;
import org.springframework.http.ResponseEntity;

public interface TicketService {
    public ResponseEntity<Ticket> getTicketById(Long id);
}
