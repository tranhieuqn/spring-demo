package com.example.demo.model.embedded;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserStaffServiceFavouriteKey implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "staff_service_id")
    private Long staffServiceId;

    @Column(name = "user_id")
    private Long userId;

    public Long getStaffServiceId() {
        return staffServiceId;
    }

    public void setStaffServiceId(Long staffServiceId) {
        this.staffServiceId = staffServiceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
