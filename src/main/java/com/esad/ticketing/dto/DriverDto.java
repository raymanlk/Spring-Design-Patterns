package com.esad.ticketing.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DriverDto {
    private String firstName;
    private String lastName;
    private String mobileNo;
    private String nic;
    private AccountDto account;
}
