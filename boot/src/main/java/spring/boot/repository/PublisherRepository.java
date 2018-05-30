package spring.boot.repository;

import org.springframework.data.repository.CrudRepository;
import spring.boot.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
