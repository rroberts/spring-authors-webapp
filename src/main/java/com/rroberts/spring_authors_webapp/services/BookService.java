package com.rroberts.spring_authors_webapp.services;

import com.rroberts.spring_authors_webapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
