package com.example.application.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Ag")
public class YearofBirth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ageId;

    private String ageRange;

    public long getAgeId() {
        return ageId;
    }

    public void setAgeId(long ageId) {
        this.ageId = ageId;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }
}
