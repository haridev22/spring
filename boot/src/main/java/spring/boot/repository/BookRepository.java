package spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.model.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
