package com.example.application.views;

import com.example.application.data.entity.Survey;
import com.example.application.data.service.SurveyService;
import com.example.application.views.list.FirstSurveyForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.notification.NotificationVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route(value = "Survey") // <1>
@PageTitle("Survey | Vaadin CRM")

public class SurveyView extends VerticalLayout {
    private final SurveyService service;
    FirstSurveyForm form;

    public SurveyView(SurveyService service) { // <2>
        this.service = service;
        addClassName("survey-view");
        setDefaultHorizontalComponentAlignment(Alignment.CENTER); // <3>
        configureForm();
        add(getContent());

    }

    private void configureForm() {
        form = new FirstSurveyForm();
        form.setSurvey(new Survey());
        form.addSaveListener(this::saveSurvey); // <1>

    }

    private void saveSurvey(FirstSurveyForm.SaveEvent event) {
        Survey survey = event.getSurvey();

        service.createSurvey(survey);
        Notification notification = Notification
                .show("Thanks for taking the survey!.");
        notification.addThemeVariants(NotificationVariant.LUMO_SUCCESS);
        form.setSurvey(new Survey());
    }
    private HorizontalLayout getContent() {
        HorizontalLayout content = new HorizontalLayout( form);
        content.addClassNames("content");
        content.setSizeFull();
        return content;
    }


}