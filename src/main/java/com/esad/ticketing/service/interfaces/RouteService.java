package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.entity.Route;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

public interface RouteService {
    public ResponseEntity<List<Route>> findAllRoutes();

    public ResponseEntity<Route> findRoute(String routeId) throws Exception;

}
