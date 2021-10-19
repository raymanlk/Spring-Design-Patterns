package com.esad.ticketing.repository;

import com.esad.ticketing.entity.Route;
import com.esad.ticketing.entity.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TimetableRepository extends JpaRepository<TimeTable, String> {
    List<TimeTable> findByRoute(Route route);

}
