package com.example.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(uniqueConstraints={@UniqueConstraint(name = "uk__staff_service__staff_id__service_id", columnNames = {"staff_id", "service_id"})})
@Entity
public class StaffService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName = "account_id", foreignKey = @ForeignKey(name = "fk__staff_service__staff_detail"), nullable = false)
    private StaffDetail staffDetail;

    @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__staff_service__service"), nullable = false)
    private Service service;

    @Basic(optional = false)
    @NotNull
    private Double price;

    @OneToMany(mappedBy = "staffService")
    private List<UserStaffServiceFavourite> favourites;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StaffDetail getStaffDetail() {
        return staffDetail;
    }

    public void setStaffDetail(StaffDetail staffDetail) {
        this.staffDetail = staffDetail;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public List<UserStaffServiceFavourite> getFavourites() {
        return favourites;
    }

    public void setFavourites(List<UserStaffServiceFavourite> favourites) {
        this.favourites = favourites;
    }
}
