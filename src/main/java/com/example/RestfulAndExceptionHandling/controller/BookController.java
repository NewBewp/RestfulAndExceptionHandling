package com.example.RestfulAndExceptionHandling.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestfulAndExceptionHandling.model.BookEntity;
import com.example.RestfulAndExceptionHandling.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<BookEntity> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping
    public BookEntity createBook(@RequestBody BookEntity bookEntity) {
        return bookService.createBook(bookEntity);
    }

    @GetMapping("/{id}")
    public BookEntity getBookById(@PathVariable int id) {
        return bookService.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookEntity updateBook(@PathVariable int id, @RequestBody BookEntity bookEntity) {
        return bookService.updateBook(id, bookEntity);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
