package com.example.application.views.list;

import com.example.application.data.entity.Country;
import com.example.application.data.entity.Status;
import com.example.application.data.entity.Survey;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.ComponentEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.BeanValidationBinder;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.shared.Registration;

public class FirstSurveyForm extends FormLayout {
    TextField age = new TextField("When were you born?");

    ComboBox<Country> country = new ComboBox<>("What is your nationality?");

    TextField countryName = new TextField("What is your nationality?");

    TextField gender = new TextField("What is your Gender?");

    TextField tempo = new TextField("What do you think is the tempo/speed of this musical piece?");

    TextField instruments = new TextField("What instruments do you think are in this musical piece?");

    TextField countryOfOrigin = new TextField("From what part of the world do you think this musical piece originates?");

    TextField genre = new TextField("How would you describe the genre of this song?");

    TextField instrumental = new TextField("Is this piece of music with or without lyrics?");

    TextField emotion = new TextField("What emotions do you think this piece of music evokes?");

    TextField genderOfComposer = new TextField("What do you think is the gender of the composer of this musical piece?");

    TextField genderOfPainter = new TextField("What do you think is the gender of the painter of this art work?");

    Button save = new Button("Save");

    Binder<Survey> binder = new BeanValidationBinder<>(Survey.class);

    public FirstSurveyForm() {
        addClassName("survey-form");
        binder.bindInstanceFields(this);

        add(age,
                country,
                countryName,
                genre,
                gender,
                tempo,
                instruments,
                emotion,
                genderOfComposer,
                genderOfPainter,
                createButtonsLayout());

    }
    private Component createButtonsLayout() {
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        save.addClickShortcut(Key.ENTER);

        save.addClickListener(event -> validateAndSave()); // <1>

        binder.addStatusChangeListener(e -> save.setEnabled(binder.isValid())); // <4>

        return new HorizontalLayout(save);
    }

    private void validateAndSave() {
        if(binder.isValid()) {
            fireEvent(new SaveEvent(this, binder.getBean())); // <6>
        }
    }


    public void setSurvey(Survey survey) {

        binder.setBean(survey); // <1>
    }

    // Events


    public static class SaveEvent extends SurveyFormEvent {
        SaveEvent(FirstSurveyForm source, Survey survey) {

            super(source, survey);

        }
    }



    public Registration addSaveListener(ComponentEventListener<SaveEvent> listener) {
        return addListener(SaveEvent.class, listener);
    }

    public static abstract class SurveyFormEvent extends ComponentEvent<FirstSurveyForm> {
        private Survey survey;

        protected SurveyFormEvent(FirstSurveyForm source, Survey survey) {
            super(source, false);
            this.survey = survey;
        }

        public Survey getSurvey() {
            return survey;
        }
    }








}
