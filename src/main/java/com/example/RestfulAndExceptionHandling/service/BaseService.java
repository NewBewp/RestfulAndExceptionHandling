package com.example.RestfulAndExceptionHandling.service;

import java.util.List;

public interface BaseService<I, D> {
    D save(D dto);
    D update(I id, D dto);
    List<D> getAll();
    D findById(I id);
    void delete(I id);
}