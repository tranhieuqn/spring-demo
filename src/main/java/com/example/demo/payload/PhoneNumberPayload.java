package com.example.demo.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PhoneNumberPayload {

    @NotNull
    private Long accountId;

    @NotBlank
    private String phoneNumber;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
