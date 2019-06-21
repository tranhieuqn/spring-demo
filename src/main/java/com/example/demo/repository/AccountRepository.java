package com.example.demo.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.example.demo.model.Account;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.repository.impl.AccountRepositoryExtend;

public interface AccountRepository extends JpaRepository<Account, Long>, QuerydslPredicateExecutor<Account>, AccountRepositoryExtend{

    Optional<Account> findByFirstName(String firstName);
    List<Account> findByDobGreaterThan(LocalDate compareDob);
    List<Account> findByRoleAndGender(AccountRole role, Gender gender);

    @Transactional
    @Modifying
    @Query("UPDATE Account acc SET acc.phoneNumber = :newPhoneNumber WHERE acc.id = :accountId")
    void updatePhoneNumber(Long accountId, String newPhoneNumber);
}
