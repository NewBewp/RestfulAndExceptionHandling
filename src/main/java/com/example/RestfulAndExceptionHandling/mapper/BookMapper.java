package com.example.RestfulAndExceptionHandling.mapper;

import com.example.RestfulAndExceptionHandling.dto.bookDTO.BookDTO;
import com.example.RestfulAndExceptionHandling.model.BookEntity;

public class BookMapper {

    public BookDTO toDTO(BookEntity entity) {
        BookDTO dto = new BookDTO();
        dto.setTitle(entity.getTitle());
        dto.setAuthor(entity.getAuthor());
        return dto;
    }
    
    public BookEntity toEntity(BookDTO dto) {
        BookEntity entity = new BookEntity();
        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        return entity;
    }
} 