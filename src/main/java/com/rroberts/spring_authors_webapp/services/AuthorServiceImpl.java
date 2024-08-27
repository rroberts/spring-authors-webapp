package com.rroberts.spring_authors_webapp.services;

import com.rroberts.spring_authors_webapp.domain.Author;
import com.rroberts.spring_authors_webapp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
