package com.addressclient.addressapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String name;

    @NotNull
    private String contact_number;

    @NotNull
    private Integer number; // house no, floor no, plot number...
    private String structure_name; // building name, society name, company name....

    @NotNull(message = "Street is mandatory")
    private String street;
    private String landmark;

    @NotNull
    private String city;

    @NotNull
    private Integer pincode;

    private String district;

    @NotNull
    private String state;

    @NotNull
    private String country;

    public Address() {
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_number() {
        return contact_number;
    }

    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStructure_name() {
        return structure_name;
    }

    public void setStructure_name(String structure_name) {
        this.structure_name = structure_name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [addressId=" + addressId + ", city=" + city + ", contact_number=" + contact_number
                + ", country=" + country + ", district=" + district + ", landmark=" + landmark + ", name=" + name
                + ", number=" + number + ", pincode=" + pincode + ", state=" + state + ", street=" + street
                + ", structure_name=" + structure_name + "]";
    }

}
