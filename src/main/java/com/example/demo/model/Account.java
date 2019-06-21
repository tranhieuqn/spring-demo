package com.example.demo.model;

import com.example.demo.model.enums.AccountRegisterStatus;
import com.example.demo.model.enums.AccountRole;
import com.example.demo.model.enums.Gender;
import com.example.demo.model.enums.Transport;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(name = "uk__account__firebase_uid", columnNames = "firebase_uid")})
public class Account implements AccountBasicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic(optional = false)
    @Email(message = "Invalid email format")
    private String email;

    private String phoneNumber;

    @Basic(optional = false)
    @JsonIgnore
    private String password;

    @Basic(optional = false)
    @Enumerated(EnumType.STRING)
    private AccountRole role;

    private String firstName;

    private String lastName;

    private String fullName;

    private String kanjiName;

    private String furigana;

    private String nickname;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private LocalDate dob;

    private String address;

    @ManyToOne
    @JoinColumn(name = "district_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__account__district"))
    private StaticData district;

    @Pattern(regexp = "\\d{3}-\\d{4}", message = "")
    private String postalCode;

    private String placeNearBy;

    @ManyToOne
    @JoinColumn(name = "station_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk__account__station"))
    private StaticData metroNearBy;

    private Long timeToHome;

    @Enumerated(EnumType.STRING)
    private Transport transport;

    @Basic(optional = false)
    private LocalDateTime createdAt;

    @Basic(optional = false)
    private LocalDateTime updatedAt;

    @Basic(optional = false)
    @Column(name = "firebase_uid")
    @JsonIgnore
    private String firebaseUID;

    @JsonIgnore
    private LocalDateTime lastOptSentAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public AccountRole getRole() {
        return role;
    }

    public void setRole(AccountRole role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirebaseUID() {
        return firebaseUID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    public String getFurigana() {
        return furigana;
    }

    public void setFurigana(String furigana) {
        this.furigana = furigana;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StaticData getRegion() {
        return getCity() != null ? getCity().getParent() : null;
    }

    public void setRegion(String region) {
    }

    public StaticData getCity() {
        return getDistrict() != null ? getDistrict().getParent() : null;
    }

    public void setCity(String city) {
    }

    public StaticData getDistrict() {
        return district;
    }

    public void setDistrict(StaticData district) {
        this.district = district;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPlaceNearBy() {
        return placeNearBy;
    }

    public void setPlaceNearBy(String placeNearBy) {
        this.placeNearBy = placeNearBy;
    }

    public StaticData getMetroNearBy() {
        return metroNearBy;
    }

    public void setMetroNearBy(StaticData metroNearBy) {
        this.metroNearBy = metroNearBy;
    }

    public Long getTimeToHome() {
        return timeToHome;
    }

    public void setTimeToHome(Long timeToHome) {
        this.timeToHome = timeToHome;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setFirebaseUID(String firebaseUID) {
        this.firebaseUID = firebaseUID;
    }

    @JsonIgnore
    public AccountRegisterStatus getRegisterStatus() {
        return AccountRegisterStatus.REGISTER_COMPLETED;
    }

    public LocalDateTime getLastOptSentAt() {
        return lastOptSentAt;
    }

    public void setLastOptSentAt(LocalDateTime lastOptSentAt) {
        this.lastOptSentAt = lastOptSentAt;
    }
}
