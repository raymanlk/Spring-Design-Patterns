package com.esad.ticketing.service.implementation;

import com.esad.ticketing.entity.Ticket;
import com.esad.ticketing.repository.TicketRepository;
import com.esad.ticketing.service.interfaces.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public ResponseEntity<Ticket> getTicketById(Long id) {
        Optional<Ticket> ticket = ticketRepository.findById(id);
        return new ResponseEntity<>(ticket.get(), HttpStatus.OK);
    }
}
