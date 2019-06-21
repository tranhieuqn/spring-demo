package com.example.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.example.demo.model.enums.ServiceStatus;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "uk__service__name", columnNames = "name")})
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @NotBlank
    private String name;

    @Basic(optional = false)
    @NotBlank
    private String description;

    @Basic(optional = false)
    @NotNull
    private LocalDateTime createdAt = LocalDateTime.now();

    @Basic(optional = false)
    @NotNull
    private LocalDateTime updatedAt = LocalDateTime.now();

    @Basic(optional = false)
    @NotNull
    @Enumerated(EnumType.STRING)
    private ServiceStatus status;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private List<StaffService> staffServices;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ServiceStatus getStatus() {
        return status;
    }

    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    public List<StaffService> getStaffServices() {
        return staffServices;
    }

    public void setStaffServices(List<StaffService> staffServices) {
        this.staffServices = staffServices;
    }
}
