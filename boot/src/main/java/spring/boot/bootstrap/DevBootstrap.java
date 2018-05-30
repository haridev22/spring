package spring.boot.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import spring.boot.model.Author;
import spring.boot.model.Book;
import spring.boot.model.Publisher;
import spring.boot.repository.AuthorRepository;
import spring.boot.repository.BookRepository;
import spring.boot.repository.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

    private void init(){
        Publisher hc = new Publisher();
        hc.setName("Harper Collins");
        Author eric = new Author("Eric","Evans");
        Book ddd = new Book("Domain Driven Design","1234",hc);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisherRepository.save(hc);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Publisher worx=new Publisher();
        worx.setName("Worx");
        Author rod = new Author("Rod","Johnson");
        Book noEjb = new Book("J2EE Development without EJB","23444",worx);
        rod.getBooks().add(noEjb);
        noEjb.getAuthors().add(rod);


        publisherRepository.save(worx);
        authorRepository.save(rod);
        bookRepository.save(noEjb);
    }
}
