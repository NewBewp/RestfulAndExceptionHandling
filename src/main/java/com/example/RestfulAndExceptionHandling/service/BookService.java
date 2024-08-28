package com.example.RestfulAndExceptionHandling.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.RestfulAndExceptionHandling.model.BookEntity;
import com.example.RestfulAndExceptionHandling.repo.BookRepo;

@Service
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<BookEntity> getAllBooks() {
        return bookRepo.findAll();
    }

    public BookEntity createBook(BookEntity bookEntity) {
        BookEntity book = new BookEntity();
        book.setTitle(bookEntity.getTitle());
        book.setAuthor(bookEntity.getAuthor());
        return bookRepo.save(book);
    }

    public BookEntity getBookById(int id) {
        return bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
    }

    public BookEntity updateBook(int id, BookEntity bookEntity) {
        BookEntity book = getBookById(id);
        book.setTitle(bookEntity.getTitle());
        book.setAuthor(bookEntity.getAuthor());
        return bookRepo.save(book);
    }

    public void deleteBook(int id) {
        BookEntity book = getBookById(id);
        bookRepo.delete(book);
    }
}
