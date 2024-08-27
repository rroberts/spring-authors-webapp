package com.rroberts.spring_authors_webapp.bootstrap;

import com.rroberts.spring_authors_webapp.domain.Author;
import com.rroberts.spring_authors_webapp.repositories.AuthorRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;

    public BootstrapData(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author jamieSaved = createAuthor("Jamie", "Metzyl");
        Author raySaved = createAuthor("Ray", "Kurzweil");
    }

    private Author createAuthor(String firstName, String lastName) {
        Author author = new Author();
        author.setFirstName(firstName);
        author.setLastName(lastName);
        return authorRepository.save(author);
    }
}
