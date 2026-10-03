package com.pravudatta.javapractice.reactive;

public class Address {
    private String userId;
    private String city;
    private String zipCode;

    public Address(String userId, String city, String zipCode) {
        this.userId = userId;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "userId='" + userId + '\'' +
                ", city='" + city + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
