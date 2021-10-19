package com.esad.ticketing.controller;

import com.esad.ticketing.dto.TimetableDto;
import com.esad.ticketing.entity.TimeTable;
import com.esad.ticketing.service.interfaces.TimetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/timetable")
public class TimetableController {

    @Autowired
    private TimetableService timetableService;

    @GetMapping("")
    public ResponseEntity<List<TimeTable>> getAllTimetables() throws Exception {
        return timetableService.findAllTimetables();
    }

    @GetMapping("/route/{id}")
    public ResponseEntity<List<TimeTable>> getAllTimetablesByRoute(@PathVariable String id) throws Exception {
        return timetableService.findAllTimetablesByRoute(id);
    }

    @PostMapping("create")
    public ResponseEntity<TimeTable> createTimetable(@RequestBody TimetableDto timetableDto) {
        return timetableService.saveTimetable(timetableDto);
    }
}
