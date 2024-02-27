package com.example.application.data.service;

import com.example.application.data.entity.Contact;
import com.example.application.data.entity.Survey;
import com.example.application.data.entity.User;
import com.example.application.data.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class SurveyService {

    @Autowired
    private  SurveyRepository surveyRepository;

    @Autowired
    private  CountryRepository countryRepository;

    public void createSurvey(Survey survey) {

        surveyRepository.save((Survey) survey);
    }




}
