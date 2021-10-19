package com.esad.ticketing.service.implementation;

import com.esad.ticketing.dto.TimetableDto;
import com.esad.ticketing.entity.Route;
import com.esad.ticketing.entity.TimeTable;
import com.esad.ticketing.repository.RouteRepository;
import com.esad.ticketing.repository.TimetableRepository;
import com.esad.ticketing.service.interfaces.TimetableService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimetableServiceImpl implements TimetableService {
    @Autowired
    private TimetableRepository timetableRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<TimeTable>> findAllTimetables() {
        return new ResponseEntity<>(timetableRepository.findAll(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TimeTable> saveTimetable(TimetableDto timetableDto) {
        TimeTable t = timetableRepository.save(modelMapper.map(timetableDto, TimeTable.class));
        return new ResponseEntity<>(t, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<TimeTable>> findAllTimetablesByRoute(String routeId) {
        Route route = routeRepository.findById(routeId).get();
        return new ResponseEntity<>(timetableRepository.findByRoute(route), HttpStatus.OK);
    }
}
