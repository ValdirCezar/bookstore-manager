package com.valdir.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valdir.bookstore.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
