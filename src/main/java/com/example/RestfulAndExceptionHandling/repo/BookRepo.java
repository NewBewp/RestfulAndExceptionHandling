package com.example.RestfulAndExceptionHandling.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.RestfulAndExceptionHandling.model.BookEntity;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {

}