package com.esad.ticketing.service.implementation;

import com.esad.ticketing.entity.Route;
import com.esad.ticketing.repository.RouteRepository;
import com.esad.ticketing.service.interfaces.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {

    @Autowired
    private RouteRepository routeRepository;

    @Override
    public ResponseEntity<List<Route>> findAllRoutes() {
        return new ResponseEntity<>(routeRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Route> findRoute(String routeId) throws Exception {
        Optional<Route> route = routeRepository.findById(routeId);
        if (route.isPresent()) {
            return new ResponseEntity<>(route.get(), HttpStatus.OK);
        } else {
            throw new Exception("Not found");
        }
    }
}
