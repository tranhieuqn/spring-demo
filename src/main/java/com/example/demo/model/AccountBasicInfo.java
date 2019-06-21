package com.example.demo.model;


import java.time.LocalDateTime;

import com.example.demo.model.enums.AccountRegisterStatus;
import com.example.demo.model.enums.AccountRole;

public interface AccountBasicInfo {
    Long getId();
    String getEmail();
    String getPassword();
    LocalDateTime getCreatedAt();
    LocalDateTime getUpdatedAt();
    AccountRole getRole();
    AccountRegisterStatus getRegisterStatus();
}
