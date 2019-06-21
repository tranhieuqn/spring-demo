package com.example.demo.repository.impl;

import java.util.List;

import com.example.demo.model.Account;
import com.example.demo.model.enums.AccountRole;

public interface AccountRepositoryExtend {

    List<Account> search(AccountRole role);
    List<Account> searchCustom();

}
