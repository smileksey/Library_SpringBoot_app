package smileksey.libraryspringbootapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smileksey.libraryspringbootapp.models.Book;

import java.util.Optional;


@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {

    Optional<Book> findBookByTitle(String title);

    Optional<Book> findBookByTitleStartingWith(String startingWith);

}
