package com.esad.ticketing.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Passenger implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long passengerId;
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String nic;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account", nullable = true)
    @JsonBackReference
    private Account account;

//    @OneToOne(fetch = FetchType.LAZY,
//            cascade =  CascadeType.ALL,
//            mappedBy = "passenger")
//    @JsonManagedReference
//    private SmartCard smartCard;

//    @OneToMany(mappedBy="passenger")
//    @JsonManagedReference
//    private Set<Reservation> reservations;

}
