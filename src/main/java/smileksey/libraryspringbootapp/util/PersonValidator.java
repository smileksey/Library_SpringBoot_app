package smileksey.libraryspringbootapp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import smileksey.libraryspringbootapp.models.Person;
import smileksey.libraryspringbootapp.services.PeopleService;

@Component
public class PersonValidator implements Validator {

    private final PeopleService peopleService;

    @Autowired
    public PersonValidator(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Person person = (Person) target;

        if(peopleService.personIsPresent(person.getName(), person.getYearOfBirth())) {
            errors.rejectValue("name", "", "Человек с таким именем и годом рождения уже зарегистрирован");
        }
    }

}
