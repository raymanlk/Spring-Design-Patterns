package com.esad.ticketing.controller;


import com.esad.ticketing.entity.Account;
import com.esad.ticketing.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/login/{email}/{password}/{type}")
    public ResponseEntity<Boolean> getLoginAccount(@PathVariable String email, @PathVariable String password,@PathVariable String type) {
        return accountService.LoginAccount(email,password,type);
    }
    

}
