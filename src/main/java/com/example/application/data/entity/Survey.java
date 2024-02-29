package com.example.application.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Survey")
public class Survey extends AbstractEntity{

    private static final long serialVersionUID = 1L;

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;
    private String countryName;

    private String yearOfBirth;

    private int musicId;

    private String genderOfComposer;

    private String genderOfPainter;

    private String emotion;

    private String tempo;

    private String genre;

    private String age;

    private String instruments;


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }




    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }


    public String getGenderOfComposer() {
        return genderOfComposer;
    }

    public void setGenderOfComposer(String genderOfComposer) {
        this.genderOfComposer = genderOfComposer;
    }

    public String getGenderOfPainter() {
        return genderOfPainter;
    }

    public void setGenderOfPainter(String genderOfPainter) {
        this.genderOfPainter = genderOfPainter;
    }

    public String getEmotion() {
        return emotion;
    }

    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

}
