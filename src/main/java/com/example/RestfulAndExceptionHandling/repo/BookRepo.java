package com.example.RestfulAndExceptionHandling.repo;

import org.springframework.stereotype.Repository;
import com.example.RestfulAndExceptionHandling.model.BookEntity;

@Repository
public interface BookRepo extends BaseRepo<BookEntity, Integer> {

}