package com.esad.ticketing.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class DriverAbsence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long absenceId;

    private String leaveType;
    private String remark;
    private Date fromDate;
    private Date toDate;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    @JsonBackReference
    private Driver driver;
}
