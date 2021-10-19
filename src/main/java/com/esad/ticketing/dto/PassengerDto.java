package com.esad.ticketing.dto;

import com.esad.ticketing.entity.Account;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String nic;
    private AccountDto account;

}
