package smileksey.libraryspringbootapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smileksey.libraryspringbootapp.models.Person;

import java.util.Optional;


@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findPersonByNameAndYearOfBirth(String name, int yearOfBirth);

}
