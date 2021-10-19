package com.esad.ticketing.repository;

import com.esad.ticketing.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
