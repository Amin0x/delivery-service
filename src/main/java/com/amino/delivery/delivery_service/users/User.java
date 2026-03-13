package com.amino.delivery.delivery_service.users;

import jakarta.persistence.*;

@Entity(name = "users")
public class User {
    @Id
    private String id;
    @Column(length = 50)
    private String name;
    @Column(nullable = false, unique = true, length = 200)
    private String email;
    @Column(nullable = false, unique = true, length = 50)
    private String phone;
    @Column(nullable = false, unique = true, length = 100)
    private String username;
    @Column(nullable = false, length = 255)
    private String password;
    @Column(nullable = false, length = 50)
    private String role;
    @Column(length = 50)
    private String status;
    @Column(length = 50)
    private String OTP;
    @Column(length = 50)
    private String OTPExpiryDate;
    private Integer OTPAttempts;
    @Column(nullable = false, length = 50)
    private String createdAt;
    @Column(nullable = false, length = 50)
    private String updatedAt;

    @OneToOne
    @JoinColumn(name = "user_location_id")
    private UserLocation userLocation;

    public UserLocation getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(UserLocation userLocation) {
        this.userLocation = userLocation;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getOTP() {
        return OTP;
    }

    public void setOTP(String OTP) {
        this.OTP = OTP;
    }

    public String getOTPExpiryDate() {
        return OTPExpiryDate;
    }

    public void setOTPExpiryDate(String OTPExpiryDate) {
        this.OTPExpiryDate = OTPExpiryDate;
    }

    public Integer getOTPAttempts() {
        return OTPAttempts;
    }

    public void setOTPAttempts(Integer OTPAttempts) {
        this.OTPAttempts = OTPAttempts;
    }
}
