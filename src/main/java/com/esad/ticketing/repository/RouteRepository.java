package com.esad.ticketing.repository;

import com.esad.ticketing.entity.Route;
import com.esad.ticketing.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, String> {
}
