package com.rroberts.spring_authors_webapp.bootstrap;

import com.rroberts.spring_authors_webapp.domain.Author;
import com.rroberts.spring_authors_webapp.domain.Book;
import com.rroberts.spring_authors_webapp.repositories.AuthorRepository;
import com.rroberts.spring_authors_webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author jamieSaved = createAuthor("Jamie", "Metzyl");
        Author raySaved = createAuthor("Ray", "Kurzweil");

        Book superconvergence = createBook("Superconvergence", "123456");
        Book singularity = createBook("The Singularity is Near", "000000000");
        Book singularityNearer = createBook("The Singularity is Nearer", "1111111111");

        jamieSaved.getBooks().add(superconvergence);
        raySaved.getBooks().add(singularity);
        raySaved.getBooks().add(singularityNearer);

        superconvergence.getAuthors().add(jamieSaved);
        singularity.getAuthors().add(raySaved);
        singularityNearer.getAuthors().add(raySaved);

        bookRepository.save(superconvergence);
        bookRepository.save(singularity);
        bookRepository.save(singularityNearer);
        authorRepository.save(jamieSaved);
        authorRepository.save(raySaved);
    }

    private Author createAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorRepository.save(author);
    }

    private Book createBook(String title, String isbn) {
        Book book = new Book(title, isbn);
        return bookRepository.save(book);
    }
}
