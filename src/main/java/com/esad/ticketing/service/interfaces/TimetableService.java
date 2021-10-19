package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.dto.TimetableDto;
import com.esad.ticketing.entity.TimeTable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface TimetableService {
    public ResponseEntity<List<TimeTable>> findAllTimetables();

    public ResponseEntity<TimeTable> saveTimetable(TimetableDto timeTable);

    public ResponseEntity<List<TimeTable>> findAllTimetablesByRoute(String routeId);



}
