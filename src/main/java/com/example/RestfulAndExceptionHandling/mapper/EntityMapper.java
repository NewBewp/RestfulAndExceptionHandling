package com.example.RestfulAndExceptionHandling.mapper;

public interface EntityMapper <E, D>{
    E toEntity(D dto);
    D toDto(E entity);
    E updateEntity(D dto, E entity);
}
