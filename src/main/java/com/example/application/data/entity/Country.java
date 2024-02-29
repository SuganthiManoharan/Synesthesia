package com.example.application.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Country")
public class Country extends AbstractEntity{


    private String countryName;


    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }




}
