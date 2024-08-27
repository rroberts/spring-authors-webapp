package com.rroberts.spring_authors_webapp.repositories;

import com.rroberts.spring_authors_webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
