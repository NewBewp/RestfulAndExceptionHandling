package com.example.RestfulAndExceptionHandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RestfulAndExceptionHandling.dto.bookDTO.BookDTO;
import com.example.RestfulAndExceptionHandling.service.BookService;

@RestController
@RequestMapping("/api/books")

public class BookControllerImp extends BaseControllerImp<Integer, BookDTO> implements BookController {
    
    @Autowired
    public BookControllerImp(BookService service) {
        super(service);
    }
}
