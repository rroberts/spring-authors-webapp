package com.rroberts.spring_authors_webapp.repositories;

import com.rroberts.spring_authors_webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
