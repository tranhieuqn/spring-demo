package com.example.demo.repository.impl;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.response.AccountResponse;

public interface AccountRepositoryExtend {

    List<Account> search(AccountRole role);
    List<Account> searchCustom();
    List<AccountResponse> searchCustomResponse();

}
