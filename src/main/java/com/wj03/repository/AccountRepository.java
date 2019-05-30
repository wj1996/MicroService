package com.wj03.repository;

import com.wj03.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account,Long> {


    public List<Account> findAll();
}
