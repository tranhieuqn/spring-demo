package com.example.demo.model.enums;

public enum AccountRole {
    USER, STAFF;

    public String fullName() {
        return "ROLE_" + name();
    }
}
