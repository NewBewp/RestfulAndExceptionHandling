package com.example.RestfulAndExceptionHandling.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RestfulAndExceptionHandling.dto.bookDTO.BookDTO;
import com.example.RestfulAndExceptionHandling.mapper.BookMapper;
import com.example.RestfulAndExceptionHandling.model.BookEntity;
import com.example.RestfulAndExceptionHandling.repo.BookRepo;



@Service
public class BookServiceImp extends BaseServiceImp<Integer, BookDTO, BookEntity> implements BookService {
    private final BookRepo bookRepo;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImp(BookRepo bookRepo, BookMapper bookMapper) {
        super(bookRepo, bookMapper,"Book");
        this.bookRepo = bookRepo;
        this.bookMapper = bookMapper;
    }

    @Override
    public BookDTO save(BookDTO dto) {
        return super.save(dto);
    }

    @Override
    public List<BookDTO> getAll() {
        return super.getAll();
    }

    @Override
    public BookDTO update(Integer id, BookDTO dto) {
        return super.update(id, dto);
    }

    @Override
    public BookDTO findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }
}
