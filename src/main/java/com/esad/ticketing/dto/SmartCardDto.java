package com.esad.ticketing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SmartCardDto {
    private String validityPeriod;
    private Double credits;
    private ShortPassengerDto passenger;
    @CreatedDate
    private Date activated;
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class ShortPassengerDto {
    private Long passengerId;
}
