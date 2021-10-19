package com.esad.ticketing.dto;


import com.esad.ticketing.entity.Route;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimetableDto {
    private String dayOfWeek;
    private String departureTime;
    private String arrivalTime;
    private String routeId;

}
