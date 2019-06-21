package com.example.demo.controller;

import java.time.LocalDate;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Account;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.payload.PhoneNumberPayload;
import com.example.demo.repository.AccountRepository;

import io.swagger.annotations.Api;

@Api(tags = "Account")
@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/find/{account_id}")
    public Account findById(@PathVariable("account_id") Long accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    @GetMapping("/find/name/{first_name}")
    public Account findByName(@PathVariable("first_name") String firstName) {
        return accountRepository.findByFirstName(firstName).orElse(null);
    }

    @GetMapping("/find/dob/greater/{compare_dob}")
    public List<Account> findByDobGreaterThan(
            @PathVariable("compare_dob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate compareDob) {
        return accountRepository.findByDobGreaterThan(compareDob);
    }

    @GetMapping("/find/staff/female")
    public List<Account> findFemaleStaff() {
        return accountRepository.findByRoleAndGender(AccountRole.STAFF, Gender.FEMALE);
    }

    @PutMapping("/update/phone")
    public void updatePhoneNumber(@Valid @RequestBody PhoneNumberPayload payload) {
        accountRepository.updatePhoneNumber(payload.getAccountId(), payload.getPhoneNumber());
    }

    @GetMapping("/find/custom")
    public List<Account> searchAccountCustom(@RequestParam AccountRole role) {
        return accountRepository.searchCustom();
    }

}
