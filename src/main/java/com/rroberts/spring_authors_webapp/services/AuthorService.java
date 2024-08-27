package com.rroberts.spring_authors_webapp.services;

import com.rroberts.spring_authors_webapp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
