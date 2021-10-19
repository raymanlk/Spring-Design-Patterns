package com.esad.ticketing.controller;

import com.esad.ticketing.entity.Route;
import com.esad.ticketing.entity.Ticket;
import com.esad.ticketing.service.interfaces.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping("")
    public ResponseEntity<List<Route>> getAllRoutes() throws Exception {
        return routeService.findAllRoutes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Route> getRouteInfo(@PathVariable String id) throws Exception {
        return routeService.findRoute(id);
    }
}
