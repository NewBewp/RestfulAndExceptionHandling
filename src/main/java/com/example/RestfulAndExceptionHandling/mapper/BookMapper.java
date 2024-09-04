package com.example.RestfulAndExceptionHandling.mapper;

import org.springframework.stereotype.Component;

import com.example.RestfulAndExceptionHandling.dto.bookDTO.BookDTO;
import com.example.RestfulAndExceptionHandling.model.BookEntity;

import io.micrometer.common.lang.Nullable;

@Component
public class BookMapper implements EntityMapper<BookEntity, BookDTO> {

    @Nullable
    public BookEntity toEntity(@Nullable BookDTO dto) {
        BookEntity entity = new BookEntity();
            
        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        return entity;
    }

    @Nullable
    public BookDTO toDto(@Nullable BookEntity entity) {
        if (entity == null)
            return null;
        BookDTO dto = new BookDTO();
        dto.setId(entity.getId());
        dto.setTitle(entity.getTitle());
        dto.setAuthor(entity.getAuthor());
        return dto;
    }

    @Override
    public BookEntity updateEntity(BookDTO dto, BookEntity entity) {
        entity.setTitle(dto.getTitle());
        entity.setAuthor(dto.getAuthor());
        return entity;
    }
}