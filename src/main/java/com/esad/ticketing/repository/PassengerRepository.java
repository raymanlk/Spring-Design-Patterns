package com.esad.ticketing.repository;

import com.esad.ticketing.entity.Account;
import com.esad.ticketing.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
