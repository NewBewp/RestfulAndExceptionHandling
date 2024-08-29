package com.example.RestfulAndExceptionHandling.service;

import java.util.List;

public interface BaseService<I, D> {

    D create(I entity);

    D getById(int id);

    D update(I entity);

    void delete(int id);

    List<D> getAll();
}