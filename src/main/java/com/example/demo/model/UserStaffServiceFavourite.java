package com.example.demo.model;


import javax.persistence.*;

import com.example.demo.model.embedded.UserStaffServiceFavouriteKey;

@Entity
public class UserStaffServiceFavourite {
    @EmbeddedId
    private UserStaffServiceFavouriteKey id;

    @ManyToOne
    @MapsId("staff_service_id")
    @JoinColumn(name = "staff_service_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__user_staff_service_favourite__staff_service"), nullable = false)
    private StaffService staffService;

    @ManyToOne
    @MapsId("user_id")
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__user_staff_service_favourite__account"), nullable = false)
    private Account user;

    public UserStaffServiceFavouriteKey getId() {
        return id;
    }

    public void setId(UserStaffServiceFavouriteKey id) {
        this.id = id;
    }

    public StaffService getStaffService() {
        return staffService;
    }

    public void setStaffService(StaffService staffService) {
        this.staffService = staffService;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }
}
