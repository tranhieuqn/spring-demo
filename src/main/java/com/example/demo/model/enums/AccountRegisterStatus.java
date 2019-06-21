package com.example.demo.model.enums;

public enum AccountRegisterStatus {
    AWAITING_EMAIL_VERIFICATION("Account created but not email verified"),
    AWAITING_COMPLETE_CONFIRMATION("Account created but not phone number verified"),
    REGISTER_COMPLETED("Account has already finished register process");
    public final String desc;

    AccountRegisterStatus(String desc) {
        this.desc = desc;
    }
}
