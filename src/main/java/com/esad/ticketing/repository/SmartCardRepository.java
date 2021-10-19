package com.esad.ticketing.repository;

import com.esad.ticketing.entity.SmartCard;
import com.esad.ticketing.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartCardRepository extends JpaRepository<SmartCard, Long>  {
}
