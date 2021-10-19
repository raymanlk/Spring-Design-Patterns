package com.esad.ticketing.service.interfaces;

import com.esad.ticketing.entity.Account;
import org.springframework.http.ResponseEntity;

public interface AccountService {
    public ResponseEntity<Boolean> LoginAccount(String email, String password, String type);
}
