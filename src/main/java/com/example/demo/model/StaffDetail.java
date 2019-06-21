package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class StaffDetail {
    @Id
    @Column(name = "id")
    private Long id;

    @NotBlank
    @Basic(optional = false)
    private String expDesc;

    @NotNull
    @Basic(optional = false)
    private Integer exp;

    @OneToOne
    @MapsId
    @JoinColumn(name = "account_id", foreignKey = @ForeignKey(name = "fk__staff_detail__account"))
    private Account account;

    @OneToMany(mappedBy = "staffDetail")
    private List<StaffService> staffServices = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpDesc() {
        return expDesc;
    }

    public void setExpDesc(String expDesc) {
        this.expDesc = expDesc;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<StaffService> getStaffServices() {
        return staffServices;
    }

    public void setStaffServices(List<StaffService> staffServices) {
        this.staffServices = staffServices;
    }
}
