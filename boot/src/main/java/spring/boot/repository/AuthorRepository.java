package spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.model.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
