package com.esad.ticketing.service.implementation;

import com.esad.ticketing.entity.Account;
import com.esad.ticketing.repository.AccountRepository;
import com.esad.ticketing.service.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public ResponseEntity<Boolean> LoginAccount(String email, String password, String type) {
        Optional<Account> account = accountRepository.findById(email);
        if(account.get().getPassword().equals(password)){
             return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }
}
